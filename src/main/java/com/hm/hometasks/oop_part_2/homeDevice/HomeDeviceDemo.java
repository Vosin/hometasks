/*
 * 3.  Домашние   электроприборы .  Определить   иерархию  
 * электроприборов . 
 *  Включить   некоторые   в   розетку .  Подсчитать  
 *  потребляемую   мощность .  Провести   сортировку  
 *  приборов   в   квартире   на   основе   мощности .  Найти  
 *  прибор   в   квартире ,  соответствующий   заданному  
 *  диапазону   параметров . 
 */
package com.hm.hometasks.oop_part_2.homeDevice;

import java.util.Scanner;

/**
 *
 * @author OsinVladimir
 */
public class HomeDeviceDemo {

    public void HomeDeviceInit() {
        FlatDevice flatDevice = createFlatDevice();
        System.out.println("Общая мощность приборов в квартире  " + " " + flatDevice.getPower() + " кВт");
        consolIO(flatDevice);

    }

    public static FlatDevice createFlatDevice() {

        HomeDevice kettle = new KettleHomeDevice(1.20, false, 220);
        HomeDevice iron = new IronHomeDevice(2.5, false, 210);
        HomeDevice hairDryer = new HairDryerHomeDevice(1.5);
        HomeDevice iron1 = new IronHomeDevice(2.1);
        HomeDevice kettle1 = new KettleHomeDevice(1.8, false, 230);
        //устанавливаем напряжение приборов
        hairDryer.setVoltage(220);
        iron1.setVoltage(215);
        //включаем в розетку 
        hairDryer.switchOn();
        iron1.switchOn();

        FlatDevice flatD = new FlatDevice();

        flatD.addHomeDevice(kettle);
        flatD.addHomeDevice(iron);
        flatD.addHomeDevice(hairDryer);
        flatD.addHomeDevice(iron1);
        flatD.addHomeDevice(kettle1);
        return flatD;
    }

    public static void consolIO(FlatDevice flatDevice) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Провести сортировку   приборов на основе мощности нажмите   : 1 ");
            System.out.println("Найти прибор в квартире,соответствующий заданному диапазону   параметров нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        flatDevice.sortHomeDevice();;
                    }
                    break;
                    case 2: {
                        findHomeDevice(sc, flatDevice);
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

    public static void findHomeDevice(Scanner sc, FlatDevice flatDevice) {
        System.out.println("Введите начальный диапазон вольт. ");
        int r1 = Integer.parseInt(sc.next());
        System.out.println("Введите конечный диапазон вольт. ");
        int r2 = Integer.parseInt(sc.next());
        flatDevice.findHomeDevice(r1, r2);
    }

}
