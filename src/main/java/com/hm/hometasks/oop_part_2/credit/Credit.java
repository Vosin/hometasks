/*
 * Базовый   класс кредит
 */
package com.hm.hometasks.oop_part_2.credit;

/**
 *
 * @author Osin Vladimir
 */
public class Credit {
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
