/*
 * Класс наследник отдых
 */
package com.hm.hometasks.oop_part_2.tourPackages;

/**
 *
 * @author Osin Vladimir
 */
public class  RelaxationTourPackage extends TourPackage {
   private final static String name = "Отдых на море";
     RelaxationTourPackage(double ammount, String typeFood, int numberDays, String transfer, String country){
        super(name,ammount,typeFood,numberDays,transfer,country);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
