/*
 * Класс Антонов
 */
package com.hm.hometasks.oop_part_2.airCompany;

/**
 *
 * @author Osin Vladimir
 */
public class AntonovAirPlane extends AirPlane {
   private final static String name = "Антонов";
     AntonovAirPlane(int capacity, double numberGruz, int rangeFlight, int amountFuel) {
        super(name,capacity, numberGruz, rangeFlight, amountFuel);
     }
    @Override
    public String toString() {
        return super.toString();
    }
}
