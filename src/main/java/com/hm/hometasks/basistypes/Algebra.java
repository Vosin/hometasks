/*
 * С помощью арифметических операций, операций сравнения и конструкций 
 * if­else и циклических операций создать приложение которое: 
 * в последовательности чисел от 0 до 100 выводит все значения кратные 2, 3, 5, 
   7 
 * находит сумму чисел для каждой из этих последовательностей 
 * вычисляет разность сумм последовательности чисел, кратных 7 и 2 
 * вычисляет отношение последовательности чисел, кратных 5 к 
 * последовательности чисел, кратных 3
 */
package com.hm.hometasks.basistypes;

/**
 *
 * @author OsinVladimir
 */
public class Algebra {

    public static void main(String[] args) {
        int sumTwo;
        int sumSeven;
        int sumThree;
        int sumFive;

        sumTwo = 0;
        sumSeven = 0;
        sumThree = 0;
        sumFive = 0;

        int sTwo = valuesMultiplesTwo(sumTwo);
        double sThree = valuesMultiplesThree(sumThree);
        double sFive = valuesMultiplesFive(sumFive);
        int sSeven = valuesMultiplesSeven(sumSeven);

        System.out.println("Разность сумм последовательностей кратных 7 и 2: " + " " + differentSevenTwo(sSeven, sTwo));
        System.out.println("Отношение сумм последовательностей кратных 5 к 3: " + " " + ratioFiveThree(sFive, sThree));
    }

    //Значения кратные двум
    static int valuesMultiplesTwo(int sumT) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Значения кратные 2: " + " " + i);
                sumT += i;
            }
        }
        System.out.println("Сумма значений кратных 2: " + " " + sumT);
        return sumT;
    }
    //Значения кратные трем

    static int valuesMultiplesThree(int sumTh) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Значения кратные 3: " + " " + i);
                sumTh += i;
            }
        }
        System.out.println("Сумма значений кратных 3: " + " " + sumTh);
        return sumTh;
    }

    //Значения кратные пяти
    static int valuesMultiplesFive(int sumF) {
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println("Значения кратные 5: " + " " + i);
                sumF += i;
            }
        }
        System.out.println("Сумма значений кратных 5: " + " " + sumF);
        return sumF;
    }

    //Значения кратные семи
    static int valuesMultiplesSeven(int sumS) {

        for (int i = 0; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println("Значения кратные 7: " + " " + i);
                sumS += i;
            }
        }
        System.out.println("Сумма значений кратных 7: " + " " + sumS);
        return sumS;
    }

    //вычисляем разность семерки сумм последовательностей семи и двойки
    static int differentSevenTwo(int sumS, int sumT) {
        return sumS - sumT;
    }

    // вычисляет соотношение сумм пяти к трем
    static double ratioFiveThree(double sumF, double sumTh) {
        return (sumF / sumTh);
    }
}
