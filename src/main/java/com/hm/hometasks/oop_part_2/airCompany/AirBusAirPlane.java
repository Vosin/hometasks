/*
 * Класс Аэробус
 */
package com.hm.hometasks.oop_part_2.airCompany;

/**
 *
 * @author Osin Vladimir
 */
public class AirBusAirPlane extends  AirPlane {
    private final static String name = "Аэробус";
     AirBusAirPlane(int capacity, double numberGruz, int rangeFlight, int amountFuel) {
        super(name,capacity, numberGruz, rangeFlight, amountFuel);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
