/*
 * Класс общий вагон
 */
package com.hm.hometasks.oop_part_2.transport;

/**
 *
 * @author Osin Vladimir
 */
public class OverallRailwayTransport extends RailwayTransport {
    private final static String name = "Общий";
    OverallRailwayTransport(int numberSeats, int numberBagage,int levelComfort) {
        super(name, numberSeats, numberBagage,levelComfort);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}