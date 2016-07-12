/*
 * Супер класс покупатель
 */
package com.hm.hometasks.oop_part_1.customer;

/**
 *
 * @author Osin Vladimir
 */
public class Customer implements Comparable {
//определяем поля класса"

    private int id;//ид
    private String surname;//фамилия
    private String name;//имя
    private String patronimic;//отчество
    private String adress;//адрес
    private int creditCard;//номер кредитки
    private int bankAccount;//банк счет

//определяем конструкторы
    public Customer() {
    }

    public Customer(int id, String surname, String name, String patronimic, String adress, int creditCard, int bankAccount) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronimic = patronimic;
        this.adress = adress;
        this.creditCard = creditCard;
        this.bankAccount = bankAccount;

    }

    public Customer(String surname, String name, String patronimic, int creditCard) {
        this.surname = surname;
        this.name = name;
        this.patronimic = patronimic;
        this.creditCard = creditCard;
    }

    public Customer(int bankAccount) {
        this.bankAccount = bankAccount;

    }
///определяем геттеры и сеттеры

    public int getId() {
        return id;
    }

    public String getSurName() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronimic() {
        return patronimic;
    }

    public int getCreditCard() {
        return creditCard;
    }

    public String getAdress() {
        return adress;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    @Override
    public String toString() {
        return "Покупатель" + " " + "id =" + " " + getId() + " " + "Фамилия=" + getSurName() + " "
                + "Имя=" + " " + getName() + " " + "Отчеcтво=" + getPatronimic() + " "
                + "Адрес=" + " " + getAdress() + " " + "Номер кредитки=" + " " + getCreditCard() + " "
                + "Банковский счет=" + " " +getBankAccount();
    }

    @Override
    public int compareTo(Object obj) {

        Customer entry = (Customer) obj;

        int result = surname.compareTo(entry.surname);
        if (result != 0) {
            return result;
        }
        return 0;
    }

}
