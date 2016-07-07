/*
 * Класс сравнения игрушек
 */
package com.hm.hometasks.oop_part_2.gameRoom;

import java.util.Comparator;

/**
 *
 * @authorOsin Vladimir
 */
public class ComparatorToys implements Comparator<Toy> {
    @Override
    public int compare(Toy toys1, Toy toys2) {
        return Integer.compare(toys1.getAgeGroup(),toys1.getAgeGroup());
         
    }
}
