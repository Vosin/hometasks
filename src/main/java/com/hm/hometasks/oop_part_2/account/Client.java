/*
 * Класс клиент
 */
package com.hm.hometasks.oop_part_2.account;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Osin Vladimir
 */
public class Client{
     
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

        Collections.sort(accounts, new ComparatorClient());

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
}