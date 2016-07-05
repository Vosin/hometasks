/*
 * Суперкласс Студент
 */
package com.hm.hometasks.oop_part_1.student;

/**
 *
 * @author Osin Vladimir
 */

public class Student implements Comparable {
//определяем поля класса"

    private int id;//ид
    private String surname;//фамилия
    private String name;//имя
    private String patronimic;//отчетство
    private int birthDay;//дата рождения
    private String adress;//адрес
    private String phone;//телефон
    private String department;//факультет
    private int course;//курс
    private int group;//группа
//определяем конструкторы

   public Student() {
    }

   public Student(int id, String surname, String name, String patronimic, int birthDay, String adress, String phone, String department, int course, int group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronimic = patronimic;
        this.birthDay = birthDay;
        this.adress = adress;
        this.phone = phone;
        this.department = department;
        this.course = course;
        this.group = group;
    }

   public Student(int id, String surname, String name, String patronimic, int birthDay) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronimic = patronimic;
        this.birthDay = birthDay;
    }

   public Student(int id, String surname, String name, String patronimic, int birthDay, String adress, String phone) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronimic = patronimic;
        this.birthDay = birthDay;
        this.adress = adress;
    }
//определяем геттеры и сеттеры

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSurnname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
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

    public void setBirthDay(int birthday) {
        this.birthDay = birthday;
    }

    public int getBirthDay() {
        return birthDay;
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

    public void setDepartment(String department) {
        this.department = department;

    }

    public String getDepartment() {
        return department;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Студент" + " " + "Фамилия=" + surname + " " + "Имя=" + " " + name + " " + "Отчеcтво=" + patronimic + " "
        + "ДеньРождения" + " " + birthDay + " " + "Адрес=" + " " + adress + " " + "Телефон=" + " " + phone + " "
        + "Факультет=" + " " + department + " " + "Курс=" + " " + course + " " + "Группа=" + " " + group;
    }

    @Override
    public int compareTo(Object obj) {

        Student entry = (Student) obj;

        int result = department.compareTo(entry.department);
        if (result != 0) {
            return result;
        }

        result = course - entry.course;
        if (result != 0) {
            return (int) result / Math.abs(result);
        }
        return 0;
    }
}
