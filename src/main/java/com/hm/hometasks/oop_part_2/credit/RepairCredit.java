/*
 * Кредит на ремонт квартиры
 */
package com.hm.hometasks.oop_part_2.credit;

/**
 *
 * @author Osin Vladimir
 */
public class RepairCredit extends Credit {
    private final static String name = "Кредит на ремонт квартиры";
     RepairCredit(double ammount, String bank, String refinans){
        super(name, ammount, bank, refinans);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
