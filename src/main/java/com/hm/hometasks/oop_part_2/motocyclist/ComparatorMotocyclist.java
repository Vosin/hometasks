/*
 * Класс сравнения
 */
package com.hm.hometasks.oop_part_2.motocyclist;

import java.util.Comparator;

/**
 *
 * @author Osin Vladimir
 */
public class ComparatorMotocyclist implements Comparator<Ammunition> {
    @Override
    public int compare(Ammunition a1, Ammunition a2) {
        return Double.compare(a1.getWeight(), a2.getWeight());
    }
}
