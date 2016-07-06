/*
 * Аммуниция класс
 */
package com.hm.hometasks.oop_part_2.motocyclist;

/**
 *
 * @author Osin Vladimir
 */
public class Ammunition {
    //определяем поля

    private String name;//название
    private double weight;//вес
    private double price;//цена
    private String material;//материал
   
    //конструкторы
public Ammunition() {
    }

public Ammunition(String name, double weight, double price, String material) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.material = material;
    }
public Ammunition(String name, double price) {
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

    public void setMaterial(String material) {
        this.material= material;
    }

    public String getMaterial() {
        return material;
    }
        
    
    @Override
    public String toString() {
        return "Аммуниция:" + " " + name + " " + "Вес =" + weight + " " + "Цена = " + " "
                + price+ " " + "Материал =" +material ;
    }

}

