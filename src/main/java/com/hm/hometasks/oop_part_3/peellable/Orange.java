/*
 * Класс Апельсин наследник фрукт
 */
package com.hm.hometasks.oop_part_3.peellable;

/**
 *
 * @author Osin Vladimir
 */
public class Orange extends Fruit {
      
    private final static String name = "Апельсин";

    public Orange(double weight,String color,String maturity,String condition,boolean cleaning) {
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
