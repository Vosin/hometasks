/*
 * Класс наследник лечение
 */
package com.hm.hometasks.oop_part_2.tourPackages;

/**
 *
 * @author Osin Vladimir
 */
public class TreatmentTourPackage extends TourPackage {
   private final static String name = "Лечение";
     TreatmentTourPackage(double ammount, String typeFood, int numberDays, String transfer, String country){
        super(name,ammount,typeFood,numberDays,transfer,country);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
