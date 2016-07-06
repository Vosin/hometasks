/*
 * Суперкласс цветок
 */
package com.hm.hometasks.oop_part_2.flower;
/**
 *
 * @authorOsin Vladimir
 */
// базовый класс цветок

public class Flower {
//определяем поля

    private String name;//название
    private double price;//цена
    private int levelFresh;//уровень свежести
    private int stemLength;//длина стебля
    //конструкторы

public Flower() {
    }

public Flower(String name, double price, int levelFresh, int stemLength) {
        this.name = name;
        this.price = price;
        this.levelFresh = levelFresh;
        this.stemLength = stemLength;
    }

public Flower(String name, double price) {
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

    public void setLevelFresh(int levelFresh) {
        this.levelFresh = levelFresh;
    }

    public int getLevelFresh() {
        return levelFresh;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    public int getStemLength() {
        return stemLength;
    }

    @Override
    public String toString() {
        return "Цветок:" + " " + name + " " + "Цена =" + price + " " + "Уровень свежести=" + " "
                + levelFresh + " " + "Длина стебля =" + stemLength;
    }

}
