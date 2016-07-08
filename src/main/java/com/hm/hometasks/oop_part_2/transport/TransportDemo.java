/*
 * 8.  Транспорт .  Определить   иерархию   подвижного  
 *  состава   железнодорожного  
 * транспорта .  Создать   пассажирский   поезд . 
 * Подсчитать   общую   численность   пассажиров   и  
 * багажа .  Провести   сортировку   вагонов   поезда   на  
 * основе   уровня   комфортности .  Найти   в   поезде   вагоны , 
 * соответствующие   заданному   диапазону   параметров  
 * числа   пассажиров . 
 */
package com.hm.hometasks.oop_part_2.transport;

import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class TransportDemo {

    public void TransportInit() {
        PassengerTrain passengerTrain = createPassengerTrain();
        System.out.println("Общая численность пассажиров  " + " " + passengerTrain.getNumberSeats() + " " + "человек" + " " + "и багажа" + passengerTrain.getNumberBagage() + " " + "мест ");
        consolIO(passengerTrain);

    }

    public static PassengerTrain createPassengerTrain() {

        RailwayTransport kupe = new KupeRailwayTransport(40, 20, 2);
        RailwayTransport platskart = new PlatskartRailwayTransport(60, 45, 3);
        RailwayTransport luks = new LuksRailwayTransport(25, 15, 1);
        RailwayTransport overall = new OverallRailwayTransport(80, 60, 4);
        RailwayTransport platskart1 = new PlatskartRailwayTransport(60, 45, 3);
        RailwayTransport luks1 = new LuksRailwayTransport(25, 15, 1);

        PassengerTrain pt = new PassengerTrain();

        pt.addCarriage(kupe);
        pt.addCarriage(platskart);
        pt.addCarriage(luks);
        pt.addCarriage(overall);
        pt.addCarriage(platskart1);
        pt.addCarriage(luks1);
        return pt;
    }

    public static void consolIO(PassengerTrain passengerTrain) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Провести сортировку   вагонов   поезда  основе   уровня   комфортности  нажмите   : 1 ");
            System.out.println("Найти в поезде вагоны ,соответствующие заданному диапазону параметров числа  пассажиров нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        passengerTrain.sortRailwayTransport();
                    }
                    break;
                    case 2: {
                        findRailwayTransport(sc, passengerTrain);
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

    public static void findRailwayTransport(Scanner sc, PassengerTrain passengerTrain) {
        System.out.println("Введите начальный диапазон числа пассажиров. ");
        int r1 = Integer.parseInt(sc.next());
        System.out.println("Введите конечный диапазон числа пассажиров. ");
        int r2 = Integer.parseInt(sc.next());
        passengerTrain.findRailwayTransport(r1, r2);
    }
}
