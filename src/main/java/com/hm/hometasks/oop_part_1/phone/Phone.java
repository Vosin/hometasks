/*
 * Суперкласс телефон
 */
package com.hm.hometasks.oop_part_1.phone;

/**
 *
 * @author Osin Vladimir
 */
public class Phone implements Comparable {
//определяем поля класса"

    private int id;//ид
    private String surname;//фамилия
    private String name;//имя
    private String patronimic;//отчетсво
    private String adress;//адрес
    private int creditCard;//номер кредитки
    private int debet;//дебет
    private int kredit;//кредит
    private int timeCity;//время в минутах
    private int timeBetweenCity;//время в минутах

//определяем конструкторы
public Phone() {
    }

public Phone(int id, String surname, String name, String patronimic, String adress, int creditCard, int debet, int kredit, int timeCity, int timeBetweenCity) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronimic = patronimic;
        this.adress = adress;
        this.creditCard = creditCard;
        this.debet = debet;
        this.kredit = kredit;
        this.timeCity = timeCity;
        this.timeBetweenCity = timeBetweenCity;

    }

public Phone(String surname, String name, String patronimic, int creditCard) {
        this.surname = surname;
        this.name = name;
        this.patronimic = patronimic;
        this.creditCard = creditCard;
    }

public Phone(int creditCard) {
        this.creditCard = creditCard;

    }
///определяем геттеры и сеттеры

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSurName(String surname) {
        this.surname = surname;
    }

    public String getSurName() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPatronimic(String patronimic) {
        this.patronimic = patronimic;

    }

    public String getPatronimic() {
        return patronimic;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    public int getCreditCard() {
        return creditCard;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setDebet(int debet) {
        this.debet = debet;
    }

    public int getDebet() {
        return debet;
    }

    public void setKredit(int kredit) {
        this.kredit = kredit;
    }

    public int getKredit() {
        return kredit;
    }

    public void setTimeCity(int timeCity) {
        this.timeCity = timeCity;
    }

    public int getTimeCity() {
        return timeCity;
    }

    public void setTimeBetweenCity(int timeBetweenCity) {
        this.timeBetweenCity = timeBetweenCity;
    }

    public int getTimeBetweenCity() {
        return timeBetweenCity;
    }

    @Override
    public String toString() {
        return "Абонент" + " " + "id =" + " " + id + " " + "Фамилия=" + surname + " " + "Имя=" + " " + name + " " + "Отчеcтво=" + patronimic + " "
                + "Адрес=" + " " + adress + " " + "Номер кредитки=" + " " + creditCard + " "
                + "Дебет=" + " " + debet + " " + "Кредит = " + " " + kredit + " " + "Время городских переговоров = " + " "
                + timeCity + " " + "Время междугородних преговоров= " + " " + timeBetweenCity;
    }

    @Override
    public int compareTo(Object obj) {

        Phone entry = (Phone) obj;

        int result = surname.compareTo(entry.surname);
        if (result != 0) {
            return result;
        }
        return 0;
    }

}

