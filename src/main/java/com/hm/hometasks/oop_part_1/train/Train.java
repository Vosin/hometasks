/*
 * Супер класс поезд
 */
package com.hm.hometasks.oop_part_1.train;

/**
 *
 * @author Osin Vladimir
 */
public class Train {
//определяем поля класса

    private String destination;//напрвления
    private int numberTrain;//номер
    private double timeDeparture;//время отправления
    private int numberSeatsOveral;//число общих мест
    private int numberSeatsKupe;//число купе
    private int numberSeatsPlatskart;//число мест плацкарт
    private int numberSeatsLuxury;//число мест люкс

//определяем конструкторы
 public Train() {
    }

public Train(String destination, int numberTrain, double timeDeparture, int numberSeatsOveral, int numberSeatsKupe, int numberSeatsPlatskart, int numberSeatsLuxury) {
        this.destination = destination;
        this.numberTrain = numberTrain;
        this.timeDeparture = timeDeparture;
        this.numberSeatsOveral = numberSeatsOveral;
        this.numberSeatsKupe = numberSeatsKupe;
        this.numberSeatsPlatskart = numberSeatsPlatskart;
        this.numberSeatsLuxury = numberSeatsLuxury;
    }

public Train(String destination, int numberTrain, double timeDeparture) {
        this.destination = destination;
        this.numberTrain = numberTrain;
        this.timeDeparture = timeDeparture;
    }

public Train(int numberTrain, double timeDeparture) {
        this.numberTrain = numberTrain;
        this.timeDeparture = timeDeparture;
    }

//определяем геттеры и сеттеры
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setNumberTrain(int numberTrain) {
        this.numberTrain = numberTrain;
    }

    public int getNumberTrain() {
        return numberTrain;
    }

    public void setTimeDeparture(double timeDeparture) {
        this.timeDeparture = timeDeparture;
    }

    public double getTimeDeparture() {
        return timeDeparture;
    }

    public void setNumberSeatsOveral(int numberSeatsOveral) {
        this.numberSeatsOveral = numberSeatsOveral;
    }

    public int getNumberSeatsOveral() {
        return numberSeatsOveral;
    }

    public void setNumberSeatsKupe(int numberSeatsKupe) {
        this.numberSeatsKupe = numberSeatsKupe;
    }

    public int getNumberSeatsKupe() {
        return numberSeatsKupe;
    }

    public void setNumberSeatsPlatskart(int numberSeatsPlatskart) {
        this.numberSeatsPlatskart = numberSeatsPlatskart;
    }

    public int getNumberSeatsPlatskart() {
        return numberSeatsPlatskart;
    }

    public void setNumberSeatsLuxury(int numberSeatsLuxury) {
        this.numberSeatsLuxury = numberSeatsLuxury;
    }

    public int getNumberSeatsLuxury() {
        return numberSeatsLuxury;
    }

    @Override
    public String toString() {
        return "Поезд" + " " + "Пункт назначения=" + " " + destination + " " + "номер=" + numberTrain + " " + "Время отправления=" + " " + timeDeparture + " " + "Количество общих мест =" + numberSeatsOveral + " "
                + "Количество мест купе=" + " " + numberSeatsKupe + " " + "Количество мест плацкарт:" + " " + numberSeatsPlatskart + " Количество мест люкс=" + " "
                + numberSeatsLuxury;
    }

}

