/*
 * Агат
 */
package com.hm.hometasks.oop_part_2.stone;

/**
 *
 * @author Osin Vladimir
 */
public class AgateStone extends Stone {
    private final static String name = "Агат";
    AgateStone(double weight, double price, int transparency, int value) {
        super(name, weight, price, transparency, value);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
