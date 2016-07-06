/*
 * Класс сравнения
 */
package com.hm.hometasks.oop_part_2.flower;

import java.util.Comparator;

/**
 *
 * @author Osin Vladimir
 */
public class  ComparatorFlower implements Comparator<Flower> {

    @Override
    public int compare(Flower f1, Flower f2) {
        return Integer.compare(f1.getLevelFresh(), f2.getLevelFresh());
    }

}
