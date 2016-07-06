/*
 * МотоКостюм
 */
package com.hm.hometasks.oop_part_2.motocyclist;

/**
 *
 * @author Osin Vladimir
 */
public class SuitAmmunition extends Ammunition {
   private final static String name = "МотоКостюм";
     SuitAmmunition(double weight, double price, String material) {
        super(name, weight,price,material);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
