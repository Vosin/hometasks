/*
 * Текущий счет
 */
package com.hm.hometasks.oop_part_2.account;

/**
 *
 * @author Osin Vladimir
 */
public class CurrentAccount extends Account {

    private final static String name = "Текущий счет";

    CurrentAccount(double ammount, int status, double balans) {
        super(name, ammount, status, balans);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
