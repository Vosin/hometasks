/*
 *10. Train:  Пункт   назначения ,  Номер   поезда ,  Время  
 *    отправления ,  Число   мест   
 *   ( общих ,  купе ,  плацкарт ,  люкс ). 
 *   Создать   массив   объектов .  Вывести : 
 *   a)   список   поездов ,  следующих   до   заданного  
 *   пункта   назначения ; 
 *   b)   список   поездов ,  следующих   до   заданного  
 *   пункта   назначения   и   отправ ­ ляющихся   после  
 *   заданного   часа ; 
 *   c)   список   поездов ,  отправляющихся   до  
 *   заданного   пункта   назначения   
 *   и   имеющих   общие   места . 
 */
package com.hm.hometasks.oop_part_1.train;

import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class TrainDemo {

    public static void main(String[] args) {
        Train[] trains = createListTrains();
        consolIO(trains);
    }

    public static Train[] createListTrains() {
        //заполняем объект поезд данными
        Train tr1 = new Train("Москва", 3, 14.20, 10, 30, 50, 60);
        Train tr2 = new Train("Питер", 5, 18.30, 15, 15, 15, 25);
        Train tr3 = new Train("Киев", 3, 22.00, 0, 25, 148, 56);
        Train tr4 = new Train("Львов", 27, 18.45, 0, 15, 200, 35);
        Train tr5 = new Train("Киев", 41, 14.00, 15, 15, 200, 125);
        //создаем массив
        Train[] tr = new Train[5];
        tr[0] = tr1;
        tr[1] = tr2;
        tr[2] = tr3;
        tr[3] = tr4;
        tr[4] = tr5;
        return tr;
    }

    public static void consolIO(Train[] trains) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Cписок   поездов ,  следующих   до   заданного  пункта   назначения  введите  : 1 ");
            System.out.println("Cписок   поездов ,  следующих   до   заданного  пункта   назначения   и   отправляющихся   после  заданного   часа введите 2 ");
            System.out.println("Список   поездов ,  отправляющихся   до заданного   пункта   назначения и имеющих общие   места нажмите : 3 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        System.out.println("Введите пункт назначения: Москва -1;Питер-2;Киев-3;Львов-4");
                        int r = Integer.parseInt(sc.next());
                        printDestination(trains, r);
                    }
                    break;
                    case 2: {
                        System.out.println("Введите пункт назначения: Москва -1;Питер-2;Киев-3;Львов-4");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("Введите время отправления ");
                        double r2 = Double.parseDouble(sc.next());
                        printTimeDestination(trains, r1, r2);
                    }
                    break;
                    case 3: {
                        System.out.println("Введите пункт назначения: Москва -1;Питер-2;Киев-3;Львов-4");
                        int r1 = Integer.parseInt(sc.next());
                        printNumberSeatsOveral(trains, r1);
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
//Cписок   поездов ,  следующих   до   заданного  пункта   назначения

    public static void printDestination(Train[] arr, int destination) {
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
                result = "Киев";
            }
            break;
            case 4: {
                result = "Львов";
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
            System.out.println("Нет такого  пункта назначения");
        }
    }
//Cписок   поездов ,  следующих   до   заданного  пункта   назначения   и   отправляющихся   после  заданного   часа

    public static void printTimeDestination(Train[] arr, int destination, double timeDeparture) {
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
                result = "Киев";
            }
            break;
            case 4: {
                result = "Львов";
            }
            break;
            default: {
                result = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i].getDestination().equals(result)) & (arr[i].getTimeDeparture() > timeDeparture)) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого  пункта назначения и времени отправления");
        }
    }
//Список   поездов ,  отправляющихся   до заданного   пункта   назначения и имеющих общие   места1

    public static void printNumberSeatsOveral(Train[] arr, int destination) {
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
                result = "Киев";
            }
            break;
            case 4: {
                result = "Львов";
            }
            break;
            default: {
                result = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i].getDestination().equals(result)) & (arr[i].getNumberSeatsOveral() > 0)) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого  пункта назначения и количества общих мест");
        }
    }

}
