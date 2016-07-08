/*
 * 2.  Новогодний   подарок .  Определить   иерархию   конфет  
 *  и   прочих   сладостей . 
 *  Создать   несколько   объектов ­ конфет .  Собрать  
 *  детский   подарок   с   определением   его   веса .  Провести  
 *  сортировку   конфет   в   подарке   на   основе   одного   из  
 *  параметров .  Найти   конфету   в   подарке , 
 *  соответствующую   заданному   диапазону   содержания  
 *  сахара . 
 */
package com.hm.hometasks.oop_part_2.newYearPresent;

import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class NewYearPresentDemo {

    public void NewYearPresentInit() {
        NewYearPresent newYearPresent = createNewYearPresent();
        System.out.println("Вес подарка " + " " + newYearPresent.getWeight() + " грамм");
        consolIO(newYearPresent);

    }

    public static NewYearPresent createNewYearPresent() {

        Candy chocolate = new ChocolatCandy("Ласточка", 125.25, 15, 12);
        Candy lollipop = new LollipopCandy("Бум Бум", 25.05, 10, 5);
        Candy caramel = new CaramelCandy("Рачки", 78.15, 8, 3);
        Candy chocolate2 = new ChocolatCandy("Южная Ночь", 95.13, 12, 8);
        Candy caramel2 = new CaramelCandy("Клубника", 85.80, 15, 7);

        NewYearPresent newYearPresent = new NewYearPresent();

        newYearPresent.addCandy(chocolate);
        newYearPresent.addCandy(lollipop);
        newYearPresent.addCandy(caramel);
        newYearPresent.addCandy(chocolate2);
        newYearPresent.addCandy(caramel2);
        return newYearPresent;
    }

    public static void consolIO(NewYearPresent newYearPresent) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Провести сортировку   конфет   в   подарке по цене нажмите   : 1 ");
            System.out.println("Найти   конфету   в   подарке соответствующую   заданному   диапазону   содержания сахара нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        newYearPresent.sortCandy();
                    }
                    break;
                    case 2: {
                        findCandy(sc, newYearPresent);
                    }
                    break;
                    default: {
                        end = true;
                    }
                }
            } catch (Exception e) {
                end = true;
            }
            System.out.println("Желаете продолжить: 1 -Да,0-Нет ");
            int contunue = Integer.parseInt(sc.next());
            if (contunue == 1) {
                end = false;
            } else {
                end = true;
            }
        }
    }

    public static void findCandy(Scanner sc, NewYearPresent newYearPresent) {
        System.out.println("Введите начальный диапазон содержания сахара. ");
        int r1 = Integer.parseInt(sc.next());
        System.out.println("Введите конечный диапазон содержания сахара. ");
        int r2 = Integer.parseInt(sc.next());
        newYearPresent.findCandy(r1, r2);
    }

}
