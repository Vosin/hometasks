/*
 * Класс наследник налог с основного места работы
 */
package com.hm.hometasks.oop_part_2.taxes;

/**
 *
 * @author Osin Vladimir
 */
public class  IncomeMainPlaceTax extends Tax {
   private final static String name = "Налог с основного места работы";
     IncomeMainPlaceTax( double price, String view){
        super(name, price, view);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
