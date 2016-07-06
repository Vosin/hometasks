/*
 * Класс сравнения
 */
package com.hm.hometasks.oop_part_2.stone;

import java.util.Comparator;

/**
 *
 * @author Osin Vladimir
 */
public class ComparatorStone implements Comparator<Stone> {
    @Override
    public int compare(Stone s1, Stone s2) {
        return Integer.compare(s1.getValue(), s2.getValue());
    }
}
