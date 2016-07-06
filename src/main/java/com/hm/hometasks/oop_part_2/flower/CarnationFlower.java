/*
 * класс гвоздика
 */
package com.hm.hometasks.oop_part_2.flower;

/**
 *
 * @author Osin Vladimir
 */

public class CarnationFlower extends Flower {

    private final static String name = "Гвоздика";

    CarnationFlower(double price, int levelFresh, int stemLength) {
        super(name, price, levelFresh, stemLength);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
