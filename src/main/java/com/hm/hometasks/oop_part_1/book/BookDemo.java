/*
 * Book: id,  Название ,  Автор  ( ы ),  Издательство ,  Год  
 *  издания ,  Количество   стра ­ ниц ,  Цена ,  Тип  
 *  переплета . 
 *  Создать   массив   объектов .  Вывести : 
 *  a)   список   книг   заданного   автора ; 
 *  b)   список   книг ,  выпущенных   заданным  
 *  издательством ; 
 *  c)   список   книг ,  выпущенных   после   заданного  
 *  года . 
 */
package com.hm.hometasks.oop_part_1.book;

import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class BookDemo {

    public static void main(String[] args) {
        Book[] books = createListBooks();
        consolIO(books);
    }

    public static Book[] createListBooks() {
        //заполняем объект книга данными
        Book b1 = new Book(1, "Кир Булычев", "Алиса", "Москва", 1981, 100, 150.25, "мягкий");
        Book b2 = new Book(2, "Иван Семенов", "Алиса", "Питер", 1978, 300, 300.45, "твердый");
        Book b3 = new Book(3, "Петр Сизов", "Алиса", "Питер", 1936, 200, 500.2, "твердый");
        Book b4 = new Book(4, "Кир Булычев", "Алиса", "Харьков", 1948, 800, 1050.0, "мягкий");
        Book b5 = new Book(5, "Аркадий Гайдар", "Алиса", "Москва", 1991, 158, 750.25, "мягкий");
        //создаем массив
        Book[] bk = new Book[5];
        bk[0] = b1;
        bk[1] = b2;
        bk[2] = b3;
        bk[3] = b4;
        bk[4] = b5;
        return bk;
    }

    public static void consolIO(Book[] books) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Cписок   книг   заданного   автора введите  : 1 ");
            System.out.println("Cписок   книг , выпущенных   заданным издательством нажмите : 2 ");
            System.out.println("список   книг ,  выпущенных   после   заданного года нажмите : 3 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        System.out.println("Введите автора: Кир Булычев -1;Иван Семенов-2;Петр Сизов-3;Аркадий Гайдар-4");
                        int r = Integer.parseInt(sc.next());
                        printAutor(books, r);
                    }
                    break;
                    case 2: {
                        System.out.println("Введите издательство: Москва -1;Питер-2;Харьков-3;");
                        int r1 = Integer.parseInt(sc.next());
                        printIzdatelstvo(books, r1);
                    }
                    break;
                    case 3: {
                        System.out.println("Введите год ");
                        int r2 = Integer.parseInt(sc.next());
                        printYear(books, r2);
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
//список книг заданного автора

    public static void printAutor(Book[] arr, int a) {
        String result;
        switch (a) {
            case 1: {
                result = "Кир Булычев";
            }
            break;
            case 2: {
                result = "Иван Семенов";
            }
            break;
            case 3: {
                result = "Петр Сизов";
            }
            break;
            case 4: {
                result = "Аркадий Гайдар";
            }
            break;
            default: {
                result = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAutor().equals(result)) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого автора");
        }
    }
//Список книг по издательству

    public static void printIzdatelstvo(Book[] arr, int iz) {
        String result;
        switch (iz) {
            case 1: {
                result = "Москва";
            }
            break;
            case 2: {
                result = "Питер";
            }
            break;
            case 3: {
                result = "Харьков";
            }
            break;
            default: {
                result = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getIzdatelstvo().equals(result)) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого издательства");
        }
    }
//Список книг по году

    public static void printYear(Book[] arr, int year) {
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getGodIzdania() > year) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого года издания");
        }
    }

}
