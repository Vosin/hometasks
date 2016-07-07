/*
 * Класс Фургон кофе
 */
package com.hm.hometasks.oop_part_2.coffeeVan;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Osin Vladimir
 */
public class CoffeeVan{
      
    private final static int WEIGHT_FULL = 12000;//вес фургона определен полностью с грузом кг
    private double weight; //вес фургона  
    private double price;//стоимость фургона с кофе
      
    public double getPrice() {
        return price ;
    }
    public double getWeight() {
        return weight ;
    }
   
    private ArrayList<Coffee> coffees = new ArrayList<Coffee>();
   //заполняем фургон кофе
    public CoffeeVan addCoffee(Coffee coffee) {
        weight +=coffee.getWeight()+coffee.getWeightUp();
        if(weight< WEIGHT_FULL){
        coffees.add(coffee);
        price += coffee.getPrice();
        }else{
            System.out.println("Превышен обьем фургона!!");
        }
        return this;
    }
//сортировка товара на основе цены и веса
    public void sortCoffee() {

        Collections.sort(coffees, new ComparatorCoffee());

        for (int i = 0; i < coffees.size(); i++) {
            System.out.println(coffees.get(i).toString());
        }
    }
//найти кофе по качеству
    public void findCoffee(int quality) {
        String result;
        switch (quality) {
            case 1: {
                result = "Высший";
            }
            break;
            case 2: {
                result = "Первый";
            }
            break;
            case 3: {
                result = "Второй";
            }
            break;
            default: {
                result = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < coffees.size(); i++) {
            if (coffees.get(i).getQuality().equals(result)) {
                   System.out.println(coffees.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такого кофе");
        }
    }
}

