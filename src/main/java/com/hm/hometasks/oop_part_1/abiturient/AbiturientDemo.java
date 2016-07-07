/*
 * Abiturient: id,  Фамилия ,  Имя ,  Отчество ,  Адрес , 
 * Телефон ,  Оценки .  
 * Создать   массив   объектов .  Вывести : a)   список   абитуриентов ,  имеющих  
 * неудовлетворительные   оценки ; 
 * b)   список   абитуриентов ,  у   которых   сумма  
 * баллов   выше   заданной ; 
 * c)   выбрать   заданное   число  n абитуриентов , 
 * имеющих   самую   высокую   
 *  сумму   баллов  ( вывести   также   полный   список  
 * абитуриентов ,  имеющих   полупроходную   сумму ). 
 */
package com.hm.hometasks.oop_part_1.abiturient;

import java.util.Scanner;

/**
 * @author Osin vladimir
 */
public class AbiturientDemo {

    public static void main(String[] args) {

        Abiturient[] abiturients = createListAbiturients();
        consolIO(abiturients);

    }

    public static Abiturient[] createListAbiturients() {
        //заполняем объект абитурент данными
        Abiturient a1 = new Abiturient(1, "Иванов", "Иван", "Иванович", "ул.Корчагинцев 2", 10, 8, 12, "123 45 67");
        Abiturient a2 = new Abiturient(2, "Петров", "Сергей", "Иванович", "ул.Блюхера 4", 4, 12, 8, "123 88 67");
        Abiturient a3 = new Abiturient(3, "Сидоров", "Василий", "Митрофанович", "ул.Пушкинская44", 6, 10, 12, "123 88 67");
        Abiturient a4 = new Abiturient(4, "Козлов", "Валентин", "Ильич", "ул.Блюхера 4", 12, 10, 10, "123 88 67");
        Abiturient a5 = new Abiturient(5, "Быков", "Петр", "Васильевич", "ул.Пушкинская44", 8, 6, 12, "123 88 67");
        //создаем массив
        Abiturient[] at = new Abiturient[5];
        at[0] = a1;
        at[1] = a2;
        at[2] = a3;
        at[3] = a4;
        at[4] = a5;
        return at;
    }

    public static void consolIO(Abiturient[] abiturients) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Для списка   абитуриентов ,  имеющих  неудовлетворительные   оценки введите  : 1 ");
            System.out.println("Для списка   абитуриентов ,  у   которых   сумма  баллов   выше   заданной нажмите : 2 ");
            System.out.println("Для списка   абитуриентов ,   имеющих   самую   высокую сумму   баллов нажмите : 3 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        printAbiturient(abiturients);
                    }
                    break;
                    case 2: {
                        System.out.println("Задайте сумму баллов");
                        int r1 = Integer.parseInt(sc.next());
                        printSumBall(abiturients, r1);
                    }
                    break;
                    case 3: {
                        System.out.println("Задайте количество абитурьентов, но не больше 5");
                        int r1 = Integer.parseInt(sc.next());
                        printHighSumBall(abiturients, r1);
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
//Печать списка с неудовлетворительными оценками

    public static void printAbiturient(Abiturient[] arr) {
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].badBall() == true) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет таких абитурьентов");
        }
    }
//Печать у которых сумма баллов выше заданной

    public static void printSumBall(Abiturient[] arr, int count) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].sumAllBall() > count) {
                System.out.println("Сумма баллов выше заданной");
                System.out.println(arr[i].toString());
            } else {
                System.out.println("Сумма баллов меньше заданной");
                System.out.println(arr[i].toString());
            }
        }
    }
//самая высокая сумма баллов

    public static void printHighSumBall(Abiturient[] arr, int countAbiturient) {

        int maxValue = 30;//задаем проходной балл
        int maxValue2 = 15;//задаем полупроходной балл

        for (int i = 0; i < countAbiturient; i++) {
            if (arr[i].sumAllBall() > maxValue) {
                System.out.println("Сумма баллов высокая");
                System.out.println(arr[i].toString());
            } else if (arr[i].sumAllBall() == maxValue2) {
                System.out.println("Сумма баллов полупроходная");
                System.out.println(arr[i].toString());
            }
        }
    }
}
