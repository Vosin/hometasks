/*
 * Суперкласс самолет
 */
package com.hm.hometasks.oop_part_1.airLine;

/**
 *
 * @author Osin Vladimir
 */
public class AirLine {
//определяем поля класса

    private String destination;//напрвление
    private int numberReys;//номер рейса
    private String typeAir;//тип
    private double timeDeparture;//время отправления
    private String days;//дни

//определяем конструкторы
    public AirLine() {
    }

    public AirLine(String destination, int numberReys, String typeAir, double timeDeparture, String days) {
        this.destination = destination;
        this.numberReys = numberReys;
        this.typeAir = typeAir;
        this.timeDeparture = timeDeparture;
        this.days = days;
    }

    public AirLine(String destination, int numberReys, String typeAir) {
        this.destination = destination;
        this.numberReys = numberReys;
        this.typeAir = typeAir;
    }

    public AirLine(int numberReys, String typeAir, double timeDeparture) {
        this.numberReys = numberReys;
        this.typeAir = typeAir;
        this.timeDeparture = timeDeparture;

    }

//определяем геттеры и сеттеры
 

    public String getDestination() {
        return destination;
    }

    public int getNumberReys() {
        return numberReys;
    }
    public String getTypeAir() {
        return typeAir;
    }
    public double getTimeDeparture() {
        return timeDeparture;
    }

    public String getDays() {
        return days;
    }

    @Override
    public String toString() {
        return "Лайнер" + " " + "Пункт назначения=" + " " + destination + " " + "номер рейса=" + numberReys + " "
                + "тип самолета=" + " " + typeAir + " " + "Время вылета =" + timeDeparture + " "
                + "День недели=" + " " + days;
    }

}
