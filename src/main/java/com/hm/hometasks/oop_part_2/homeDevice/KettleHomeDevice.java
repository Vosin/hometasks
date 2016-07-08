/*
 * Класс эл чайник
 */
package com.hm.hometasks.oop_part_2.homeDevice;

/**
 *
 * @author Osin Vladimir
 */
public class KettleHomeDevice extends HomeDevice {

    private final static String name = "Электрочайник";

    KettleHomeDevice(double power, boolean state, int voltage) {
        super(name, power, state, voltage);
    }

    @Override
    public String toString() {
        return super.toString();
    }
   @Override
    public void switchOn(){
        super.switchOn();
        System.out.println(this+" включен в розетку!");
    }
    @Override
    public void switchOff(){
        super.switchOff();
        System.out.println(this+" выключен из розетки!");
    }
}
