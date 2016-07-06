/*
 * Класс сравнения
 */
package com.hm.hometasks.oop_part_2.homeDevice;

import java.util.Comparator;

/**
 *
 * @author Osin Vladimi
 */
public class ComparatorHomeDevice implements Comparator<HomeDevice> {

    @Override
    public int compare(HomeDevice h1, HomeDevice h2) {
        return Double.compare(h1.getPower(), h2.getPower());
    }

}

