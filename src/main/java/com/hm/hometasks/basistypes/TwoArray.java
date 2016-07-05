/*
 * Создать двумерный массив m на n элементов, заполнить его случайными 
 * числами. Реализовать методы, позволяющие: 
 * распечатать массив в прямом и обратном порядке 
 * для каждой четной строки вывести все четные элементы массива 
 * для каждого нечетного столбца вывести все нечетные элементы массива 
 * сумму всех элементов, кратных 7 в четных строках 
 * произведение элементов, кратных 3 в нечетных строках 
 */
package com.hm.hometasks.basistypes;

import java.util.Random;

/**
 *
 * @author Osin Vlsdimir
 */
public class TwoArray {

    public static void main(String[] args) {
        int[][] array = createDim();
        System.out.println("Печать элементов в прямом порядке:");
        printDirectOrder(array);
        System.out.println("Печать элементов в обратном порядке:");
        printReverseOrder(array);
        System.out.println("Печать четных элементов в четной строке:");
        printEvenElement(array);
        System.out.println("Печать нечетных элементов в нечетном столбце:");
        printUnevenElement(array);
        System.out.println("Печать суммы всех элементов кратных семи в четных строках:");
        printMultipleSeven(array);
        System.out.println("Печать произведения всех элементов кратных 3 в нечетных строках:");
        printOperationThree(array);
    }

public static void printDirectOrder(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Элемент массива: " + arr[i][j]);
            }
        }
    }

public static int[][] createDim() {
        Random random = new Random();
        int[][] array = new int[10][15];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(20);
            }
        }
        return array;
    }

public static void printReverseOrder(int[][] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            {
                for (int j = arr[i].length - 1; j > 0; j--) {
                    System.out.println("Элемент массива: " + arr[i][j]);
                }
            }
        }

    }

public static void printEvenElement(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            {
                for (int j = arr[i].length - 1; j > 0; j--) {
                    if (i % 2 == 0) {
                        if (arr[i][j] % 2 == 0) {
                            System.out.println("Четный элемент массива: " + arr[i][j]);
                        }
                    }
                }

            }
        }
    }

public static void printUnevenElement(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            {
                for (int j = arr[i].length - 1; j > 0; j--) {
                    if (j % 2 != 0) {
                        if (arr[i][j] % 2 != 0) {
                            System.out.println("Нечетный элемент массива: " + arr[i][j]);
                        }
                    }
                }

            }
        }
    }

public static void printMultipleSeven(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            {
                for (int j = arr[i].length - 1; j > 0; j--) {
                    if (i % 2 == 0) {
                        if (arr[i][j] % 7 == 0) {
                            sum += arr[i][j];
                        }
                    }
                }
            }
        }
        System.out.println("Сумма элементов кратных 7  в четных строках: " + sum);
    }

public static void printOperationThree(int[][] arr) {
        int operation = 0;
        for (int i = 0; i < arr.length; i++) {
            {
                for (int j = arr[i].length - 1; j > 0; j--) {
                    if (i % 2 != 0) {
                        if (arr[i][j] % 3 == 0) {
                            operation *= arr[i][j];
                        }
                    }
                }
            }
        }
        System.out.println("Произведение элементов кратных 3  в нечетных строках: " + operation);
    }

}
