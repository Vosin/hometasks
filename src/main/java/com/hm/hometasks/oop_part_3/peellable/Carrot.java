/*
 * Класс морковь наследник овоща
 */
package com.hm.hometasks.oop_part_3.peellable;

/**
 *
 * @author Osin Vladimir
 */
public class Carrot extends Vegetable {
      
    private final static String name = "Морковь";

    public Carrot(double weight,String color,String maturity,String condition,boolean cleaning) {
        super(name, weight, color, maturity,condition,cleaning);
    }
    @Override
    public String toString() {
        return super.toString();
    }
    @Override
     public void peell(){
         super.peell();
    }
}

