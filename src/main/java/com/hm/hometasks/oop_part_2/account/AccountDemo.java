/*
 * 16.  Счета .  Клиент   может   иметь   несколько   счетов   в  
 *  банке .  Учитывать   возможность  
 *  блокировки / разблокировки   счета .  Реализовать  
 *  поиск   и   сортировку   счетов .  Вычисление   общей   суммы  
 *  по   счетам .  Вычисление   суммы   по   всем   счетам , 
 *  имеющим   положительный   и   отрицательный   балансы  
 *  отдельно . 
 */
package com.hm.hometasks.oop_part_2.account;

import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class AccountDemo {
      public  void AccountInit() {
        Client client = createClient();
        System.out.println("Общиая сумма счетов = "+client.getAmount()+" "
       +"Сумма по положительному сальдо =  "+" "+client.getAmountPositivBalans()+" "
       +"Сумма по отрицательному сальдо =  "+" "+client.getAmountNegativBalans());        
        consolIO(client);
     }
     public static Client createClient(){
        Account current = new CurrentAccount(12000.00,1,1000);
        Account depozit = new DepozitAccount(100000.00,1,0);
        Account card = new CardAccount(0.00,0,-1000);
     
        //создаем клиенту счета
        Client client = new Client();
        client.addAccount(current);
        client.addAccount(depozit);
        client.addAccount(current);
        return client;
     }
     public static void consolIO(Client client){
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
            }System.out.println("Желаете продолжить: 1 -Да,0-Нет ");
            int contunue = Integer.parseInt(sc.next());
            if(contunue==1){
                end = false;
            }else{
                end = true;
            }
        }
    }

}
