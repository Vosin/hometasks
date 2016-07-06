/*
 * Морковь Овощ
 */
package com.hm.hometasks.oop_part_2.chief;

/**
 *
 * @author Osin Vladimir
 */
public class CarrotVegetable extends Vegetable {

    private final static String name = "Морковь";

  CarrotVegetable(double protein, double carbohydrates, double caloricValue, double carotin) {
        super(name, protein, carbohydrates, caloricValue,  carotin);
    }
    

    @Override
    public String toString() {
        return super.toString();
    }
}
