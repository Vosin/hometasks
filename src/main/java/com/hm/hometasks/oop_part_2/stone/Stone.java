/*
 * Класс камень
 */
package com.hm.hometasks.oop_part_2.stone;

/**
 *
 * @author Osin Vladimir
 */
public class Stone {
    //определяем поля

    private String name;//название
    private double weight;//вес
    private double price;//цена
    private int transparency;//прозрачность
    private int value;//ценность драгоценный -1, полу-2  

    //конструкторы
public Stone() {
    }

    public Stone(String name, double weight, double price, int transparency, int value) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.transparency = transparency;
        this.value = value;
    }

    public Stone(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
       
    }

    //определяем геттеры и сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setTransparency(int transparency) {
        this.transparency = transparency;
    }

    public int getTransparency() {
        return transparency;
    }
     public void setValue(int value) {
        this.transparency = value;
    }

    public int getValue() {
        return value;
    }
    
    
    @Override
    public String toString() {
        return "Камень:" + " " + name + " " + "Вес =" + weight + " " + "Цена = " + " "
                + price+ " " + "Прозрачность =" +transparency + " " + "Ценность =" +value ;
    }

}

