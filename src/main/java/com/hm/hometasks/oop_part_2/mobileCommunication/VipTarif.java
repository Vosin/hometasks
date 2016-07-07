/*
 * Вип тариф наследник класс
 */
package com.hm.hometasks.oop_part_2.mobileCommunication;

/**
 *
 * @author Osin Vladimir
 */
public class VipTarif extends Tarif {
   private final static String name = "Вип";
      VipTarif( double price, int amountClient, double payCommunication, double priceMinute) {
        super(name,  price,  amountClient, payCommunication,  priceMinute);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}