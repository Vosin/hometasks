/*
 * 17.  Туристические   путевки .  Сформировать   набор  
 *  предложений   клиенту   по   выбору   туристической  
 *  путевки   различного   типа  ( отдых ,  экскурсии , 
 *  лечение ,  шопинг ,  круиз   и   т .  д .)  для   оптимального  
 *  выбора .  Учитывать   возможность   выбора   транспорта , 
 *  питания   и   числа   дней .  Реализовать   выбор   и  
 *  сортировку   путевок . 

 */
package com.hm.hometasks.oop_part_2.tourPackages;

import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class TourPackagesDemo {

    public void TourPackagesInit() {
        Proposition proposition = createProposition();
        System.out.println("Сортировка путевок по цене ");
        proposition.sortTourPackage();
        consolIO(proposition);
    }

    public static Proposition createProposition() {
        TourPackage relax = new RelaxationTourPackage(2500.00, "Все включено", 14, "Авиа", "Египет");
        TourPackage relax1 = new RelaxationTourPackage(3500.00, "Все включено", 12, "Авиа", "Турция");
        TourPackage excursion = new ExcursionTourPackage(1000.00, "Без питания", 1, "Автобус", "Украина");
        TourPackage excursion1 = new ExcursionTourPackage(800.00, "Без питания", 3, "Автобус", "Украина");
        TourPackage treatment = new TreatmentTourPackage(10000.00, "Все включено", 10, "Автобус", "Украина");
        TourPackage treatment1 = new TreatmentTourPackage(15000.00, "Все включено", 7, "Автобус", "Украина");
        TourPackage shopping = new ShoppingTourPackage(8000.00, "Без питания", 1, "Поезд", "Франция");
        TourPackage shopping1 = new ShoppingTourPackage(1000.00, "Завтрак", 2, "Поезд", "Германия");
        TourPackage сruize = new CruizeTourPackage(100000.00, "Все включено", 14, "Автобус", "Европа");
        TourPackage сruize1 = new CruizeTourPackage(100045.30, "Завтрак", 12, "Поезд", "Европа");
        //создаем предложение
        Proposition proposition = new Proposition();
        proposition.addTourPackage(relax);
        proposition.addTourPackage(relax1);
        proposition.addTourPackage(excursion);
        proposition.addTourPackage(excursion1);
        proposition.addTourPackage(treatment);
        proposition.addTourPackage(treatment1);
        proposition.addTourPackage(shopping);
        proposition.addTourPackage(shopping1);
        proposition.addTourPackage(сruize);
        proposition.addTourPackage(сruize1);
        return proposition;
    }

    public static void consolIO(Proposition proposition) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Для формирования предложения туристическим путевкам выберите пункт ниже:  ");

            try {
                findTourPackageTransfer(sc, proposition);
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

    public static void findTourPackageTransfer(Scanner sc, Proposition proposition) {
        System.out.println("Для отбора по типу транспорта Введите тип транспорта - 1-Авиа,2-Автобус,3-Поезд");
        int r1 = Integer.parseInt(sc.next());
        System.out.println("\"Для отбора по типу дней Введите количество дней");
        int r2 = Integer.parseInt(sc.next());
        System.out.println("\"Для отбора по типу питания введите тип питания:1-Все включено,2-Завтрак,3-Без питания");
        int r3 = Integer.parseInt(sc.next());
        proposition.findTourPackageTransfer(r1, r2, r3);
    }
}
