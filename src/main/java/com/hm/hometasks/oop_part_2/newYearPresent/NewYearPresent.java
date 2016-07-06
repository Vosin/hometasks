/*
 * Новогодний подарок
 */
package com.hm.hometasks.oop_part_2.newYearPresent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Osin Vladimir
 */
public class NewYearPresent {

    private double price;//цена подарка
    private float weight;//вес подарка

    public double getPrice() {
        return price;
    }

    public float getWeight() {
        return weight;
    }

    private ArrayList<Candy> candys = new ArrayList<Candy>();

    public NewYearPresent addCandy(Candy candy) {
        candys.add(candy);
        weight += candy.getWeight();
        return this;
    }

    public void sortCandy() {

        Collections.sort(candys, new ComparatorNewYearPresent());

        for (int i = 0; i < candys.size(); i++) {
            System.out.println(candys.get(i).toString());
        }
    }

    public void findCandy(int d1, int d2) {
        int flg = 0;
        for (int i = 0; i < candys.size(); i++) {
            if ((candys.get(i).getSugar() >= d1) & (candys.get(i).getSugar() <= d2)) {
                System.out.println(candys.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такой конфетки");
        }
    }

}


