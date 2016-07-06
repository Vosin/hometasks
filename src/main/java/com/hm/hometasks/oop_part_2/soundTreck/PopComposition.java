/*
 * Поп композиция
 */
package com.hm.hometasks.oop_part_2.soundTreck;

/**
 *
 * @author Osin Vladimir
 */
public  class PopComposition extends Composition {

    private final static String name = "Популярная";

    PopComposition (int duration, int style, int trackLength) {
        super(name, duration, style, trackLength);
    }
    

    @Override
    public String toString() {
        return super.toString();
    }
}  

