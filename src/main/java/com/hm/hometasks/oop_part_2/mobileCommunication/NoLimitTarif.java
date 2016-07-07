/*
 * Тариф безлимит
 */
package com.hm.hometasks.oop_part_2.mobileCommunication;

/**
 *
 * @author Osin Vladimir
 */
public class NoLimitTarif extends  Tarif {
    private final static String name = "Безлимит";
    NoLimitTarif( double price, int amountClient, double payCommunication, double priceMinute) {
        super(name,  price,  amountClient, payCommunication,  priceMinute);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
