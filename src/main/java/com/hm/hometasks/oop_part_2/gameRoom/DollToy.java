/*
 * Класс наследник Кукла
 */
package com.hm.hometasks.oop_part_2.gameRoom;

/**
 *
 * @author Osin Vladimir
 */
public class DollToy extends  Toy {
    private final static String name = "Кукла";
       DollToy(double price, String size, int ageGroup, double weight, String quality, String material){
        super(name, price, size, ageGroup, weight, quality, material);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
