/*
 * Реализовать приложение, которое производит операции циклического сдвига 
 *  над прямоугольным массивом (матрицей). Организовать методы, которые позволяют 
 *  произвести сдвиг: 
 *  на n позиций влево 
 *  на n позиций вправо 
 *  на n позиций вверх 
 *  на n позиций вниз 
 */
package com.hm.hometasks.basistypes;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class CyclicShift {

    public static void main(String[] args) {
        int[][] sourceDim = createDim();
        System.out.println("Исходный массив" + " ");
        for (int[] x : sourceDim) {
            System.out.println(Arrays.toString(x));
        }
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Укажите число на сколько нужно сдвинуть массив(целое, положительное) ");
            try {
                int result = Integer.parseInt(sc.next());
                if (result > 0) {
                    System.out.println("Массив сдвинутый  вправо  на" + " " + result + " " + "элементов");
                    int[][] destinationDimR = shift(sourceDim, result, "right");
                    for (int[] y : destinationDimR) {
                        System.out.println(Arrays.toString(y));
                    }
                    System.out.println("Массив сдвинутый  влево  на" + " " + result + " " + "элементов");
                    int[][] destinationDimL = shift(sourceDim, result, "left");
                    for (int[] x : destinationDimL) {
                        System.out.println(Arrays.toString(x));
                    }
                    System.out.println("Массив сдвинутый  вверх  на" + " " + result + " " + "элементов");
                    int[][] destinationDimU = shift(sourceDim, result, "Up");
                    for (int[] z : destinationDimU) {
                        System.out.println(Arrays.toString(z));
                    }
                    System.out.println("Массив сдвинутый  вниз  на" + " " + result + " " + "элементов");
                    int[][] destinationDimD = shift(sourceDim, result, "Down");
                    for (int[] w : destinationDimD) {
                        System.out.println(Arrays.toString(w));
                    }

                } else {
                    System.out.println("Вы ввели отрицательное число!!");
                }

            } catch (Exception e) {
                end = true;

            }
        }

    }

    //создаем прямоугольную матрицу
    static int[][] createDim() {
        int k = 1;
        int[][] dim = new int[7][10];
        for (int i = 0; i < dim.length; i++) {
            for (int j = 0; j < dim[i].length; j++) {
                dim[i][j] = k;
                ++k;
            }
        }
        return dim;
    }

    /*Собственно процедура сдвига матрицы
     *count - переменная количества сдвигов
     *shift - строка направления сдвига
     */
    static int[][] shift(int[][] sourceArr, int count, String shift) {
        int row = sourceArr.length;
        int column = sourceArr[0].length;
        //создаем новый массив
        int[][] destinationArr = new int[row][column];
        switch (shift) {
            case "right":
                for (int i = 0; i < sourceArr.length; ++i) {
                    System.arraycopy(sourceArr[i], sourceArr[i].length - count, destinationArr[i], 0, count);
                    System.arraycopy(sourceArr[i], 0, destinationArr[i], count, sourceArr[i].length - count);
                }
                break;
            case "left":
                for (int i = 0; i < sourceArr.length; ++i) {
                    System.arraycopy(sourceArr[i], count, destinationArr[i], 0, sourceArr[i].length - count);
                    System.arraycopy(sourceArr[i], 0, destinationArr[i], sourceArr[i].length - count, count);
                }
                break;
            case "Up":
                for (int i = 0; i < count; ++i) {
                    destinationArr[sourceArr.length - count + i] = Arrays.copyOf(sourceArr[i], sourceArr[i].length);
                }
                for (int i = count; i < sourceArr.length; ++i) {
                    destinationArr[i - count] = Arrays.copyOf(sourceArr[i], sourceArr[i].length);
                }
                break;
            case "Down":
                for (int i = 0; i < sourceArr.length - count; ++i) {
                    destinationArr[i + count] = Arrays.copyOf(sourceArr[i], sourceArr[i].length);
                }
                for (int i = sourceArr.length - count; i < sourceArr.length; ++i) {
                    destinationArr[i - sourceArr.length + count] = Arrays.copyOf(sourceArr[i], sourceArr[i].length);
                }
                break;
        }
        return destinationArr;
    }
}
