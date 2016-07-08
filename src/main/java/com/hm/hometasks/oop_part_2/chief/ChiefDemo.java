/*
 * 4. Шеф ­ повар .  Определить   иерархию   овощей .  Сделать  
 *     салат .  Подсчитать   калорийность .  Провести  
 *     сортировку   овощей   для   салата   на   основе   одного   из  
 *     параметров .  Найти   овощи   в   салате ,  соответствующие  
 *     заданному   диапазону   калорийности .   
 */
package com.hm.hometasks.oop_part_2.chief;

import java.util.Scanner;

/**
 *
 * @author OsinVladimir
 */
public class ChiefDemo {

    public void ChiefInit() {
        Salad salad = createSalad();
        System.out.println("Калорийность салата  " + " " + salad.getСaloricValue() + " " + "кКл");
        consolIO(salad);

    }

    public static Salad createSalad() {
        Vegetable cabbage = new CabbageVegetable(2.25, 3.20, 4.55, 5.25);
        Vegetable carrot = new CarrotVegetable(3.25, 4.80, 5.55, 8.25);
        Vegetable tomato = new TomatoVegetable(7.25, 1.20, 1.55, 3.25);
        Vegetable tomato1 = new TomatoVegetable(5.25, 2.30, 2.44, 4.44);
        Vegetable carrot1 = new CarrotVegetable(1.25, 3.10, 3.50, 1.25);

        Salad salad = new Salad();
        salad.addVegetable(cabbage);
        salad.addVegetable(carrot);
        salad.addVegetable(tomato);
        salad.addVegetable(tomato1);
        salad.addVegetable(carrot1);
        return salad;
    }

    public static void consolIO(Salad salad) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Провести сортировку   овощей   для   салата   на   основе   одного   из параметров нажмите   : 1 ");
            System.out.println("Найти овощи в салате ,  соответствующие  заданному диапазону калорийности нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        salad.sortVegetable();
                    }
                    break;
                    case 2: {
                        findVegetableDiapazon(sc, salad);
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

    public static void findVegetableDiapazon(Scanner sc, Salad salad) {
        System.out.println("Введите начальный диапазон калорийности. ");
        double r1 = Double.parseDouble(sc.next());
        System.out.println("Введите конечный диапазон калорийности. ");
        double r2 = Double.parseDouble(sc.next());
        salad.findVegetable(r1, r2);
    }
}
