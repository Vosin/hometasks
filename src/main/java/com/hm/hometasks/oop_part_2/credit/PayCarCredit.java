/*
 * Кредит на покупку машины
 */
package com.hm.hometasks.oop_part_2.credit;

/**
 *
 * @author Osin Vladimir
 */
public class PayCarCredit extends Credit {
   private final static String name = "Кредит на покупку машины";
     PayCarCredit(double ammount, String bank, String refinans){
        super(name, ammount, bank, refinans);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
