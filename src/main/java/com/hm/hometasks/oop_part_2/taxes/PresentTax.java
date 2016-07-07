/*
 * Класс наследник с получения в подарок денежных сумм и имущества
 */
package com.hm.hometasks.oop_part_2.taxes;

/**
 *
 * @author Osin Vladimir
 */
public class PresentTax extends Tax {
   private final static String name = "Налог с получения в подарок денежных сумм и имущества";
        PresentTax( double price, String view){
        super(name, price, view);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
