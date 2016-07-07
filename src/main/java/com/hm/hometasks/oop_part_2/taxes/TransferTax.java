/*
 * Класс наследник налог с перевода из за границы
 */
package com.hm.hometasks.oop_part_2.taxes;

/**
 *
 * @author Osin Vladimir
 */
public class TransferTax extends Tax {
   private final static String name = "Налог с перевода из за границы";
        TransferTax( double price, String view){
        super(name, price, view);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
