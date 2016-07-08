/*
 * 13.  Фургон   кофе .  Загрузить   фургон   определенного  
 *  объема   грузом   на   определенную   сумму   из   различных  
 *  сортов   кофе ,  находящихся ,  к   тому   же ,  в   разных  
 *  физических   состояниях  ( зерно ,  молотый , 
 *  растворимый   в   банках   и   пакетиках ).  Учитывать   объем  
 *  кофе   вместе   с   упаковкой .  Провести   сортировку  
 *  товаров   на   основе   соотношения   цены   и   веса .  Найти   в  
 *  фургоне   товар ,  соответствующий   заданному  
 *  диапазону   параметров   качества . 
 */
package com.hm.hometasks.oop_part_2.coffeeVan;

import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class CoffeeVanDemo {

    public void CoffeeVanInit() {
        CoffeeVan coffeeVan = createCoffeeVan();
        System.out.println("Общий Вес фургона равен = " + coffeeVan.getWeight());
        consolIO(coffeeVan);

    }

    public static CoffeeVan createCoffeeVan() {
        Coffee pauling = new PaulingCoffee("Арабика", "молотый", 100, 120.25, "Высший", 2);
        Coffee blaser = new BlaserCoffee("Робуста", "в зернах", 200, 320.25, "Высший", 3);
        Coffee mokko = new MokkoCoffee("Арабика", "растворимый", 100, 120.25, "Высший", 2);
        Coffee blaser1 = new BlaserCoffee("Робуста", "в пакетах", 300, 55.75, "Первый", 4);
        Coffee mokko1 = new MokkoCoffee("Арабика", "молотый", 500, 88.00, "Второй", 1);

        //создаем фургон
        CoffeeVan сoffeeVan = new CoffeeVan();
        сoffeeVan.addCoffee(pauling);
        сoffeeVan.addCoffee(blaser);
        сoffeeVan.addCoffee(mokko);
        сoffeeVan.addCoffee(blaser1);
        сoffeeVan.addCoffee(blaser1);

        return сoffeeVan;
    }

    public static void consolIO(CoffeeVan coffeeVan) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Провести сортировку товаров   на   основе   соотношения   цены   и   веса  нажмите   : 1 ");
            System.out.println("Найти в фургоне товар , соответствующий   заданному диапазону   параметров   качества сорта нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        coffeeVan.sortCoffee();
                    }
                    break;
                    case 2: {
                        System.out.println("Введите сорт качества 1-Высший,2-Первый,3-Второй. ");
                        int r1 = Integer.parseInt(sc.next());
                        coffeeVan.findCoffee(r1);
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

}
