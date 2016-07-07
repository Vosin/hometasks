/*
 * Класс сравнения клиентов
 */
package com.hm.hometasks.oop_part_2.account;

import java.util.Comparator;

/**
 *
 * @author Osin Vladimir
 */
public class ComparatorClient implements Comparator<Account> {
    @Override
    public int compare(Account acc1, Account acc2) {
        return Double.compare(acc1.getAmmount(),acc2.getAmmount());
         
    }
}
    

