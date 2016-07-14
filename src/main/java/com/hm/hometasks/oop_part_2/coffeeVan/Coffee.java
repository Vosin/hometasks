/*
 * Базовый класс кофе
 */
package com.hm.hometasks.oop_part_2.coffeeVan;

/**
 *
 * @author Osin Vladimir
 */
public class Coffee {
    //определяем поля
    private String name;//название
    private String sort;//сорт
    private String condition;//состояние
    private int weight;//вес кофе в граммах
    private double price;//цена за упаковку
    private String quality;//качество
    private double packading;//вес упаковки
    private double ratio;//соотношение цены к весу;
    
    //конструкторы
    public Coffee() {
    }

    public Coffee(String name, String sort, String condition, int weight, double price, String quality,double packading){
        this.name = name;
        this.sort = sort;
        this.condition = condition;
        this.weight = weight;
        this.price = price;
        this.quality = quality;
        this.packading = packading;
        }
    public Coffee(String name, String sort, String condition) {
        this.name = name;
        this.sort = sort;
        this.condition = condition;
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
     public void setSort(String sort) {
        this.sort = sort;
    }
    public String getSort() {
        return sort;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
    public String getCondition() {
        return condition;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public void setQuality(String quality) {
        this.quality = quality;
    }
    public String getQuality() {
        return quality;
    }
      public void setRatio(double price,int weight) {
        this.ratio = price/weight;
    }
    public double getRatio() {
        return ratio;
    }
    public void setPackading(double packading) {
        this.packading = packading;
    }
    public double getPackading() {
        return packading;
    }
    @Override
    public String toString() {
        return "Кофе" + " " + name + "  "+"Сорт =" +" "+ sort + " "
                + "Состояние=" + " " + condition +" " + "Вес в граммах c упаковкой:" + " "
                + weight+packading+" "+"Цена за упаковку= "+" "+price+" "+"Качество сорта= "+" "+quality;
    }
}

