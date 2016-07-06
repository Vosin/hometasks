/*
 * Класс Боинг
 */
package com.hm.hometasks.oop_part_2.airCompany;

/**
 *
 * @author Osin Vladimir
 */
public class BoeingAirPlane extends AirPlane {
   private final static String name = "Боинг";
     BoeingAirPlane(int capacity, double numberGruz, int rangeFlight, int amountFuel) {
        super(name,capacity, numberGruz, rangeFlight, amountFuel);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
