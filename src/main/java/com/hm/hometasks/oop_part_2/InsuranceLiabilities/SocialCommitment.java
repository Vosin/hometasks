/*
 * Класс наследник социальное страхование
 */
package com.hm.hometasks.oop_part_2.InsuranceLiabilities;

/**
 *
 * @author Osin Vladimir
 */
public class SocialCommitment extends Commitment {

    private final static String name = "Социальное";

    SocialCommitment(double price, int risk, int amountСontribution, String fullName) {
        super(name, price, risk, amountСontribution, fullName);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
