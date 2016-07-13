/*
 * Класс сельдерей наследник овощ
 */
package com.hm.hometasks.oop_part_3.peellable;

/**
 *
 * @author Osin Vladimir
 */
public class Celery extends Vegetable {
      
    private final static String name = "Сельдерей";

    public Celery (double weight,String color,String maturity,String condition,boolean cleaning) {
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

