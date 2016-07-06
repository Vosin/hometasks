/*
 * Класс сапоги
 */
package com.hm.hometasks.oop_part_2.motocyclist;

/**
 *
 * @author Osin Vladimir
 */
public class BootsAmmunition extends  Ammunition {
    private final static String name = "Сапоги";
    BootsAmmunition(double weight, double price, String material) {
        super(name, weight,price,material);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
