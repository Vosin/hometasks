/*
 * Класс овощ
 */
package com.hm.hometasks.oop_part_2.chief;

/**
 *
 * @author Osin Vladimir
 */
public class Vegetable {
    //определяем поля

    private String name;//название
    private double protein;//белок
    private double carbohydrates;//углеводы
    private double caloricValue;//калорийность
    private double carotin;//каротин
    

    //конструкторы
   public Vegetable() {
    }

    public Vegetable(String name, double protein, double carbohydrates, double caloricValue, double carotin) {
        this.name = name;
        this.protein = protein;
        this.carbohydrates = carbohydrates;
        this.caloricValue = caloricValue;
        this.carotin = carotin;
    }

    public Vegetable(String name, double caloricValue) {
        this.name = name;
        this.caloricValue = caloricValue;
    }

    //определяем геттеры и сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getProtein() {
        return protein;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCaloricValue(double caloricValue) {
        this.caloricValue = caloricValue;
    }

    public double getCaloricValue() {
        return caloricValue;
    }
    
    public void setCarotin(double carotin) {
        this.carotin = carotin;
    }

    public double getCarotin() {
        return carotin;
    }
    @Override
    public String toString() {
        return "Овощь:" + " " + name + " " + "Белки =" + protein + " " + "Углеводы = " + " "
                + carbohydrates + " " + "Количество калорий =" + caloricValue +" "+"Каротин ="+" "+carotin;
    }

}

