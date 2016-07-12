/*
 * Используя циклические конструкции и массивы создать “рваный массив” 
 * треугольной формы, реализовать вывод данного массива в виде треугольника в 
 * консоль. Реализовать методы, отражающие данный “треугольник” 
 * по горизонтали 
 * по вертикали 
 * по горизонтали и вертикали одновременно   
 */
package com.hm.hometasks.basistypes;

import java.util.Arrays;

/**
 *
 * @author Osin Vladimir
 */
public class UnevenArray {

    public static void main(String[] args) {
        int[][] array = createDim();
        System.out.println("Печать в виде треугольника:" + " ");
        printTriangle(array);
        System.out.println("Отражение по горизонтали:" + " ");
        mirrorHorizontally(array);
        System.out.println("Отражение по вертикали:" + " ");
        mirrorVertically(array);
        System.out.println("Отражение одновременно по горизонтали и по  вертикали:" + " ");
        mirrorHorizontallyVertically(array);
    }

    public static int[][] createDim() {
        int[][] array = new int[5][];
        for (int i = 0; i < 5; i++) {
            array[i] = new int[i + 1];
        }
        return array;
    }

    public static void printTriangle(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void mirrorHorizontally(int[][] arr) {
       String space8 = " " + " " + " " + " " + " " + " " + " " + " "; 
       String space6 = " " + " " + " " + " " + " " + " ";
       String space4 = " " + " " + " " + " ";
       String space2 = " " + " ";
       String space1 = " ";
       
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i == 0) & (j == 0)) {
                    System.out.print(space8 + arr[i][j]);
                } else if ((i == 1) & (j == 0)) {
                    System.out.print(space6 + arr[i][j]);
                } else if ((i == 1) & (j == 1)) {
                    System.out.print(space1 + arr[i][j]);
                } else if ((i == 2) & (j == 0)) {
                    System.out.print(space4 + arr[i][j]);
                } else if ((i == 2) & (j == 1)) {
                    System.out.print(space1 + arr[i][j]);
                } else if ((i == 2) & (j == 2)) {
                    System.out.print(space1 + arr[i][j]);
                } else if ((i == 3) & (j == 0)) {
                    System.out.print(space2 + arr[i][j]);
                } else if ((i == 3) & (j == 1)) {
                    System.out.print(space1 + arr[i][j]);
                } else if ((i == 3) & (j == 2)) {
                    System.out.print(space1 + arr[i][j]);
                } else if ((i == 3) & (j == 3)) {
                    System.out.print(space1 + arr[i][j]);
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

    }

    public static void mirrorVertically(int[][] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void mirrorHorizontallyVertically(int[][] arr) {
       String space8 = " " + " " + " " + " " + " " + " " + " " + " "; 
       String space6 = " " + " " + " " + " " + " " + " ";
       String space4 = " " + " " + " " + " ";
       String space2 = " " + " ";
       String space1 = " ";
       
         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i == 0) & (j == 0)) {
                    System.out.print(space8 + arr[i][j]);
                    System.out.println(" ");
                    System.out.print(arr[i][j]);
                    System.out.println("\r");
                     } else if ((i == 1) & (j == 0)) {
                    System.out.print(space6 + arr[i][j]);
    }

    }   
}
}
}
