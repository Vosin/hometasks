/*
 * Супер класс автобус
 */
package com.hm.hometasks.oop_part_1.bus;

/**
 *
 * @author Osin Vladimir
 */
public class Bus {
//определяем поля класса

    private String surname;//водитель
    private int numberBus;//номер автобуса
    private int numberMarshruta;//номер маршрута
    private String marka;//марка
    private int godStartEkspluatatsii;//год начала эксплуатации
    private int probeg;// в километрах

//определяем конструкторы
    public Bus() {
    }

    public Bus(String surname, int numberBus, int numberMarshruta, String marka, int godStartEkspluatatsii, int probeg) {
        this.surname = surname;
        this.numberBus = numberBus;
        this.numberMarshruta = numberMarshruta;
        this.marka = marka;
        this.godStartEkspluatatsii = godStartEkspluatatsii;
        this.probeg = probeg;
    }

    public Bus(String surname, int numberBus, int numberMarshruta) {
        this.surname = surname;
        this.numberBus = numberBus;
        this.numberMarshruta = numberMarshruta;
    }

    public Bus(int numberBus, int numberMarshruta, String marka, int probeg) {
        this.numberBus = numberBus;
        this.numberMarshruta = numberMarshruta;
        this.marka = marka;
        this.probeg = probeg;
    }

//определяем геттеры и сеттеры


    public String getSurName() {
        return surname;
    }
    public int getNumberBus() {
        return numberBus;
    }
    public int getNumberMarshruta() {
        return numberMarshruta;
    }
    public String getMarka() {
        return marka;
    }
    public int getGodStartEkspluatatsii() {
        return godStartEkspluatatsii;
    }
    public int getProbeg() {
        return probeg;
    }

    @Override
    public String toString() {
        return "Автобус" + " " + "Водитель=" + " " + getSurName() + " " + "номер=" +getNumberBus() + " " + "номер маршрута=" + " "
                + getNumberMarshruta() + " " + "Марка =" + getMarka() + " " + "Год старта эксплуатации=" + " " + getGodStartEkspluatatsii() + " "
                + "Пробег:" + " " + getProbeg();
    }

    public int SrokEkspluatasii() {
        int currentYear = 2016;
        return currentYear - godStartEkspluatatsii;
    }
}
