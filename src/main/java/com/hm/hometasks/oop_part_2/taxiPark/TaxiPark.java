/*
 * Класс ТаксоПарк
 */
package com.hm.hometasks.oop_part_2.taxiPark;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Osin Vladimir
 */
public class TaxiPark{
 
    private double price;//стоимость
   
    public double getPrice() {
        return price ;
    }
   
    private ArrayList<Car> cars = new ArrayList<Car>();
   //создаем таксопарк
    public TaxiPark addCar(Car car) {
        cars.add(car);
        price   += car.getPrice();
        return this;
    }
//сортировка авто по расходу топлива
    public void sortCar() {

        Collections.sort(cars, new ComparatorTaxi());

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).toString());
        }
    }
//найти машину по диапазону скорости
    public void findCar(int d1, int d2) {
        int flg = 0;
        for (int i = 0; i < cars.size(); i++) {
            if ((cars.get(i).getSpeed()>= d1) & (cars.get(i).getSpeed() <= d2)) {
                System.out.println(cars.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет таких авто");
        }
    }

}


