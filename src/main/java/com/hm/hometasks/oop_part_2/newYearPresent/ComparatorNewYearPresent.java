/*
 * Класс сравнения
 */
package com.hm.hometasks.oop_part_2.newYearPresent;

import java.util.Comparator;

/**
 *
 * @author Osin Vladimir
 */
public class ComparatorNewYearPresent implements Comparator<Candy> {

    @Override
    public int compare(Candy c1, Candy c2) {
        return Double.compare(c1.getPrice(), c2.getPrice());
    }

}
