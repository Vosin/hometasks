/*
 * Создать одномерный массив на n элементов, заполнить его случайными 
 * числами. Реализовать методы, позволяющие: 
 * вывести все элементы массива в прямом и обратном порядке 
 * вывести все четные элементы массива 
 * вывести все нечетные элементы массива 
 * сумму элементов, кратных 7 
 * произведение элементов, кратных 3
 */
package com.hm.hometasks.basistypes;

import java.util.Random;

/**
 *
 * @author Osin Vlsdimir
 */
public class OneArray {

    public static void main(String[] args) {
        int[] array = createArray();
        System.out.println("Печать элементов в прямом порядке:");
        printDirectOrder(array);
        System.out.println("Печать элементов в обратном порядке:");
        printReverseOrder(array);
        System.out.println("Печать четных элементов :");
        printEvenElement(array);
        System.out.println("Печать нечетных элементов :");
        printUnevenElement(array);
        printMultipleSeven(array);
        printOperationThree(array);

    }

    static int[] createArray() {
        Random random = new Random();
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        return array;
    }

    static void printDirectOrder(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Элемент массива: " + arr[i]);
        }
    }

    static void printReverseOrder(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            System.out.println("Элемент массива: " + arr[i]);
        }
    }

    static void printEvenElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Четный элемент массива: " + arr[i]);
            }
        }
    }

    static void printUnevenElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println("Нечетный элемент массива: " + arr[i]);
            }
        }
    }

    static void printMultipleSeven(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 7 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("Сумма элементов кратных 7: " + sum);
    }

    static void printOperationThree(int[] arr) {
        int operation = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                operation *= arr[i];
            }
        }
        System.out.println("Произведение элементов кратных 3: " + operation);

    }
}
