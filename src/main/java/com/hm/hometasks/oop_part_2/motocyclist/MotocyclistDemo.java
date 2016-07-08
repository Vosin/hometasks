/*
 * 7.  Мотоциклист .  Определить   иерархию   амуниции . 
 *     Экипировать   мотоциклиста .  Подсчитать   стоимость . 
 *     Провести   сортировку   амуниции   на   основе   веса . 
 *     Найти   элементы   амуниции ,  соответствующие  
 *     заданному   диапазону   параметров   цены . 
 *
 */
package com.hm.hometasks.oop_part_2.motocyclist;

import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class MotocyclistDemo {

    public void MotocyclistInit() {
        Motocyclist motocyclist = createMotocyclist();
        System.out.println("Общая стоимость амуниции  " + " " + motocyclist.getPrice());
        consolIO(motocyclist);

    }

    public static Motocyclist createMotocyclist() {

        Ammunition helmet = new HelmetAmmunition(1.5, 45.00, "Пластик");
        Ammunition suit = new SuitAmmunition(3.8, 3000.00, "Кожа");
        Ammunition boots = new BootsAmmunition(2.5, 2000.00, "Кожа");
        Ammunition gloves = new GlovesAmmunition(0.8, 150.00, "Исскуственная кожа");

        Motocyclist mt = new Motocyclist();

        mt.addAmmunition(helmet);
        mt.addAmmunition(suit);
        mt.addAmmunition(boots);
        mt.addAmmunition(gloves);
        return mt;

    }

    public static void consolIO(Motocyclist motocyclist) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Провести   сортировку   амуниции   на   основе   веса   нажмите   : 1 ");
            System.out.println("Найти   элементы   амуниции , соответствующие заданному   диапазону   параметров   цены  нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        motocyclist.sortAmmunition();
                    }
                    break;
                    case 2: {
                        findAmmunition(sc, motocyclist);
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

    public static void findAmmunition(Scanner sc, Motocyclist motocyclist) {
        System.out.println("Введите начальный диапазон цены. ");
        double r1 = Double.parseDouble(sc.next());
        System.out.println("Введите конечный диапазон цены. ");
        double r2 = Double.parseDouble(sc.next());
        motocyclist.findAmmunition(r1, r2);
    }
}
