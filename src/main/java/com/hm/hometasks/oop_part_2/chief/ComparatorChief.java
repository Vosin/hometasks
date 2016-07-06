/*
 * Класс сравнения
 */
package com.hm.hometasks.oop_part_2.chief;

import java.util.Comparator;

/**
 *
 * @authorOsin Vladimir
 */
public class ComparatorChief implements Comparator<Vegetable> {

    @Override
    public int compare(Vegetable v1, Vegetable v2) {
        return Double.compare(v1.getProtein(), v2.getProtein());
    }

}
