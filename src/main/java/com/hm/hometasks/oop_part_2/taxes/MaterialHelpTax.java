/*
 * Налог с мат помощи
 */
package com.hm.hometasks.oop_part_2.taxes;

/**
 *
 * @author Osin Vladimir
 */
public class MaterialHelpTax extends Tax {
   private final static String name = "Налог с мат. помощи";
        MaterialHelpTax( double price, String view){
        super(name, price, view);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
