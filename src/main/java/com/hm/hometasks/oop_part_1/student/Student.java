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

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronimic() {
        return patronimic;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public String getAdress() {
        return adress;
    }

    public String getPhone() {
        return phone;
    }

    public String getDepartment() {
        return department;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Студент" + " " + "Фамилия=" + getSurname() + " " + "Имя=" + " " + getName() + " " + "Отчеcтво=" + getPatronimic() + " "
                + "ДеньРождения" + " " + getBirthDay() + " " + "Адрес=" + " " + getAdress() + " " + "Телефон=" + " " + getPhone() + " "
                + "Факультет=" + " " + getDepartment() + " " + "Курс=" + " " + getCourse() + " " + "Группа=" + " " + getGroup();
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
