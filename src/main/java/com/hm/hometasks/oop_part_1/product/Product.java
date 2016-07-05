/*
 * Супер класс продукт
 */
package com.hm.hometasks.oop_part_1.product;

/**
 *
 * @author Osin Vladimir
 */
public class Product {
//определяем поля класса

    private int    id;//ид
    private String name;//имя
    private int    upc;//юпс
    private String company;//произволитель
    private double price;//цена
    private int    timeStorage;//в днях
    private int    count;//количество

//определяем конструкторы
 public Product() {
    }

public Product(int id, String name, int upc, String company, double price, int timeStorage, int count) {
        this.id          = id;
        this.name        = name;
        this.upc         = upc;
        this.company     = company;
        this.price       = price;
        this.timeStorage = timeStorage;
        this.count       = count;
    }

public Product(String name, int upc, String company) {
        this.name = name;
        this.upc = upc;
        this.company = company;

    }

public Product(String name, int upc, String company, double price) {
        this.name = name;
        this.upc = upc;
        this.company = company;
        this.price = price;

    }

//определяем геттеры и сеттеры
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUpc(int upc) {
        this.upc = upc;
    }

    public int getUpc() {
        return upc;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setTimeStorage(int timeStorage) {
        this.timeStorage = timeStorage;
    }

    public int getTimeStorage() {
        return timeStorage;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Продукт" + " " + "id =" + " " + id + " " + "Наименование=" + name + " " + "UPC=" + " "
                + upc + " " + "Производитель =" + company + " " + "Цена=" + " " + price + " " + "СрокХранения:" + " "
                + timeStorage + " Количество=" + " " + count;
    }

}
