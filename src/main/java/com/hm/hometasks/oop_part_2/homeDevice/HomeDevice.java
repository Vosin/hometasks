/*
 * Класс эл прибор
 */
package com.hm.hometasks.oop_part_2.homeDevice;

/**
 *
 * @author Osin Vladimir
 */
public class HomeDevice {
    //определяем поля

    private String name;//название
    private double power;//мощность
    private boolean state;//флаг включен выключен
    private int voltage;//напряжение

    //конструкторы
 public HomeDevice() {
    }

public HomeDevice(String name, double power, boolean state, int voltage) {
        this.name = name;
        this.power = power;
        this.state = state;
        this.voltage = voltage;
    }

public HomeDevice(String name, double power) {
        this.name = name;
        this.power = power;

    }

    //определяем геттеры и сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean getState() {
        return state;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public int getVoltage() {
        return voltage;
    }

    @Override
    public String toString() {
        return "Электроприбор:" + " " + name + " " + "Мощностью =" + power + " " + "Состояние = " + " "
                + state + " " + "Используемое напряжение сети =" + voltage;
    }

}
