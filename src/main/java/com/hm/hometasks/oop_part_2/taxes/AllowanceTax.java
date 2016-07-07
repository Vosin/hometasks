/*
 * Налог на льготы на детей
 */
package com.hm.hometasks.oop_part_2.taxes;

/**
 *
 * @author Osin Vladimir
 */
public class AllowanceTax extends Tax {
   private final static String name = "Налог с льготы на детей";
        AllowanceTax( double price, String view){
        super(name, price, view);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
