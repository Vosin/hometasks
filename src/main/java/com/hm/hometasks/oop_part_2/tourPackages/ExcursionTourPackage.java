/*
 * Класс наследник экскурсии
 */
package com.hm.hometasks.oop_part_2.tourPackages;

/**
 *
 * @author vOsin Vladimir
 */
public class ExcursionTourPackage extends TourPackage {
   private final static String name = "Экскурсии";
     ExcursionTourPackage(double ammount, String typeFood, int numberDays, String transfer, String country){
        super(name,ammount,typeFood,numberDays,transfer,country);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
