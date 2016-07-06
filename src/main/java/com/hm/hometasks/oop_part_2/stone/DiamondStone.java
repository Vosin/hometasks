/*
 * Алмаз
 */
package com.hm.hometasks.oop_part_2.stone;

/**
 *
 * @author Osin Vladimir
 */
public class DiamondStone  extends Stone {

    private final static String name = "Алмаз";
    DiamondStone (double weight, double price, int transparency, int value) {
        super(name, weight, price, transparency, value);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

