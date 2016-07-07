/*
 * Кредит на покупку квартиры
 */
package com.hm.hometasks.oop_part_2.credit;

/**
 *
 * @author Osin Vladimir
 */
public class PayFlatCredit extends Credit {
   private final static String name = "Кредит на покупку квартиры";
     PayFlatCredit(double ammount, String bank, String refinans){
        super(name, ammount, bank, refinans);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
