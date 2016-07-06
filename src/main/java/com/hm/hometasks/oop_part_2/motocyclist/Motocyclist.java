/*
 * Класс мотоциклист
 */
package com.hm.hometasks.oop_part_2.motocyclist;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Osin Vladimir
 */
public class Motocyclist{
 
    private double price;//стоимость
   
    public double getPrice() {
        return price;
    }

    private ArrayList<Ammunition> ammunitions = new ArrayList<Ammunition>();

    public Motocyclist addAmmunition(Ammunition ammunition) {
        ammunitions.add(ammunition);
        price  += ammunition.getPrice();
        return this;
    }

    public void sortAmmunition() {

        Collections.sort(ammunitions, new ComparatorMotocyclist());

        for (int i = 0; i < ammunitions.size(); i++) {
            System.out.println(ammunitions.get(i).toString());
        }
    }

    public void findAmmunition(double d1, double d2) {
        int flg = 0;
        for (int i = 0; i < ammunitions.size(); i++) {
            if ((ammunitions.get(i).getPrice()>= d1) & (ammunitions.get(i).getPrice() <= d2)) {
                System.out.println(ammunitions.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такой амуниции");
        }
    }

}





