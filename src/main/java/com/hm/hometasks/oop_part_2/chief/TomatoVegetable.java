/*
 * Помидор овощ
 */
package com.hm.hometasks.oop_part_2.chief;

/**
 *
 * @author Osin Vladimir
 */
public class TomatoVegetable extends Vegetable {

    private final static String name = "Томат";

   TomatoVegetable(double protein, double carbohydrates, double caloricValue, double carotin) {
        super(name, protein, carbohydrates, caloricValue,  carotin);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
