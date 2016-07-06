/*
 * Базовый класс конфета
 */
package com.hm.hometasks.oop_part_2.newYearPresent;

/**
 *
 * @author Osin Vladimir
 */
public class Candy {
    //определяем поля
    private String name;//название
    private double price;//цена
    private String type;//тип
    private int sugar;//содержание сахара
    private int weight;//вес

    //конструкторы
public Candy() {
    }

public Candy(String name, double price, String type, int sugar, int weight) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.sugar = sugar;
        this.weight = weight;
    }

public Candy(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
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

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getSugar() {
        return sugar;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Конфета:" + " " + name + " " + "Цена =" + price + " " + "Тип = " + " "
                + type + " " + "Содержание сахара =" + sugar + " " + "Вес=" + " " + weight;
    }

}

