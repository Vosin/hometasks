/*
 * 16.  Счета .  Клиент   может   иметь   несколько   счетов   в  
 *  банке .  Учитывать   возможность  
 *  блокировки / разблокировки   счета .  Реализовать  
 *  поиск   и   сортировку   счетов .  Вычисление   общей   суммы  
 *  по   счетам .  Вычисление   суммы   по   всем   счетам , 
 *  имеющим   положительный   и   отрицательный   балансы  
 *  отдельно . 
 */
package hometasks.task5.subtask_16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class AccountDemo {
      public static void main(String[] args) {
    
        Account current = new CurrentAccount(12000.00,1,1000);
        Account depozit = new DepozitAccount(100000.00,1,0);
        Account card = new CardAccount(0.00,0,-1000);
     
        //создаем клиенту счета
        Client client = new Client();
        client.addAccount(current);
        client.addAccount(depozit);
        client.addAccount(current);
            
       System.out.println("Общиая сумма счетов = "+client.getAmount()+" "
       +"Сумма по положительному сальдо =  "+" "+client.getAmountPositivBalans()+" "
       +"Сумма по отрицательному сальдо =  "+" "+client.getAmountNegativBalans());        
       Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Найти счет по статусу заблокирован разблокирован  нажмите   : 1 ");
            System.out.println("Для сортировки счетов по сумме нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        System.out.println("Введите 1-разблокирован.0-заблокирован ");
                        int r1 = Integer.parseInt(sc.next());
                        client.findAccount(r1);
                    }
                    break;
                    case 2: {
                        client.sortAccount();
                    }
                    break;
                    default: {
                        end = true;
                    }
                }
            } catch (Exception e) {
                end = true;
            }
        }
      
     }

}
//суперкласс счет
class Account {
    //определяем поля
    private String name;//название
    private double ammount;//сумма счете
    private int  status ;//состояние счета 1-разблокирован,0-заблокирован
    private double  balans ;//баланс счета 
    //конструкторы
    public Account() {
    }

    public Account(String name, double ammount, int status, double balans) {
        this.name = name;
        this.ammount = ammount;
        this.status = status;
        this.balans = balans;
    }
     public Account(String name, double ammount) {
        this.name = name;
        this.ammount = ammount;
    }
    
    //определяем геттеры и сеттеры
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }
      public double getAmmount() {
        return ammount;
    }
     public void setStatus(int status) {
        this.status = status;
    }
    public int getStatus() {
        return status;
    }
     public void setBalans(double balans) {
        this.balans = balans;
    }
    public double getBalans() {
        return balans;
    }
    @Override
    public String toString() {
        return "Счет" + " " + name + "  "+"Сумма =" +" "+ ammount + " "
        +"грн."+" "+"Статус=" + " " + status+" "+"Баланс счета= " +" "+balans;
    }
}
//классы наследники
class CurrentAccount extends Account {
   private final static String name = "Текущий счет";
     CurrentAccount(double ammount, int status, double balans){
        super(name, ammount, status, balans);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

class DepozitAccount extends Account {
   private final static String name = "Депозитный счет";
     DepozitAccount(double ammount, int status, double balans){
        super(name, ammount, status, balans);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class CardAccount extends Account {
   private final static String name = "Карточный счет";
     CardAccount(double ammount, int status, double balans){
        super(name, ammount, status, balans);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
//класс клиент
class Client{
     
    private double amount;//сумма всех счетов
    private double amountPositivBalans;//сумма всех счетов c положительным балансом
    private double amountNegativBalans;//сумма всех счетов c отриц балансом
  
    public double getAmount() {
        return amount ;
    }
    public double getAmountPositivBalans() {
        return amountPositivBalans ;
    }
     public double getAmountNegativBalans() {
        return amountNegativBalans ;
    }
    private ArrayList<Account> accounts = new ArrayList<Account>();
   //определяем массив счетов
    public Client addAccount(Account account) {
        accounts.add(account);
        amount += account.getAmmount();
        if(account.getBalans()>0){
        amountPositivBalans += account.getAmmount();   
        }else{
          amountNegativBalans += account.getAmmount(); 
        }
        return this;
    }
         
//сортировка счетов по сумме
    public void sortAccount() {

        Collections.sort(accounts, new MyComparator());

        for (int i = 0; i < accounts.size(); i++) {
            System.out.println(accounts.get(i).toString());
        }
    }
//найти счета у клиента
    public void findAccount(int status) {
        int flg = 0;
        for (int i = 0; i < accounts.size(); i++) {
              if (accounts.get(i).getStatus()== status) {
                System.out.println(accounts.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такого счета");
        }
    }

//класс использует интерфейс компаратор
class MyComparator implements Comparator<Account> {
    @Override
    public int compare(Account acc1, Account acc2) {
        return Double.compare(acc1.getAmmount(),acc2.getAmmount());
         
    }
}
}