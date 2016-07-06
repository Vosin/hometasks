/*
 * Класс Лада
 */
package com.hm.hometasks.oop_part_2.taxiPark;

/**
 *
 * @author Osin Vladimir
 */
public class LadaCar extends Car {
   private final static String name = "Лада";
     LadaCar(double price, int speed, int amountFuel) {
        super(name,price,speed,amountFuel);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
