/*
 * Рубин
 */
package com.hm.hometasks.oop_part_2.stone;

/**
 *
 * @author Osin Vladimir
 */
public class RubyStone extends Stone {
   private final static String name = "Рубин";
    RubyStone(double weight, double price, int transparency, int value) {
        super(name, weight, price, transparency, value);
    }
     @Override
    public String toString() {
        return super.toString();
    }
}
