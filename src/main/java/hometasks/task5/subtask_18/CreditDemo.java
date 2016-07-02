/*
 * 18.  Кредиты .  Сформировать   набор   предложений  
 *  клиенту   по   целевым   кредитам   различных   банков   для  
 *  оптимального   выбора .  Учитывать   возможность  
 *  досрочного   погашения   кредита   и / или   увеличения  
 *  кредитной   линии .  Реализовать   выбор   и   поиск кредита 
 */
package hometasks.task5.subtask_18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Osin vladimir
 */
public class CreditDemo {
    public static void main(String[] args) {
     Credit payCar   = new PayCarCredit(500000.00,"Аваль","Да");
     Credit payCar1  = new PayCarCredit(50000.00,"Южный","Да");
     Credit payFlat  = new PayFlatCredit(1500000.00,"Аваль","Нет");
     Credit payFlat1 = new PayFlatCredit(255000.00,"Южный","Нет");
     Credit repair   = new RepairCredit(10000.00,"Приват","Нет");
     Credit repair1  = new RepairCredit(255000.00,"Южный","Нет");
     
     PropositionCredit propositionCredit = new PropositionCredit();
     propositionCredit.addCredit(payCar);
     propositionCredit.addCredit(payCar1);
     propositionCredit.addCredit(payFlat);
     propositionCredit.addCredit(payFlat1);
     propositionCredit.addCredit(repair);
     propositionCredit.addCredit(repair1);
  
     System.out.println(" Список всех кредитных предложений различных банков ");
     propositionCredit.printCredit();
     Scanner sc = new Scanner(System.in);
     boolean end = false;
     while (!end) {
            System.out.println("Для кредита выберите ");
            System.out.println("Кредит  на машину : 1 ");
            System.out.println("Кредит  на квартиру : 2 ");
            System.out.println("Кредит  на ремонт : 3 ");
     try {
            int result = Integer.parseInt(sc.next());
            propositionCredit.findCreditName(result);
     }catch (Exception e) {
                end = true;
            }
     
    }
    }
}
//суперкласс счет
class Credit {
    //определяем поля
    private String name;//название
    private double ammount;//сумма кредита
    private String  bank ;//банк
    private String refinans ;//увеличение или погашение кредита 
    //конструкторы
    public Credit() {
    }

    public Credit(String name, double ammount, String bank, String refinans) {
        this.name = name;
        this.ammount = ammount;
        this.bank = bank;
        this.refinans = refinans;
    }
  public Credit(String name, double ammount) {
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
     public void setBank(String bank) {
        this.bank = bank;
    }
    public String getBank() {
        return bank;
    }
     public void setRefinans(String refinans) {
        this.refinans = refinans;
    }
    public String getRefinans() {
        return refinans;
    }
    @Override
    public String toString() {
        return "Кредит" + " " + name + "  "+"Сумма =" +" "+ ammount + " "
        +"грн."+" "+"Банк=" + " " + bank+" "+"Возможность пополения или досрочного погашения  = " +" "
        +refinans;
    }
}
//классы наследники
class PayCarCredit extends Credit {
   private final static String name = "Кредит на покупку машины";
     PayCarCredit(double ammount, String bank, String refinans){
        super(name, ammount, bank, refinans);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

class PayFlatCredit extends Credit {
   private final static String name = "Кредит на покупку квартиры";
     PayFlatCredit(double ammount, String bank, String refinans){
        super(name, ammount, bank, refinans);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class RepairCredit extends Credit {
    private final static String name = "Кредит на ремонт квартиры";
     RepairCredit(double ammount, String bank, String refinans){
        super(name, ammount, bank, refinans);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
//класс предложение
class PropositionCredit{
     
    private ArrayList<Credit> credits = new ArrayList<Credit>();
   //определяем предложение
     public PropositionCredit addCredit(Credit credit) {
        credits.add(credit);
        return this;
    }
  //найти кредит по наименованию
  public void findCreditName(int name) {
        String result;
        switch (name) {
            case 1: {
                result = "Кредит на покупку машины";
            }
            break;
            case 2: {
                result = "Кредит на покупку квартиры";
            }
            break;
            case 3: {
                result = "Кредит на ремонт квартиры";
            }
            break;
            default: {
                result = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < credits.size(); i++) {
              if (credits.get(i).getName().equals(result)) {
                System.out.println(credits.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такого кредита");
        }
    } 
  public void printCredit() {
    for (int i = 0; i < credits.size(); i++) {
        System.out.println(credits.get(i).toString());
}
}
}
    

