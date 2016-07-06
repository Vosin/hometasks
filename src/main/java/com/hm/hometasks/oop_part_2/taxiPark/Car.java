/*
 * Класс авто
 */
package com.hm.hometasks.oop_part_2.taxiPark;

/**
 *
 * @author Osin Vladimir
 */
public class Car {
    //определяем поля
    private String name;//название
    private double price;//стоимость
    private int speed;//скорость
    private int amountFuel;//расход топлива
    //конструкторы
    public Car() {
    }
    public Car(String name, double price, int speed, int amountFuel) {
        this.name = name;
        this.price = price;
        this.speed = speed;
        this.amountFuel = amountFuel;
    }
    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    //определяем геттеры и сеттеры
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
      public double getPrice() {
        return price;
    }
     public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
    public void setAmountFuel(int amountFuel) {
        this.amountFuel = amountFuel;
    }
    public int getAmountFuel() {
        return amountFuel;
    }
   
    @Override
    public String toString() {
        return "Авто" + " " + name + "  "+"Цена =" +" "+ price + " "
                + "Скорость=" + " " + speed + "км/ч "+" " + "Расход топлива:" + " "
                + amountFuel+" "+"л"+" "+"на 100 км ";
    }
}
