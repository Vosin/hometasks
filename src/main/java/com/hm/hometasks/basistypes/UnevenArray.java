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
        System.out.println("Печать по горизонтали:" + " ");
        horizontally(array);
        System.out.println("Печать по вертикали:" + " ");
        vertically(array);
        System.out.println("Печать одновременно по горизонтали и по  вертикали:" + " ");
        horizontallyVertically(array);
    }

public static int[][] createDim() {
        int[][] array = new int[8][];
        array[0] = new int[1];
        array[1] = new int[2];
        array[2] = new int[3];
        array[3] = new int[4];
        array[4] = new int[5];
        array[5] = new int[6];
        array[6] = new int[7];
        array[7] = new int[8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
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
