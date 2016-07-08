/*
 * 6.  Камни .  Определить   иерархию   драгоценных   и  
 *     полудрагоценных   камней . 
 *     Отобрать   камни   для   ожерелья .  Подсчитать   общий   вес  
 *     ( в   каратах )  и   стоимость .  Провести   сортировку  
 *     камней   ожерелья   на   основе   ценности .  Найти   камни   в  
 *     ожерелье ,  соответствующие   заданному   диапазону  
 *     параметров   прозрачности
 */
package com.hm.hometasks.oop_part_2.stone;

import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class StoneDemo {

    public void StoneInit() {

        Necklace necklace = createNecklace();
        System.out.println("Общий вес ожерелья  " + " " + necklace.getWeight() + " " + "Общая стоимость" + necklace.getPrice());
        consolIO(necklace);

    }

    public static Necklace createNecklace() {
        Stone diamond = new DiamondStone(5, 12.2, 5, 1);
        Stone ruby = new RubyStone(7, 10.1, 6, 1);
        Stone quartz = new QuartzStone(8, 9.2, 4, 2);
        Stone agate = new AgateStone(3, 8.2, 9, 2);
        Stone diamond1 = new DiamondStone(7, 5.8, 5, 1);

        Necklace neck = new Necklace();
        neck.addStone(diamond);
        neck.addStone(ruby);
        neck.addStone(quartz);
        neck.addStone(agate);
        neck.addStone(diamond1);
        return neck;

    }

    public static void consolIO(Necklace necklace) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Провести сортировку  камней   ожерелья   на   основе   ценности  нажмите   : 1 ");
            System.out.println("1-Драгоценный,2-Полудрагоценный");
            System.out.println("Найти камни в  ожерелье ,  соответствующие   заданному   диапазону параметров   прозрачности нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        necklace.sortStone();
                    }
                    break;
                    case 2: {
                        findStone(sc, necklace);
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

    public static void findStone(Scanner sc, Necklace necklace) {
        System.out.println("Введите начальный диапазон прозрачности. ");
        int r1 = Integer.parseInt(sc.next());
        System.out.println("Введите конечный диапазон прозрачности. ");
        int r2 = Integer.parseInt(sc.next());
        necklace.findStone(r1, r2);
    }
}
