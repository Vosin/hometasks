/*
 * Класс сравнения
 */
package com.hm.hometasks.oop_part_2.soundTreck;

import java.util.Comparator;

/**
 *
 * @author Osin Vladimir
 */
public class  ComparatorSoundTreck implements Comparator<Composition> {

    @Override
    public int compare(Composition c1, Composition c2) {
        return Integer.compare(c1.getStyle(), c2.getStyle());
    }

}
