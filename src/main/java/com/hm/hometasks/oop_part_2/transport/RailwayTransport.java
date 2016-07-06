/*
 * Класс железнодорожный транспорт 
 */
package com.hm.hometasks.oop_part_2.transport;

/**
 *
 * @author Osin Vladimir
 */
public class RailwayTransport {
    //определяем поля
    private String name;
    private int numberSeats;//число  мест
    private int numberBagage;//число мест багажа
    private int levelComfort;//уровень комфортности
    
    //конструкторы
public RailwayTransport() {
    }

public RailwayTransport(String name, int numberSeats, int numberBagage,int levelComfort) {
        this.name = name;
        this.numberSeats = numberSeats;
        this.numberBagage = numberBagage;
        this.levelComfort = levelComfort;
    }
public RailwayTransport(String name) {
        this.name = name;
        }  
        
   
    //определяем геттеры и сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }
      public int getNumberSeats() {
        return numberSeats;
    }
     public void setNumberBagage(int numberBagage) {
        this.numberBagage = numberBagage;
    }

    public int getNumberBagage() {
        return numberBagage;
    }
    public void setLevelComfort(int levelComfort) {
        this.levelComfort = levelComfort;
    }

    public int getLevelComfort() {
        return levelComfort;
    }
    @Override
    public String toString() {
        return "Вагон" + " " + name + "  "+"Количество  мест пассажиров =" +" "+ numberSeats + " "
                + "Количество мест багажа=" + " " + numberBagage + " " + "Уровень комфортности:" + " "
                + levelComfort ;
    }
}

