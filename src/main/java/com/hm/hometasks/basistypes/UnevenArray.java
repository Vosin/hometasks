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
//        System.out.println("Печать по горизонтали:" + " ");
//        horizontally(array);
//        System.out.println("Печать по вертикали:" + " ");
//        vertically(array);
//        System.out.println("Печать одновременно по горизонтали и по  вертикали:" + " ");
//        horizontallyVertically(array);
    }

public static int[][] createDim() {
        int[][] array = new int[5][];
         for(int i = 0;i<5;i++){
            array[i]= new int [i+1];
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
public static void horizontally(int[][] arr) {
        System.out.println(Arrays.deepToString(arr));
    }

public static void vertically(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

public static void horizontallyVertically(int[][] arr) {
    horizontally(arr);
    vertically(arr);
    }


}
