/*
 * Класс наследник машинка игрушка
 */
package com.hm.hometasks.oop_part_2.gameRoom;

/**
 *
 * @author Osin Vladimir
 */
public class CarToy extends Toy {
   private final static String name = "Машина";
     CarToy(double price, String size, int ageGroup, double weight, String quality, String material){
        super(name, price, size, ageGroup, weight, quality, material);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
