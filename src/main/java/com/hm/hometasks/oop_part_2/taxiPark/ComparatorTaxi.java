/*
 * Класс сравнения
 */
package com.hm.hometasks.oop_part_2.taxiPark;

import java.util.Comparator;

/**
 *
 * @author Osin Vladimir
 */
public class ComparatorTaxi implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return Integer.compare(car1.getAmountFuel(),car2.getAmountFuel());
    }
}
