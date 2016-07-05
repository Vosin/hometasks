/*
 * House: id,  Номер   квартиры ,  Площадь ,  Этаж , 
 *  Количество   комнат ,  Улица ,  Тип   здания ,  Срок  
 *  эксплуатации . 
 *  Создать   массив   объектов .  Вывести : 
 *  a)   список   квартир ,  имеющих   заданное   число  
 *  комнат ; 
 *  b)   список   квартир ,  имеющих   заданное   число  
 *  комнат   и    расположенных   
 *  на   этаже ,  который   находится   в   заданном  
 *  промежутке ; 
 *  c)   список   квартир ,  имеющих   площадь , 
 *  превосходящую   заданную . 
 */
package com.hm.hometasks.oop_part_1.house;

import java.util.Scanner;

/**
 *
 * @author Osin vladimir
 */
public class HouseDemo {

    public static void main(String[] args) {
        House[]houses = createListHouses();
        consolIO(houses);
       
    }
public static House[]createListHouses(){
  //заполняем объект дом данными
        House h1 = new House(1, 127, 55, 3, 3, "Широнинцев", "Многоэтажка", 100);
        House h2 = new House(2, 250, 65, 2, 2, "Тимуровцев", "Пятиэтажка", 50);
        House h3 = new House(3, 380, 45, 1, 1, "Героев труда", "Многоэтажка", 100);
        House h4 = new House(4, 789, 65, 5, 2, "Блюхера", "Пятиэтажка", 50);
        House h5 = new House(5, 456, 55, 9, 3, "Тринклера", "Многоэтажка", 100);
        //создаем массив
        House[] hs = new House[5];
        hs[0] = h1;
        hs[1] = h2;
        hs[2] = h3;
        hs[3] = h4;
        hs[4] = h5;
        return hs;
}
public static void consolIO(House[]houses){
    Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Cписок   квартир ,  имеющих   заданное   число  комнат нажмите: 1 ");
            System.out.println("Cписок   квартир ,  имеющих   заданное   число  комнат и расположенных  на   этаже ,  который   находится   в   заданном промежутке нажмите: 2 ");
            System.out.println("Список   квартир ,  имеющих   площадь  превосходящую   заданную  нажмите : 3 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        System.out.println("Введите заданное число комнат");
                        int r = Integer.parseInt(sc.next());
                        printCountRoom(houses, r);
                    }
                    break;
                    case 2: {
                        System.out.println("Введите заданное число комнат");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("Введите начальное значение этажа(начиная с 1)");
                        int r2 = Integer.parseInt(sc.next());
                        System.out.println("Введите конечное значение этажа(максимум 9)");
                        int r3 = Integer.parseInt(sc.next());
                        printFloor(houses, r1, r2, r3);
                    }
                    break;
                    case 3: {
                        System.out.println("Введите заданную площадь ");
                        int sq = Integer.parseInt(sc.next());
                        printSquare(houses, sq);
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
//Печать квартир с заданным числом комнат
 public static void printFloor(House[] arr, int countRoom, int starFloor, int endFloor) {
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i].getCountRoom() == countRoom) & (arr[i].getFloor() > starFloor) & (arr[i].getFloor() < endFloor)) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такой квартиры");
        }
    }
//Cписок   квартир ,  имеющих   заданное   число  комнат и расположенных  на   этаже ,  который   находится   в   заданном промежутке
 public static void printCountRoom(House[] arr, int countRoom) {
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getCountRoom() == countRoom) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такой квартиры");
        }
    }
//Список   квартир ,  имеющих   площадь  превосходящую   заданную
 public static void printSquare(House[] arr, int square) {
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSquare() > square) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такой квартиры");
        }
    }
}

