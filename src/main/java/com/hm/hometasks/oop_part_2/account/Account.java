/*
 * Базовый класс счет
 */
package com.hm.hometasks.oop_part_2.account;

/**
 *
 * @author Osin Vladimir
 */
public class Account {
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

