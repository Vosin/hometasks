/*
 * Суперкласс Дом.
 */
package com.hm.hometasks.oop_part_1.house;

/**
 *
 * @author Osin Vladimir
 */
public class House {
//определяем поля класса

    private int id;//ид
    private int numberFlat;//номер квартиры
    private int square;//площадь
    private int floor;//этаж
    private int countRoom;//колво комнат
    private String street;//улица
    private String typeBild;//тип здания
    private int termEkspluatatii;//срок эксплуатации

//определяем конструкторы
    public House() {
    }

    public House(int id, int numberFlat, int square, int floor, int countRoom, String street, String typeBild, int termEkspluatatii) {
        this.id = id;
        this.numberFlat = numberFlat;
        this.square = square;
        this.floor = floor;
        this.countRoom = countRoom;
        this.street = street;
        this.typeBild = typeBild;
        this.termEkspluatatii = termEkspluatatii;

    }

    public House(int numberFlat, int square, int floor, int countRoom, String street) {
        this.numberFlat = numberFlat;
        this.square = square;
        this.floor = floor;
        this.countRoom = countRoom;
        this.street = street;

    }

    public House(String street, String typeBild, int termEkspluatatii) {
        this.street = street;
        this.typeBild = typeBild;
        this.termEkspluatatii = termEkspluatatii;

    }
//определяем геттеры и сеттеры

    public int getId() {
        return id;
    }

    public int getNumberFlat() {
        return numberFlat;
    }

    public int getSquare() {
        return square;
    }

    public int getFloor() {
        return floor;
    }

    public int getCountRoom() {
        return countRoom;
    }

    public String getStreet() {
        return street;
    }

    public String getTypeBild() {
        return typeBild;
    }

    public int getTermEkspluatatii() {
        return termEkspluatatii;
    }

    @Override
    public String toString() {
        return "Дом" + " " + "id =" + " " + id + " " + "Номер квартиры=" + numberFlat + " " + "Площадь=" + " "
                + square + " " + "Этаж =" + floor + " " + "Количество комнат=" + " " + countRoom + " " + "Улица:" + " "
                + street + " Тип здания=" + " " + typeBild + ": " + "Срок эксплуатации=" + " " + termEkspluatatii;
    }
}
