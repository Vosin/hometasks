/*
 * Класс сравнения
 */
package com.hm.hometasks.oop_part_2.airCompany;

/**
 *
 * @author Osin Vladimir
 */
//класс использует интерфейс компаратор

import java.util.Comparator;

public class ComparatorAirLine implements Comparator<AirPlane> {
    @Override
    public int compare(AirPlane airPlane1, AirPlane airPlane2) {
        return Integer.compare(airPlane1.getRangeFlight(),airPlane2.getRangeFlight());
    }
}
