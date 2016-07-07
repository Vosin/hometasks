/*
 * Класс наследник налог с доп места работы
 */
package com.hm.hometasks.oop_part_2.taxes;

/**
 *
 * @author Osin Vladimir
 */
public class IncomeAdditionalPlaceTax extends  Tax {
    private final static String name = "Налог с дополнительного места работы";
        IncomeAdditionalPlaceTax( double price, String view){
        super(name, price, view);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
