/*
 * класс Роза
 */
package com.hm.hometasks.oop_part_2.flower;

/**
 *
 * @author vplpdka
 */
public class RoseFlower extends Flower {

    private final static String name = "Роза";

    RoseFlower(double price, int levelFresh, int stemLength) {
        super(name, price, levelFresh, stemLength);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
