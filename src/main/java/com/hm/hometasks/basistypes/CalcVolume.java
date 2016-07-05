/*
 * Используя данные задания 2 создать программу, которая 
 * рассчитывает: 
 * объем цилиндра  ​
 * объем полого цилиндра  ​
 * площадь боковой 
 * поверхности цилиндра (не полого)  
 * объем шара, площадь поверхности шара 
 * объем, площадь поверхности прямоугольного параллелепипеда 
 * объем, площадь поверхности тетраэдра   .
 */
package com.hm.hometasks.basistypes;

import static com.hm.hometasks.basistypes.Calculation.areaCircle;
import static com.hm.hometasks.basistypes.Calculation.areaTriangle;
import static com.hm.hometasks.basistypes.Calculation.lengthCircle;
import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class CalcVolume {

    public static void main(String[] args) {
        consolIO();

    }

public static void consolIO() {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Для расчета объема  цилиндра введите : 1 ");
            System.out.println("Для расчета объема  полого  цилиндра  введите : 2 ");
            System.out.println("Для расчета площади боковой поверхности цилиндра (не полого) : 3 ");
            System.out.println("Для расчета объема шара введите : 4 ");
            System.out.println("Для расчета площади поверхности шара  введите : 5 ");
            System.out.println("Для расчета объема прямоугольного параллелепипеда : 6 ");
            System.out.println("Для расчета площади поверхности прямоугольного параллелепипеда : 7 ");
            System.out.println("Для расчета объема тетраэдра : 8 ");
            System.out.println("Для расчета площади тетраэдра : 9 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        System.out.println("Введите радиус вписанной окружности: ");
                        int r = Integer.parseInt(sc.next());
                        System.out.println("Введите высоту цилиндра: ");
                        int h = Integer.parseInt(sc.next());
                        System.out.println("Объем  цилиндра = " + " " + volumeCilinder(r, h));
                    }
                    break;
                    case 2: {
                        System.out.println("Введите радиус вписанной окружности: ");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("Введите радиус описанной окружности: ");
                        int r2 = Integer.parseInt(sc.next());
                        System.out.println("Введите высоту полого цилиндра: ");
                        int h = Integer.parseInt(sc.next());
                        System.out.println("Объема  полого  цилиндра = " + " " + volumePolCilinder(r1, r2, h));
                    }
                    break;
                    case 3: {
                        System.out.println("Введите радиус вписанной окружности: ");
                        int r = Integer.parseInt(sc.next());
                        System.out.println("Введите высоту цилиндра: ");
                        int h = Integer.parseInt(sc.next());
                        System.out.println("Площадь боковой поверхности цилиндра (не полого) = " + " " + areaCilinder(r, h));
                    }
                    break;
                    case 4: {
                        System.out.println("Введите диаметр шара: ");
                        int d = Integer.parseInt(sc.next());
                        System.out.println("Объем шара = " + " " + volumeBall(d));
                    }
                    break;
                    case 5: {
                        System.out.println("Введите диаметр шара: ");
                        int d = Integer.parseInt(sc.next());
                        System.out.println("Площадь поверхности шара  = " + " " + areaBall(d));
                    }
                    break;
                    case 6: {
                        System.out.println("Введите сторону паралеллипипида а: ");
                        int a = Integer.parseInt(sc.next());
                        System.out.println("Введите сторону паралеллипипида в: ");
                        int b = Integer.parseInt(sc.next());
                        System.out.println("Введите сторону паралеллипипида с: ");
                        int c = Integer.parseInt(sc.next());
                        System.out.println("Объем прямоугольного параллелепипеда = " + " " + volumeParalelipipid(a, b, c));
                    }
                    break;
                    case 7: {
                        System.out.println("Введите сторону паралеллипипида а: ");
                        int a = Integer.parseInt(sc.next());
                        System.out.println("Введите сторону паралеллипипида в: ");
                        int b = Integer.parseInt(sc.next());
                        System.out.println("Введите сторону паралеллипипида с: ");
                        int c = Integer.parseInt(sc.next());
                        System.out.println("Площадь поверхности прямоугольного параллелепипеда = " + " " + areaParalelipipid(a, b, c));
                    }
                    break;
                    case 8: {
                        System.out.println("Введите сторону треугольника  в: ");
                        int b = Integer.parseInt(sc.next());
                        System.out.println("Введите высоту треугольника h: ");
                        int h = Integer.parseInt(sc.next());
                        System.out.println("Объем тетраэдра = " + " " + volumeTetraedr(b, h));
                    }
                    break;
                    case 9: {
                        System.out.println("Введите сторону треугольника а: ");
                        int a = Integer.parseInt(sc.next());
                        System.out.println("Площадь тетраэдра = " + " " + areaTetraedr(a));
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

    //расчет объема цилиндра
public static double volumeCilinder(int r, int h) {
        return (double) (areaCircle(r) * h);
    }

    //расчет объема полого цилиндра
public static double volumePolCilinder(int r1, int r2, int h) {
        double res = r2 > r1 ? Math.PI * h * ((r2 * r2) - (r1 * r1)) : 0;
        return (double) (res);
    }

    //площадь боковой поверхности цилиндра не полого
public static double areaCilinder(int r, int h) {
        return (double) (lengthCircle(r) * h);
    }

    //Объем шара
public static double volumeBall(int d) {
        return (double) ((Math.PI * d * d * d) / 6);
    }
    //площадь поверхности шара

public static double areaBall(int d) {
        return (double) (Math.PI * d * d);
    }

    //объем параллелепипеда
public static double volumeParalelipipid(int a, int b, int c) {
        return (double) (a * b * c);
    }

    //площадь поверхности параллелепипеда
public static double areaParalelipipid(int a, int b, int c) {
        return (double) (2 * (a * b + b * c + a * c));
    }
    //объем тетраэдра

public static double volumeTetraedr(int b, int h) {
        return (double) (0.3 * (areaTriangle(b, h)) * h);
    }
    //площадь поверхности тетраэдра

public static double areaTetraedr(int a) {
        return (double) (a * a * Math.sqrt(3));
    }

}
