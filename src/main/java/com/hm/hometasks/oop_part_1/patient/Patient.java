/*
 * Суперкласс пациент
 */
package com.hm.hometasks.oop_part_1.patient;

/**
 *
 * @author Osin Vladimir
 */
public class Patient {
//определяем поля класса

    private int id;//ид
    private String surname;//фамилия
    private String name;//имя
    private String patronimic;//отчество
    private String adress;//адрес
    private String phone;//телефон    
    private int medicinCard;//медицинская карта
    private String diagnoz;//диагноз

//определяем конструкторы
public Patient() {
    }

 public Patient(int id, String surname, String name, String patronimic, String adress, int medicinCard, String phone, String diagnoz) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronimic = patronimic;
        this.adress = adress;
        this.medicinCard = medicinCard;
        this.phone = phone;
        this.diagnoz = diagnoz;
    }

public Patient(String surname, String name, String patronimic, int creditCard) {
        this.surname = surname;
        this.name = name;
        this.patronimic = patronimic;
        this.medicinCard = medicinCard;
    }

public Patient(int creditCard) {
        this.medicinCard = medicinCard;

    }
//определяем геттеры и сеттеры

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

    public void setMedicinCard(int medicinCard) {
        this.medicinCard = medicinCard;
    }

    public int getMedicinCard() {
        return medicinCard;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setDiagnoz(String diagnoz) {
        this.diagnoz = diagnoz;
    }

    public String getDiagnoz() {
        return diagnoz;
    }

    @Override
    public String toString() {
        return "Пациент" + " " + "id =" + " " + id + " " + "Фамилия=" + surname + " " + "Имя=" + " "
                + name + " " + "Отчеcтво=" + patronimic + " " + "Адрес=" + " " + adress + " " + "Телефон:" + " "
                + phone + "Номер медицинской карты=" + " " + medicinCard + " " + "Диагноз=" + " " + diagnoz;
    }
}

