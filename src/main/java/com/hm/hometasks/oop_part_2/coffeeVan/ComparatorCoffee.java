/*
 * Класс для сравнения кофе
 */
package com.hm.hometasks.oop_part_2.coffeeVan;

import java.util.Comparator;

/**
 *
 * @author Osin Vladimir
 */
public class ComparatorCoffee implements Comparator<Coffee> {
    @Override
    public int compare(Coffee coffee1, Coffee coffee2) {
        return Double.compare(coffee1.getRatio(),coffee2.getRatio());
         
    }
}
