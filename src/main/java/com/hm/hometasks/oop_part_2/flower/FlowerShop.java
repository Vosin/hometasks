/*
 *1.  Цветочница .  Определить   иерархию   цветов .  Создать  
 * несколько   объектов ­ цветов .  Собрать   букет  
 * ( используя   аксессуары )  с   определением   его  
 * стоимости .  Провести   сортировку   цветов   в   букете   на  
 * основе   уровня   свежести .  Найти   цветок   в   букете , 
 * соответствующий   заданному   диапазону   длин  
 * стеблей . 
 */
package com.hm.hometasks.oop_part_2.flower;


import java.util.Scanner;

/**
 *
 * @author OsinVladimir
 */
public class FlowerShop {

    public void FlowerShopInit(){
      Bouquet bouquet = createBuquet();
      consolIO(bouquet);  
    }
    
    public static Bouquet createBuquet(){
       
        Flower ros = new RoseFlower(40.55, 1, 15);
        Flower tup = new TulipFlower(20.00, 2, 50);
        Flower carn = new CarnationFlower(10.25, 3, 50);
        Flower ros1 = new RoseFlower(20.55, 3, 35);
        Flower tup2 = new TulipFlower(25.00, 1, 25);

        Bouquet bouquet = new Bouquet();

        bouquet.addFlower(ros);
        bouquet.addFlower(tup);
        bouquet.addFlower(carn);
        bouquet.addFlower(ros1);
        bouquet.addFlower(tup2);

        //добавляем аксесуары
        bouquet.setAccessories("Пленка прозрачная");
        bouquet.setPriceAccessories(10.5);
return  bouquet;
}
    public static void consolIO(Bouquet bouquet){
        double totalPrice;
        totalPrice = bouquet.getPrice() + bouquet.getPriceAccessories();

        System.out.println("Стоимость букета с учетом акссесуаров" + " " + totalPrice);
        System.out.println("Стоимость букета без акссесуаров" + " " + bouquet.getPrice());
        System.out.println("Стоимость акссесуара" + " " + bouquet.getAccessories() + " " + "=" + bouquet.getPriceAccessories());

        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Сортировка цветов на уровне свежести нажмите  : 1 ");
            System.out.println("Найти цветок в букете,соответствующий заданному  диапазону длин стеблей нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        bouquet.sortList();
                    }
                    break;
                    case 2: {
                        System.out.println("Введите начальный диапазон длины стебля. ");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("Введите конечный диапазон длины стебля. ");
                        int r2 = Integer.parseInt(sc.next());
                        bouquet.findFlower(r1, r2);
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
            if(contunue==1){
                end = false;
            }else{
                end = true;
            }
        }   
    }
}

