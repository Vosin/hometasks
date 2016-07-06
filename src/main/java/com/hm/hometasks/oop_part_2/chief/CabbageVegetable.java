/*
 * Капуста овощ
 */
package com.hm.hometasks.oop_part_2.chief;

/**
 *
 * @author Osin Vladimir
 */
public class CabbageVegetable extends Vegetable {

    private final static String name = "Капуста";

    CabbageVegetable(double protein, double carbohydrates, double caloricValue, double carotin) {
        super(name, protein, carbohydrates, caloricValue,  carotin);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
