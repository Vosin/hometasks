/*
 * Используя числовые типы данных создать программу, которая 
 * рассчитывает: 
 * длину окружности,  ​
 * площадь окружности,  ​
 * площадь кольца 
 * периметр треугольника, площадь треугольника 
 * периметр, площадь прямоугольника 
 */
package hometasks.task1.subtask2;

import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class Calculation {

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Для расчета длины окружности введите : 1 ");
            System.out.println("Для расчета площади окружности введите : 2 ");
            System.out.println("Для расчета площади кольца введите : 3 ");
            System.out.println("Для расчета периметра треугольника введите : 4 ");
            System.out.println("Для расчета площади треугольника  введите : 5 ");
            System.out.println("Для расчета периметра прямоугольника : 6 ");
            System.out.println("Для расчета площади прямоугольника : 7 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        System.out.println("Введите радиус вписанной окружности: ");
                        int r = Integer.parseInt(sc.next());
                        System.out.println("Длина окружности = " + " " + lengthCircle(r));
                    }
                    break;
                    case 2: {
                        System.out.println("Введите радиус вписанной окружности: ");
                        int r = Integer.parseInt(sc.next());
                        System.out.println("Площадь окружности = " + " " + areaCircle(r));
                    }
                    break;
                    case 3: {
                        System.out.println("Введите радиус вписанной окружности: ");
                        int r  = Integer.parseInt(sc.next());
                        System.out.println("Введите радиус описанной окружности: ");
                        int ro = Integer.parseInt(sc.next());
                        System.out.println("Площадь кольца = " + " " + areaRing(r, ro));
                    }
                    break;
                    case 4: {
                        System.out.println("Введите сторону треугольника а: ");
                        int a = Integer.parseInt(sc.next());
                        System.out.println("Введите сторону треугольника в: ");
                        int b = Integer.parseInt(sc.next());
                        System.out.println("Введите сторону треугольника c: ");
                        int c = Integer.parseInt(sc.next());
                        System.out.println("Периметр треугольника = " + " " + perimeterTriangle(a, b, c));
                    }
                    break;
                    case 5: {
                        System.out.println("Введите сторону треугольника а: ");
                        int a = Integer.parseInt(sc.next());
                        System.out.println("Введите высоту треугольника h: ");
                        int h = Integer.parseInt(sc.next());
                        System.out.println("Площадь треугольника = " + " " + areaTriangle(a, h));
                    }
                    break;
                    case 6: {
                        System.out.println("Введите сторону прямоугольника а: ");
                        int a = Integer.parseInt(sc.next());
                        System.out.println("Введите сторону прямоугольника в: ");
                        int b = Integer.parseInt(sc.next());
                        System.out.println("Периметр прямоугольника = " + " " + perimeterRectangular(a, b));
                    }
                    break;
                    case 7: {
                        System.out.println("Введите сторону прямоугольника а: ");
                        int a = Integer.parseInt(sc.next());
                        System.out.println("Введите сторону прямоугольника в: ");
                        int b = Integer.parseInt(sc.next());
                        System.out.println("Площадь прямоугольника = " + " " + areaRectangular(a, b));
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

    //расчет длины окружности
    public static double lengthCircle(int r) {
        return (double) (2 * Math.PI * r);
    }

    //расчет площади окружности
    public static double areaCircle(int r) {
        return (double) (Math.PI * r * r);
    }

    //расчет площади кольца
    public static double areaRing(int r, int ro) {
        return (double) (Math.PI * ((ro * ro) - (r * r)));
    }
    //расчет периметра треугольника

    public static double perimeterTriangle(int a, int b, int c) {
        return (double) (0.5 * (a + b + c));
    }

    //расчет площади треугольника
    public static double areaTriangle(int b, int h) {
        return (double) ((b * h) / 2);
    }

    //расчет периметра прямоугольника
    public static double perimeterRectangular(int a, int b) {
        return (double) (2 * (a + b));
    }

    //расчет площади прямоугольника
    public static double areaRectangular(int a, int b) {
        return (double) (a * b);
    }

}
