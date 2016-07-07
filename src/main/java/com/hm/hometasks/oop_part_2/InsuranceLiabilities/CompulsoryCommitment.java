/*
 * Класс наследник Обязательное страхование
 */
package com.hm.hometasks.oop_part_2.InsuranceLiabilities;

/**
 *
 * @author Osin Vladimir
 */
public class CompulsoryCommitment extends  Commitment {
    private final static String name = "Обязательное";
    CompulsoryCommitment(double price, int risk, int amountСontribution, String fullName) {
        super(name,price,risk, amountСontribution, fullName);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
