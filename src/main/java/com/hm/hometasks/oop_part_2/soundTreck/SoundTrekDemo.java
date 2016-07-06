/*
 * Звукозапись .  Определить   иерархию   музыкальных  
 * композиций .  Записать   на   диск   сборку .  Подсчитать  
 *  продолжительность .  Провести   перестановку  
 *  композиций   диска   на   основе   принадлежности   к  
 *  стилю .  Найти   композицию ,  соответствующую  
 *  заданному   диапазону   длины   треков . 

 */
package com.hm.hometasks.oop_part_2.soundTreck;


import java.util.Scanner;

/**
 *
 * @author OsinVladimir
 */
public class SoundTrekDemo {
      public void  SoundTrekInit(){
        Installation installation = createInstallation();
        System.out.println("Продолжительность диска  " + " " +installation.getDuration() + " "+"минут");
        consolIO(installation);
       
     }
     public static Installation createInstallation(){
         
        Composition instrument  = new InstrumentComposition(12,1,10);
        Composition pop  = new PopComposition(5,2,12);
        Composition classic  = new ClassicComposition(11,3,10);
        Composition instrument1 = new InstrumentComposition(8,4,3);
        Composition pop1 = new PopComposition(7,2,4);

        Installation inst = new Installation();
        inst.addComposition(instrument);
        inst.addComposition(pop);
        inst.addComposition(classic);
        inst.addComposition(instrument1);
        inst.addComposition(pop1);
        return inst ;
     }
     public static void consolIO(Installation installation){
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Провести перестановку композиций   диска   на основе принадлежности к стилю  нажмите   : 1 ");
            System.out.println("Стили.1-Инструментальный,2-Поп, 3-Классика, 4-Ретро");
            System.out.println("Найти композицию ,  соответствующую заданному диапазону   длины   треков нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        installation.sortComposition();
                    }
                    break;
                    case 2: {
                        System.out.println("Введите начальный диапазон длины трека. ");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("Введите конечный длины трека. ");
                        int r2 = Integer.parseInt(sc.next());
                        installation.findComposition(r1, r2);
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






