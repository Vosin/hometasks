/*
 * Базовый класс путевка
 */
package com.hm.hometasks.oop_part_2.tourPackages;

/**
 *
 * @author Osin Vladimir
 */
public class  TourPackage {
    //определяем поля
    private String name;//название
    private double ammount;//сумма путевки
    private String  typeFood ;//тип питания
    private int numberDays ;//количество дней 
    private String transfer ;//доставка
    private String  country ;//страна
    
    
    //конструкторы
    public TourPackage() {
    }

    public TourPackage(String name, double ammount, String typeFood, int numberDays, String transfer, String country) {
        this.name = name;
        this.ammount = ammount;
        this.typeFood = typeFood;
        this.numberDays = numberDays;
        this.transfer = transfer;
        this.country = country;
    }
    public TourPackage(String name, double ammount, String country) {
        this.name = name;
        this.ammount = ammount;
        this.country = country;
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
     public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }
    public String getTypeFood() {
        return typeFood;
    }
     public void setNumberDays(int numberDays) {
        this.numberDays = numberDays;
    }
    public double getNumberDays() {
        return numberDays;
    }
     public void setTransfer(String transfer) {
        this.transfer = transfer;
    }
    public String getTransfer() {
        return transfer;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCountry() {
        return country;
    }
    @Override
    public String toString() {
        return "Путевка" + " " + name + "  "+"Сумма =" +" "+ ammount + " "
        +"грн."+" "+"Тип питания=" + " " + typeFood+" "+"Количество дней = " +" "
        +numberDays+" "+"Доставка=" + " " +transfer+" "+"Страна=" + " " + country;
    }
}

