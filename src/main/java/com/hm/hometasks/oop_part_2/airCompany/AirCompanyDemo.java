/*
 * Авиакомпания .  Определить   иерархию   самолетов . 
 *  создать   авиакомпанию . 
 *  Посчитать   общую   вместимость   и   грузоподъемность . 
 *  Провести   сортировку   самолетов   компании   по  
 *  дальности   полета .  Найти   самолет   в   компании , 
 *  соответствующий   заданному   диапазону   параметров  
 *  потребления   горючего . 
 */
package com.hm.hometasks.oop_part_2.airCompany;

import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */

//класс выполнения демо 
public class AirCompanyDemo {
     public  void AirCompantInit() {
       AirCompany airCompany = createAirCompany();      
       System.out.println("Общая вместимость  " + " " +airCompany.getCapacity()+" "+"и грузоподьемность"+" "+airCompany.getNumberGruz()+" "+"тонн ");
       consolIO(airCompany);
       
     }
public static AirCompany createAirCompany(){
        AirPlane boeing  = new BoeingAirPlane(100,15.2,1500,330);
        AirPlane airBus  = new AirBusAirPlane(150,25.2,2500,500);
        AirPlane antonov = new AntonovAirPlane(90,11.2,1000,430);
        AirPlane boeing1 = new BoeingAirPlane(105,15.2,1500,330);
        AirPlane airBus1 = new AirBusAirPlane(160,27.2,3000,560);
   
        
        //создаем авиакомпанию
        AirCompany airCompany = new AirCompany();

        airCompany.addAirPlane(boeing);
        airCompany.addAirPlane(airBus);
        airCompany.addAirPlane(boeing1);
        airCompany.addAirPlane(airBus1);
        return  airCompany;
}
public static void consolIO(AirCompany airCompany){
   Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Провести   сортировку   самолетов   компании   по дальности   полета  нажмите   : 1 ");
            System.out.println("Найти самолет в компании , соответствующий   заданному   диапазону   параметров потребления горючего нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        airCompany.sortAirPlane();
                    }
                    break;
                    case 2: {
                        System.out.println("Введите начальный диапазон потребления горючего. ");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("Введите конечный диапазон потребления горючего. ");
                        int r2 = Integer.parseInt(sc.next());
                        airCompany.findAirPlane(r1, r2);
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




