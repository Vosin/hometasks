/*
 * Cупер класс абитурьент
 */
package com.hm.hometasks.oop_part_1.abiturient;

/**
 *
 * @author Osin Vladimir
 */
public class Abiturient {
//определяем поля класса

    private int id;//ид
    private String surname;//фамилия 
    private String name;//имя
    private String patronimic;//отчество
    private String adress;//адрес
    private String phone;//телефон
    private int ballFizika;//балл по физике
    private int ballChimiya;//балл по химии
    private int ballBiologiya;//балл по биологии

//определяем конструкторы
    public Abiturient() {
    }

    public Abiturient(int id, String surname, String name, String patronimic, String adress, int ballFizika, int ballChimiya, int ballBiologiya, String phone) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronimic = patronimic;
        this.adress = adress;
        this.ballFizika = ballFizika;
        this.ballChimiya = ballChimiya;
        this.ballBiologiya = ballBiologiya;
        this.phone = phone;

    }

    public Abiturient(String surname, String name, String patronimic, int ballFizika, int ballChimiya, int ballBiologiya) {
        this.surname = surname;
        this.name = name;
        this.patronimic = patronimic;
        this.ballFizika = ballFizika;
        this.ballChimiya = ballChimiya;
        this.ballBiologiya = ballBiologiya;
    }

    public Abiturient(int ballFizika, int ballChimiya, int ballBiologiya) {
        this.ballFizika = ballFizika;
        this.ballChimiya = ballChimiya;
        this.ballBiologiya = ballBiologiya;

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

    public void setBallFizika(int ballFizika) {
        this.ballFizika = ballFizika;
    }

    public int getBallFizika() {
        return ballFizika;
    }

    public void setBallChimiya(int ballChimiya) {
        this.ballChimiya = ballChimiya;
    }

    public int getBallChimiya() {
        return ballChimiya;
    }

    public void setBallBiologiya(int ballBiologiya) {
        this.ballBiologiya = ballBiologiya;
    }

    public int getBallBiologiya() {
        return ballBiologiya;
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

    @Override
    public String toString() {
        return "Абитурьент" + " " + "id =" + " " + id + " " + "Фамилия=" + surname + " " + "Имя=" + " " + name + " " + "Отчеcтво=" + patronimic + " "
                + "Адрес=" + " " + adress + " " + "Телефон:" + " " + phone + " Оценка по физике=" + " "
                + ballFizika + ": " + "Оценка по химии=" + " " + ballChimiya + ": " + "Оценка по биологии =" + " " + ballBiologiya;
    }

    public int sumAllBall() {
        return ballFizika + ballChimiya + ballBiologiya;
    }
//хорошими будем считать оценки выше 8 баллов

    public boolean badBall() {
        if (ballFizika < 8 | ballChimiya < 8 | ballBiologiya < 8) {
            return true;
        } else {
            return false;
        }

    }
}
