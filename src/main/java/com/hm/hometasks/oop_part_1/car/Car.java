/*
 * Супер класс машина
 */
package com.hm.hometasks.oop_part_1.car;

/**
 *
 * @author Osin Vladimir
 */
public class Car {
//определяем поля класса

    private int id;//ид
    private String marka;//марка
    private int model;//модель
    private int yearVypuska;//год выпуска
    private String color;//цвет
    private double price;//цена
    private int regNumber;//рег номер

//определяем конструкторы
public Car() {
    }

public Car(int id, String marka, int model, int yearVypuska, String color, double price, int regNumber) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.yearVypuska = yearVypuska;
        this.color = color;
        this.price = price;
        this.price = regNumber;
    }

public Car(int id, String marka, int model, int yearVypuska, String color) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.yearVypuska = yearVypuska;
        this.color = color;

    }

public Car(int id, String marka, int model) {
        this.id = id;
        this.marka = marka;
        this.model = model;
    }

//определяем геттеры и сеттеры
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getModel() {
        return model;
    }

    public void setYearVypuska(int yearVypuska) {
        this.yearVypuska = yearVypuska;
    }

    public int getYearVypuska() {
        return yearVypuska;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public int getRegNumber() {
        return regNumber;
    }

    @Override
    public String toString() {
        return "Автомобиль" + " " + "id =" + " " + id + " " + "Марка=" + marka + " " + "Модель=" + " " + model + " " + "Год выпуска =" + yearVypuska + " "
                + "Цвет=" + " " + color + " " + "Цена:" + " " + price + " Регистрационный номер=" + " "
                + regNumber;
    }

    public int countYearEkspl() {
        int currentYear = 2016;
        return currentYear - yearVypuska;
    }
}

