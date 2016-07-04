/*
 * Создать программу, которая выводит в консоль следуюшие данные:  
 * ФИО 
 * номер группы 
 * время занятий 
 * в виде: 
 * ФИО: [ваши данные] 
 * номер группы: [ваши данные] 
 * время занятий: [ваши данные] 
 */
package com.hm.hometasks.basistypes;

/**
 *
 * @author Osin Vladimir
 */
public class MyGroup {

    public static void main(String[] args) {
        String surname;     // фамилия
        String name;        // имя
        String patronimic;  // отчество
        int num;            // номер группы
        int time;           // время занятий
        surname = "Осин";
        name = "Владимир";
        patronimic = "Анатольевич";
        num = 1605;
        time = 19;
        System.out.println("ФИО :" + surname + " " + name + " " + patronimic);
        System.out.println("Номер группы :" + num);
        System.out.println("время занятий :" + time + " " + "часов");

    }

}
