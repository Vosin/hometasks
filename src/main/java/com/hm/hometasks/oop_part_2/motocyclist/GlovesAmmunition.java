/*
 * Класс перчатки
 */
package com.hm.hometasks.oop_part_2.motocyclist;

/**
 *
 * @author Osin Vladimir
 */
public class GlovesAmmunition extends Ammunition {
    private final static String name = "Перчатки";
    GlovesAmmunition(double weight, double price, String material) {
        super(name, weight,price,material);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
