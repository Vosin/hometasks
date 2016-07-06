/*
 * Приборы в квартире
 */
package com.hm.hometasks.oop_part_2.homeDevice;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Osin Vladimir
 */
public class FlatDevice {

    private double power;//мощность

    public double getPower() {
        return power;
    }

    private ArrayList<HomeDevice> homeDevices = new ArrayList<HomeDevice>();

    public FlatDevice addHomeDevice(HomeDevice homeDevice) {
        homeDevices.add(homeDevice);
        power += homeDevice.getPower();
        return this;
    }

    public void sortHomeDevice() {

        Collections.sort(homeDevices, new ComparatorHomeDevice());

        for (int i = 0; i < homeDevices.size(); i++) {
            System.out.println(homeDevices.get(i).toString());
        }
    }

    public void findHomeDevice(int d1, int d2) {
        int flg = 0;
        for (int i = 0; i < homeDevices.size(); i++) {
            if ((homeDevices.get(i).getVoltage() >= d1) & (homeDevices.get(i).getVoltage() <= d2)) {
                System.out.println(homeDevices.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такого прибора");
        }
    }

}


