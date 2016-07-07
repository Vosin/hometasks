/*
 * Класс сравнения
 */
package com.hm.hometasks.oop_part_2.InsuranceLiabilities;

import java.util.Comparator;

/**
 *
 * @author Osin Vladimir
 */
public class ComparatorContract implements Comparator<Commitment> {

    @Override
    public int compare(Commitment commitment1, Commitment commitment2) {
        return Integer.compare(commitment2.getRisk(), commitment1.getRisk());
    }
}
