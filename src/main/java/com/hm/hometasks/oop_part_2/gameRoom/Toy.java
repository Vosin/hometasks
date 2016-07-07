/*
 * Базовый класс игрушка
 */
package com.hm.hometasks.oop_part_2.gameRoom;

/**
 *
 * @author Osin Vladimir
 */
public class Toy {
    //определяем поля
    private String name;//название
    private double price;//цена 
    private String size;//размер игрушки
    private int ageGroup;//возрастная группа
    private double weight;//вес игрушки в граммах
    private String quality;//качество
    private String material;//материал игрушки 
    
    //конструкторы
    public Toy() {
    }

    public Toy(String name, double price, String size, int ageGroup, double weight, String quality, String material) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.ageGroup = ageGroup;
        this.weight = weight;
        this.quality = quality;
        this.material = material;
    }
     public Toy(String name, double price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
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
     public void setSize(String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }
    public void setAgeGroup(int ageGroup) {
        this.ageGroup = ageGroup;
    }
    public int getAgeGroup() {
        return ageGroup;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public void setQuality(String quality) {
        this.quality = quality;
    }
    public String getQuality() {
        return quality;
    }
     public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }
    @Override
    public String toString() {
        return "Игрушка" + " " + name + "  "+"Цена =" +" "+ price + " "
        +"грн."+" "+"Размер=" + " " + size +" " + "Для возрастной группы:" + " "
        + ageGroup+" "+"лет"+" "+"Вес= "+" "+weight+" "+"Качество= "+" "+quality+" "
        +"Материал изготовления="+" "+material;
    }
}

