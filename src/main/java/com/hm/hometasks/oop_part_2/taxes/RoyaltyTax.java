/*
 * Класс наследник налог с авторского вознаграждения
 */
package com.hm.hometasks.oop_part_2.taxes;

/**
 *
 * @author Osin Vladimir
 */
public class RoyaltyTax extends Tax  {
   private final static String name = "Налог с авторского вознаграждения";
        RoyaltyTax( double price, String view){
        super(name, price, view);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
