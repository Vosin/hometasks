/*
 * Класс сборка
 */
package com.hm.hometasks.oop_part_2.soundTreck;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Osin Vladimir
 */
public class Installation{

    private int   duration;//продолжительность

    public int getDuration() {
        return duration;
    }

    private ArrayList<Composition> compositions = new ArrayList<Composition>();

    public Installation addComposition(Composition composition) {
        compositions.add(composition);
        duration += composition.getDuration();
        return this;
    }

    public void sortComposition() {

        Collections.sort(compositions, new ComparatorSoundTreck());

        for (int i = 0; i < compositions.size(); i++) {
            System.out.println(compositions.get(i).toString());
        }
    }

    public void findComposition(int d1, int d2) {
        int flg = 0;
        for (int i = 0; i < compositions.size(); i++) {
            if ((compositions.get(i).getTrackLength()>= d1) & (compositions.get(i).getTrackLength() <= d2)) {
                System.out.println(compositions.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такой звукозаписи");
        }
    }

}



