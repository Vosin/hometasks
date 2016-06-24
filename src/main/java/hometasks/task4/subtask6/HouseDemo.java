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
package hometasks.task4.subtask6;

import java.util.Scanner;

/**
 *
 * @author Osin vladimir
 */
public class HouseDemo {

    public static void main(String[] args) {
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
                        printCountRoom(hs, r);
                    }
                    break;
                    case 2: {
                        System.out.println("Введите заданное число комнат");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("Введите начальное значение этажа(начиная с 1)");
                        int r2 = Integer.parseInt(sc.next());
                        System.out.println("Введите конечное значение этажа(максимум 9)");
                        int r3 = Integer.parseInt(sc.next());
                        printFloor(hs, r1, r2, r3);
                    }
                    break;
                    case 3: {
                        System.out.println("Введите заданную площадь ");
                        int sq = Integer.parseInt(sc.next());
                        printYear(hs, sq);
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

    static void printFloor(House[] arr, int countRoom, int starFloor, int endFloor) {
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

    static void printCountRoom(House[] arr, int countRoom) {
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

    static void printYear(House[] arr, int square) {
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

class House {
//определяем поля класса

    private int id;
    private int numberFlat;
    private int square;
    private int floor;
    private int countRoom;
    private String street;
    private String typeBild;
    private int termEkspluatatii;

//определяем конструкторы
    House() {
    }

    House(int id, int numberFlat, int square, int floor, int countRoom, String street, String typeBild, int termEkspluatatii) {
        this.id = id;
        this.numberFlat = numberFlat;
        this.square = square;
        this.floor = floor;
        this.countRoom = countRoom;
        this.street = street;
        this.typeBild = typeBild;
        this.termEkspluatatii = termEkspluatatii;

    }

    House(int numberFlat, int square, int floor, int countRoom, String street) {
        this.numberFlat = numberFlat;
        this.square = square;
        this.floor = floor;
        this.countRoom = countRoom;
        this.street = street;

    }

    House(String street, String typeBild, int termEkspluatatii) {
        this.street = street;
        this.typeBild = typeBild;
        this.termEkspluatatii = termEkspluatatii;

    }
//определяем геттеры и сеттеры

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNumberFlat(int numberFlat) {
        this.numberFlat = numberFlat;
    }

    public int getNumberFlat() {
        return numberFlat;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getSquare() {
        return square;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    public void setCountRoom(int countRoom) {
        this.countRoom = countRoom;
    }

    public int getCountRoom() {
        return countRoom;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setTypeBild(String typeBild) {
        this.typeBild = typeBild;
    }

    public String getTypeBild() {
        return typeBild;
    }

    public void setTermEkspluatatii(int termEkspluatatii) {
        this.termEkspluatatii = termEkspluatatii;
    }

    public int getTermEkspluatatii() {
        return termEkspluatatii;
    }

    @Override
    public String toString() {
        return "Дом" + " " + "id =" + " " + id + " " + "Номер квартиры=" + numberFlat + " " + "Площадь=" + " " + square + " " + "Этаж =" + floor + " "
                + "Количество комнат=" + " " + countRoom + " " + "Улица:" + " " + street + " Тип здания=" + " "
                + typeBild + ": " + "Срок эксплуатации=" + " " + termEkspluatatii;
    }
}
