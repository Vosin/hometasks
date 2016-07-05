/*
 * id,  Фамилия ,  Имя ,  Отчество ,  Адрес ,  Телефон , 
 *  Номер   медицинской   карты ,  Диагноз . 
 *  Создать   массив   объектов .  Вывести : 
 *  a)   список   пациентов ,  имеющих   данный   диагноз ; 
 *  b)   список   пациентов ,  номер   медицинской   карты  
 *  которых   находится   в   за ­ данном   интервале . 
 */
package com.hm.hometasks.oop_part_1.patient;

import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class PatientDemo {

    public static void main(String[] args) {
        
        Patient []patients = createListPatients();
        concolIO(patients);
       
       
    }
    public static Patient[]createListPatients(){
       //заполняем объект пациент данными
        Patient p1 = new Patient(1, "Иванов", "Иван", "Иванович", "ул.Корчагинцев 2", 24, "123 45 67", "диабет");
        Patient p2 = new Patient(2, "Петров", "Сергей", "Иванович", "ул.Блюхера 4", 12, "123 88 67", "ишемия");
        Patient p3 = new Patient(3, "Сидоров", "Василий", "Митрофанович", "ул.Пушкинская44", 11, "189 40 88", "инфаркт");
        Patient p4 = new Patient(4, "Козлов", "Валентин", "Ильич", "ул.Блюхера 4", 44, "123 88 67", "инсульт");
        Patient p5 = new Patient(5, "Быков", "Петр", "Васильевич", "ул.Пушкинская44", 88, "189 40 88", "диабет");
        //создаем массив
        Patient[] pt = new Patient[5];
        pt[0] = p1;
        pt[1] = p2;
        pt[2] = p3;
        pt[3] = p4;
        pt[4] = p5;
        return pt;
    }
    public static void concolIO(Patient []patients){
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Для списка  пациентов ,  имеющих   данный   диагноз : 1 ");
            System.out.println("Для списка  список   пациентов ,  номер   медицинской   карты  которых   находится   в   за ­ данном   интервале нажмите 2  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        System.out.println("Введите диагноз:диабет -1,ишемия -2,инфаркт-3,инсульт-4");
                        int r = Integer.parseInt(sc.next());
                        printPatient(patients, r);
                    }
                    break;
                    case 2: {
                        System.out.println("Задайте интервал номера медицинской карты");
                        System.out.println("Начальный диапазон");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("Конечный диапазон");
                        int r2 = Integer.parseInt(sc.next());
                        printNumberMedicinCard(patients, r1, r2);
                    }
                    break;
                    default: {
                        end = true;
                    }
                }
            } catch (Exception e) {
                end = true;
            }
        }
    }
//Вывод списка пациентов по диагнозу
public static void printPatient(Patient[] arr, int d) {
        String result;
        switch (d) {
            case 1: {
                result = "диабет";
            }
            break;
            case 2: {
                result = "ишемия";
            }
            break;
            case 3: {
                result = "инфаркт";
            }
            break;
            case 4: {
                result = "инсульт";
            }
            break;
            default: {
                result = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDiagnoz().equals(result)) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого диагноза");
        }
    }
//вывод списка пациентов по номеру медицинской карты
 public static void printNumberMedicinCard(Patient[] arr, int d1, int d2) {
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i].getMedicinCard() > d1) & (arr[i].getMedicinCard() < d2)) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого пациента");
        }
    }
}

