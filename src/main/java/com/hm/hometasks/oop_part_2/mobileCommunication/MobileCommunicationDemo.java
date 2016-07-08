/*
 * 12.Мобильная   связь .  Определить   иерархию   тарифов  
 *    мобильной   компании .  Создать   список   тарифов  
 *   компании .  Подсчитать   общую   численность   клиентов . 
 *   Провести   сортировку   тарифов   на   основе   размера  
 *   абонентской   платы .  Найти   тариф   в   компании , 
 *   соответствующий   заданному   диапазону   параметров . 
 */
package com.hm.hometasks.oop_part_2.mobileCommunication;

import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class MobileCommunicationDemo {

    public void MobileCommunicationInit() {
        ListTarifs listTarifs = createListTarifs();
        System.out.println("Численность клиентов  " + " " + listTarifs.amountClient() + " " + "человек");
        consolIO(listTarifs);

    }

    public static ListTarifs createListTarifs() {

        Tarif basis = new BasisTarif(10.0, 1000, 0.15, 0.25);
        Tarif vip = new VipTarif(25.0, 100, 0.25, 0.35);
        Tarif noLimit = new NoLimitTarif(30.0, 15000, 0.10, 0.45);
        Tarif basis1 = new BasisTarif(10.0, 1000, 0.15, 0.25);
        Tarif vip1 = new VipTarif(45.0, 10, 0.45, 0.35);

        //создаем список
        ListTarifs listTarif = new ListTarifs();
        listTarif.addTarif(basis);
        listTarif.addTarif(vip);
        listTarif.addTarif(noLimit);
        listTarif.addTarif(basis1);
        listTarif.addTarif(vip1);
        return listTarif;
    }

    public static void consolIO(ListTarifs listTarifs) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Провести   сортировку   тарифов   на   основе   размера абонентской   платы  нажмите   : 1 ");
            System.out.println("Найти тариф в компании , соответствующий заданному диапазону стоимости минуты разговора нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        listTarifs.sortTarif();
                    }
                    break;
                    case 2: {
                        findTarif(sc, listTarifs);
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

    public static void findTarif(Scanner sc, ListTarifs listTarifs) {
        System.out.println("Введите начальный диапазон суммы. ");
        double r1 = Double.parseDouble(sc.next());
        System.out.println("Введите конечный диапазон суммы. ");
        double r2 = Double.parseDouble(sc.next());
        listTarifs.findTarif(r1, r2);
    }

}
