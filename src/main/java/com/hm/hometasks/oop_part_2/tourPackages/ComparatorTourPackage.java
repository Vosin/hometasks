/*
 * Класс сравнения тур путевок
 */
package com.hm.hometasks.oop_part_2.tourPackages;

import java.util.Comparator;

/**
 *
 * @author Osin Vladimir
 */
public class ComparatorTourPackage implements Comparator<TourPackage> {
    @Override
    public int compare(TourPackage tourPackage1, TourPackage tourPackage2) {
        return Double.compare(tourPackage1.getAmmount(),tourPackage2.getAmmount());
         
    }
}
    

