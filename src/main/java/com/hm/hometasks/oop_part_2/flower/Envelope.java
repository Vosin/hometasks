/*
 * Класс наследник пленка
 */
package com.hm.hometasks.oop_part_2.flower;

/**
 *
 * @author Osin Vladimir
 */
public class Envelope extends Aksessuar {

    private final static String name = "Пленка";

    Envelope(double price, String type) {
        super(name, price, type);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
