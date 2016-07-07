/*
 * Класс наследник круиз
 */
package com.hm.hometasks.oop_part_2.tourPackages;

/**
 *
 * @author Osin Vladimir
 */
public class CruizeTourPackage extends TourPackage {
   private final static String name = "Круиз";
     CruizeTourPackage(double ammount, String typeFood, int numberDays, String transfer, String country){
        super(name,ammount,typeFood,numberDays,transfer,country);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
