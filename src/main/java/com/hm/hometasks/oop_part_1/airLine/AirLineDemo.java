/*
 * 12. Airline:  Пункт   назначения ,  Номер   рейса ,  Тип  
 *  самолета ,  Время   вылета ,  Дни   недели .  
 *  Создать   массив   объектов .  Вывести : 
 *  a)   список   рейсов   для   заданного   пункта  
 *  назначения ; 
 *  b)   список   рейсов   для   заданного   дня   недели ; 
 *  c)   список   рейсов   для   заданного   дня   недели , 
 *  время   вылета   для   которых   больше   заданного . 
 */
package com.hm.hometasks.oop_part_1.airLine;

import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class AirLineDemo {

    public static void main(String[] args) {
        AirLine[] airLines = createListAirLines();
        consolIO(airLines);
    }

    public static AirLine[] createListAirLines() {
        //заполняем объект лайнер данными
        AirLine ar1 = new AirLine("Москва", 3, "Пассажирский", 12.00, "Понедельник");
        AirLine ar2 = new AirLine("Питер", 15, "Грузовой", 15.45, "Вторник");
        AirLine ar3 = new AirLine("Вашингтон", 23, "Пассажирский", 16.00, "Пятница");
        AirLine ar4 = new AirLine("НьюЙорк", 27, "Пассажирский", 12.00, "Суббота");
        AirLine ar5 = new AirLine("Москва", 41, "Грузовой", 00.45, "Пятница");
        //создаем массив
        AirLine[] ar = new AirLine[5];
        ar[0] = ar1;
        ar[1] = ar2;
        ar[2] = ar3;
        ar[3] = ar4;
        ar[4] = ar5;
        return ar;
    }

    public static void consolIO(AirLine[] airLines) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Cписок   рейсов   для   заданного   пункта назначения   введите  : 1 ");
            System.out.println("Cписок   рейсов   для   заданного   дня   недели нажмите - 2 ");
            System.out.println("Cписок   рейсов   для   заданного   дня   недели время   вылета   для   которых   больше   заданного  нажмите - 3 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        System.out.println("Введите пункт назначения:Москва -1,Питер-2,Вашингтон-3,НьюЙорк-4");
                        int r = Integer.parseInt(sc.next());
                        printDestination(airLines, r);
                    }
                    break;
                    case 2: {
                        System.out.println("Введите день недели понедельник-1; вторник-2; среда-3;четверг-4;пятница-5;суббота -6; воскресенье-7");
                        int r1 = Integer.parseInt(sc.next());
                        printDays(airLines, r1);
                    }
                    break;
                    case 3: {

                        System.out.println("Введите день недели понедельник-1; вторник-2; среда-3;четверг-4;пятница-5;суббота -6; воскресенье-7");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("Введите  время вылета");
                        double r2 = Double.parseDouble(sc.next());
                        printTimeDeparture(airLines, r1, r2);
                    }
                    break;
                    default: {
                        end = true;
                    }
                }
            } catch (Exception e) {
                end = true;
            }
            System.out.println("Желаете продолжить: 1 -Да,0-Нет ");
            int contunue = Integer.parseInt(sc.next());
            if (contunue == 1) {
                end = false;
            } else {
                end = true;
            }
        }
    }
//Cписок   рейсов   для   заданного   пункта назначения

    public static void printDestination(AirLine[] arr, int destination) {
        String result;
        switch (destination) {
            case 1: {
                result = "Москва";
            }
            break;
            case 2: {
                result = "Питер";
            }
            break;
            case 3: {
                result = "Вашингтон";
            }
            break;
            case 4: {
                result = "НьюЙорк";
            }
            break;
            default: {
                result = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDestination().equals(result)) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого пункта назначения");
        }
    }
//Cписок   рейсов   для   заданного   дня   недели

    public static void printDays(AirLine[] arr, int day) {
        String result;
        switch (day) {
            case 1: {
                result = "Понедельник";
            }
            break;
            case 2: {
                result = "Вторник";
            }
            break;
            case 3: {
                result = "Среда";
            }
            break;
            case 4: {
                result = "Четверг";
            }
            break;
            case 5: {
                result = "Пятница";
            }
            break;
            case 6: {
                result = "Суббота";
            }
            break;
            case 7: {
                result = "Воскресенье";
            }
            break;
            default: {
                result = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDays().equals(result)) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого  рейса  в этот день");
        }
    }
//Cписок   рейсов   для   заданного   дня   недели время   вылета   для   которых   больше   заданного

    public static void printTimeDeparture(AirLine[] arr, int day, double timeDepature) {
        String result;
        switch (day) {
            case 1: {
                result = "Понедельник";
            }
            break;
            case 2: {
                result = "Вторник";
            }
            break;
            case 3: {
                result = "Среда";
            }
            break;
            case 4: {
                result = "Четверг";
            }
            break;
            case 5: {
                result = "Пятница";
            }
            break;
            case 6: {
                result = "Суббота";
            }
            break;
            case 7: {
                result = "Воскресенье";
            }
            break;
            default: {
                result = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i].getDays().equals(result)) & (arr[i].getTimeDeparture() > timeDepature)) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого  времени вылета ");
        }
    }

}
