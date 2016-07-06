/*
 * класс Салат
 */
package com.hm.hometasks.oop_part_2.chief;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Osin Vladimir
 */
public class Salad{

    private double caloricValue;//калорийность

    public double getСaloricValue() {
        return caloricValue;
    }

    private ArrayList<Vegetable> vegetables = new ArrayList<Vegetable>();

    public Salad addVegetable(Vegetable vegetable) {
        vegetables.add(vegetable);
        caloricValue += vegetable.getCaloricValue();
        return this;
    }

    public void sortVegetable() {

        Collections.sort(vegetables, new ComparatorChief());

        for (int i = 0; i < vegetables.size(); i++) {
            System.out.println(vegetables.get(i).toString());
        }
    }

    public void findVegetable(double d1, double d2) {
        int flg = 0;
        for (int i = 0; i < vegetables.size(); i++) {
            if ((vegetables.get(i).getCaloricValue() >= d1) & (vegetables.get(i).getCaloricValue() <= d2)) {
                System.out.println(vegetables.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такого овоща");
        }
    }

}




