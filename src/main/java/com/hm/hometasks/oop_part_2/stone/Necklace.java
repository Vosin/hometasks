/*
 * Ожерелье
 */
package com.hm.hometasks.oop_part_2.stone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Osin Vladimir
 */
public class Necklace{

    private double weight;//вес
    private double price;//цена

    public double getWeight() {
        return weight;
    }
    public double getPrice() {
        return price;
    }

    private ArrayList<Stone> stones = new ArrayList<Stone>();

    public Necklace addStone(Stone stone) {
        stones.add(stone);
        weight += stone.getWeight();
        price  += stone.getPrice();
        return this;
    }

    public void sortStone() {

        Collections.sort(stones, new ComparatorStone());

        for (int i = 0; i < stones.size(); i++) {
            System.out.println(stones.get(i).toString());
        }
    }

    public void findStone(int d1, int d2) {
        int flg = 0;
        for (int i = 0; i < stones.size(); i++) {
            if ((stones.get(i).getTransparency()>= d1) & (stones.get(i).getTransparency() <= d2)) {
                System.out.println(stones.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такого камня");
        }
    }

}



