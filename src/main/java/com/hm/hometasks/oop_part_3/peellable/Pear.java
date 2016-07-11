/*
 * Класс наследник груша
 */
package com.hm.hometasks.oop_part_3.peellable;

/**
 *
 * @author Osin Vladimir
 */
public class Pear extends Fruit implements Peellable{
      
    private final static String name = "Груша";

    public Pear(double weight,String color,String maturity,String condition,boolean cleaning) {
        super(name, weight, color, maturity,condition,cleaning);
    }
    @Override
    public String toString() {
        return super.toString();
    }
     
    
}
