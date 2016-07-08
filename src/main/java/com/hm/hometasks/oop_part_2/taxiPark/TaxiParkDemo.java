/*
 * 10.  Таксопарк .  Определить   иерархию   легковых  
 *  автомобилей .  Создать   таксопарк .  Подсчитать  
 *  стоимость   автопарка .  Провести   сортировку  автомобилей   парка   по   расходу   топлива .  Найти  
 *  автомобиль   в   компании ,  соответствующий  
 *  заданному   диапазону   параметров   скорости
 */
package com.hm.hometasks.oop_part_2.taxiPark;

import java.util.Scanner;

/**
 *
 * @author Osin vladimir
 */
public class TaxiParkDemo {

    public void TaxiParkInit() {

        TaxiPark taxiPark = createTaxiPark();
        System.out.println("Стоимость автопарка  " + " " + taxiPark.getPrice() + " " + "грн");
        consolIO(taxiPark);

    }

    public static TaxiPark createTaxiPark() {

        Car lada = new LadaCar(145000.00, 160, 8);
        Car lanos = new LanosCar(200000.00, 180, 6);
        Car geely = new GeelyCar(210000.00, 190, 7);
        Car lada1 = new LadaCar(145000.00, 160, 8);
        Car lanos1 = new LanosCar(205000.00, 180, 6);

        //создаем таксопарк
        TaxiPark taxiPark = new TaxiPark();
        taxiPark.addCar(lada);
        taxiPark.addCar(lanos);
        taxiPark.addCar(geely);
        taxiPark.addCar(lada1);
        taxiPark.addCar(lanos1);
        return taxiPark;
    }

    public static void consolIO(TaxiPark taxiPark) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Провести   сортировку  автомобилей   парка   по   расходу   топлива нажмите   : 1 ");
            System.out.println("Найти автомобиль в компании , соответствующий заданному   диапазону   параметров   скорости нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        taxiPark.sortCar();
                    }
                    break;
                    case 2: {
                        findCar(sc, taxiPark);
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

    public static void findCar(Scanner sc, TaxiPark taxiPark) {
        System.out.println("Введите начальный диапазон скорости. ");
        int r1 = Integer.parseInt(sc.next());
        System.out.println("Введите конечный диапазон скорости. ");
        int r2 = Integer.parseInt(sc.next());
        taxiPark.findCar(r1, r2);
    }
}
