/*
 * Класс наследник налог с продажи имущества
 */
package com.hm.hometasks.oop_part_2.taxes;

/**
 *
 * @author Osin Vladimir
 */
public class DispositionTax extends Tax {
   private final static String name = "Налог с продажи имущества";
        DispositionTax( double price, String view){
        super(name, price, view);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}