/*
 * Класс наследник Блейзер
 */
package com.hm.hometasks.oop_part_2.coffeeVan;

/**
 *
 * @author Osin Vladimir
 */
public class BlaserCoffee extends  Coffee {
    private final static String name = "Блейзер";
     BlaserCoffee(String sort, String condition, int weight, double price, String quality,int weightUp) {
        super(name, sort, condition, weight, price, quality,weightUp);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
