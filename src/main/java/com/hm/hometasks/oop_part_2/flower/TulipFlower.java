/*
 * Класс Тюльпан
 */
package com.hm.hometasks.oop_part_2.flower;

/**
 *
 * @author Osin Vladimir
 */
public class TulipFlower extends Flower {

    private final static String name = "Тюльпан";

    TulipFlower(double price, int levelFresh, int stemLength) {
        super(name, price, levelFresh, stemLength);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
