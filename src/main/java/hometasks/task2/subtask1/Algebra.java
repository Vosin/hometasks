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
package hometasks.task2.subtask1;

/**
 *
 * @author OsinVladimir
 */
public class Algebra {

    public static void main(String[] args) {
        int sumTwo;
        int sumThree;
        int sumFive;
        int sumSeven;
        int difference;
        int div;

        sumTwo = 0;
        sumThree = 0;
        sumFive = 0;
        sumSeven = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Значения кратные 2: " + " " + i);
                sumTwo += i;
            } else if (i % 3 == 0) {
                System.out.println("Значения кратные 3: " + " " + i);
                sumThree += i;
            } else if (i % 5 == 0) {
                System.out.println("Значения кратные 5: " + " " + i);
                sumFive += i;
            } else if (i % 7 == 0) {
                System.out.println("Значения кратные 7: " + " " + i);
                sumSeven += i;

            }
        }
        System.out.println("Сумма значений кратных 2: " + " " + sumTwo);
        System.out.println("Сумма значений кратных 3: " + " " + sumThree);
        System.out.println("Сумма значений кратных 5: " + " " + sumFive);
        System.out.println("Сумма значений кратных 7: " + " " + sumSeven);
        difference = sumSeven - sumTwo;
        System.out.println("Разность сумм последовательностей кратных 7 и 2: " + " " + difference);
        div = sumFive / sumThree;
        System.out.println("Отношение сумм последовательностей кратных 5 к 3: " + " " + div);

    }

}
