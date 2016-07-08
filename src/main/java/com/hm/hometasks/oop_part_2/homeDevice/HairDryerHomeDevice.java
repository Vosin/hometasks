/*
 * эл фен.
 */
package com.hm.hometasks.oop_part_2.homeDevice;

/**
 *
 * @author Osin Vladimir
 */
public class HairDryerHomeDevice extends HomeDevice {

    private final static String name = "Электрофен";

    HairDryerHomeDevice(double power, boolean switched, int voltage) {
        super(name, power, switched, voltage);
    }
    HairDryerHomeDevice(double power) {
        super(name, power);
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
