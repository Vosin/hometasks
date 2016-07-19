/*
 * класс Букет
 */
package com.hm.hometasks.oop_part_2.flower;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Osin Vladimir
 */
public class Bouquet {

    private double price;//цена букета


    public double getPrice() {
        return price;
    }
    private ArrayList<Flower> flowers = new ArrayList<Flower>();

    public Bouquet addFlower(Flower flower) {
        flowers.add(flower);
        price += flower.getPrice();
        return this;
    }

    public void sortList() {

        Collections.sort(flowers, new ComparatorFlower());

        for (int i = 0; i < flowers.size(); i++) {
            System.out.println(flowers.get(i).toString());
        }
    }

    public void findFlower(int d1, int d2) {
        int flg = 0;
        for (int i = 0; i < flowers.size(); i++) {
            if ((flowers.get(i).getStemLength() >= d1) & (flowers.get(i).getStemLength() <= d2)) {
                System.out.println(flowers.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такого  цветка");
        }
    }
    public void printFlowers(){
        for(int i=0;i<flowers.size(); i++ ){
            System.out.println(flowers.get(i).toString());
        }
    }
  

}




