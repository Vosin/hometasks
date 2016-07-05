/*
 * 11. Bus:  Фамилия   и   инициалы   водителя ,  Номер  
 *  автобуса ,  Номер   маршрута ,  
 *  Марка ,  Год   начала   эксплуатации ,  Пробег . Создать   массив   объектов .  Вывести : 
 *  a)   список   автобусов   для   заданного   номера  
 *  маршрута ; 
 *   b)   список   автобусов ,  которые  
 *  эксплуатируются   больше   заданного   срока ; 
 *   c)   список   автобусов ,  пробег   у   которых   больше  
 *  заданного   расстояния . 
 
 */
package com.hm.hometasks.oop_part_1.bus;

import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class BusDemo {

    public static void main(String[] args) {
     Bus[]buses = createListBuses();
     consolIO(buses);
    }
    public static Bus[]createListBuses(){
      //заполняем объект автобус данными
        Bus bs1 = new Bus("Петров В.И", 3, 14, "Лаз", 1998, 1000);
        Bus bs2 = new Bus("Сидоров А.В", 15, 18, "Богдан", 2005, 1100);
        Bus bs3 = new Bus("Джугашвили А.Юв", 23, 22, "Лаз", 2000, 5000);
        Bus bs4 = new Bus("Яковлев Ю.А", 27, 45, "ПАЗ", 2010, 10000);
        Bus bs5 = new Bus("Скубак Е.Ю", 41, 14, "Богдан", 2015, 100000);
        //создаем массив
        Bus[] bs = new Bus[5];
        bs[0] = bs1;
        bs[1] = bs2;
        bs[2] = bs3;
        bs[3] = bs4;
        bs[4] = bs5;
        return bs;
    }
    public static void consolIO(Bus[]buses){
         Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Cписок   автобусов   для   заданного   номера маршрута  введите  : 1 ");
            System.out.println("Список   автобусов ,  которые  эксплуатируются   больше   заданного   срока нажмите - 2 ");
            System.out.println("Список   автобусов ,  пробег   у   которых   больше  заданного   расстояния  нажмите - 3 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        System.out.println("Введите номер маршрута:");
                        int r = Integer.parseInt(sc.next());
                        printNumberMarshruta(buses, r);
                    }
                    break;
                    case 2: {
                        System.out.println("Введите срок эксплуатации");
                        int r1 = Integer.parseInt(sc.next());
                        printSrokEkspluatatsii(buses, r1);
                    }
                    break;
                    case 3: {
                        System.out.println("Введите  пробег");
                        int r1 = Integer.parseInt(sc.next());
                        printProbeg(buses, r1);
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
//Cписок   автобусов   для   заданного   номера маршрута
public static void printNumberMarshruta(Bus[] arr, int numberMarschruta) {
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getNumberMarshruta() == numberMarschruta) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого маршрута");
        }
    }
//Список   автобусов ,  которые  эксплуатируются   больше   заданного   срока
 public static void printSrokEkspluatatsii(Bus[] arr, int srokEkspluatasii) {
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].SrokEkspluatasii() > srokEkspluatasii) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого  срока эксплуатации");
        }
    }
//Список   автобусов ,  пробег   у   которых   больше  заданного   расстояния
public static void printProbeg(Bus[] arr, int probeg) {
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getProbeg() > probeg) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого  пробега");
        }
    }

}

