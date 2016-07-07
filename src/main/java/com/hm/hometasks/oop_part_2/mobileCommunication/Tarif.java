/*
 * Базовый класс Тариф
 */
package com.hm.hometasks.oop_part_2.mobileCommunication;

/**
 *
 * @author Osin Vladimir
 */
public class Tarif {
    //определяем поля
    private String name;//название
    private double price;//абон плата
    private int amountClient;//количество клиентов
    private double payCommunication;//плата за соединение
    private double priceMinute;//стоимость минуты разговора
    //конструкторы
    public Tarif() {
    }

    public Tarif(String name, double price, int amountClient, double payCommunication, double priceMinute) {
        this.name = name;
        this.price = price;
        this.amountClient = amountClient;
        this.payCommunication = payCommunication;
        this.priceMinute = priceMinute;
    }
    public Tarif(String name, double price) {
        this.name = name;
        this.price = price;
    }

    
   
    //определяем геттеры и сеттеры
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
      public double getPrice() {
        return price;
    }
     public void setAmountClient(int amountClient) {
        this.amountClient = amountClient;
    }
    public int getAmountClient() {
        return amountClient;
    }
    public void setPayCommunication(double payCommunication) {
        this.payCommunication = payCommunication;
    }
    public double getPayCommunication() {
        return payCommunication;
    }
    
    public void setPriceMinute(double priceMinute) {
        this.priceMinute = priceMinute;
    }
    public double getPriceMinute() {
        return priceMinute;
    }
   
    @Override
    public String toString() {
        return "Тариф" + " " + name + "  "+"Абон плата =" +" "+ price + " "
                + "Количество клиентов=" + " " + amountClient +" " + "Плата за соединение:" + " "
                + payCommunication+" "+"Стоимость минуты разговора= "+" "+priceMinute;
    }
}

