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
package hometasks.task5.subtask8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class TransportDemo {
    public static void main(String[] args) {
         
        RailwayTransport k  = new Kupe(40, 20, 2);
        RailwayTransport p  = new Platskart(60,45,3);
        RailwayTransport l  = new Luks(25,15,1);
        RailwayTransport o =  new Overall(80,60,4);
        RailwayTransport p1  = new Platskart(60,45,3);
        RailwayTransport l1  = new Luks(25,15,1);
        
        
        PassengerTrain pt = new PassengerTrain();

        pt.addCarriage(k);
        pt.addCarriage(p);
        pt.addCarriage(l);
        pt.addCarriage(o);
        pt.addCarriage(p1);
        pt.addCarriage(l1);
       
        System.out.println("Общая численность пассажиров  " + " " +pt.getNumberSeats()+" "+"человек"+" "+"и багажа"+pt.getNumberBagage()+" "+"мест ");

        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Провести сортировку   вагонов   поезда  основе   уровня   комфортности  нажмите   : 1 ");
            System.out.println("Найти в поезде вагоны ,соответствующие заданному диапазону параметров числа  пассажиров нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        pt.sortRailwayTransport();
                    }
                    break;
                    case 2: {
                        System.out.println("Введите начальный диапазон числа пассажиров. ");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("Введите конечный диапазон числа пассажиров. ");
                        int r2 = Integer.parseInt(sc.next());
                        pt.findRailwayTransport(r1,r2);
                    }
                    break;
                    default: {
                        end = true;
                    }
                }
            } catch (Exception e) {
                end = true;
            }
        }
     }

}
class RailwayTransport {
    //определяем поля
    private String name;
    private int numberSeats;//число  мест
    private int numberBagage;//число мест багажа
    private int levelComfort;//уровень комфортности
    
    //конструкторы
    RailwayTransport() {
    }

    RailwayTransport(String name, int numberSeats, int numberBagage,int levelComfort) {
        this.name = name;
        this.numberSeats = numberSeats;
        this.numberBagage = numberBagage;
        this.levelComfort = levelComfort;
    }
    RailwayTransport(String name) {
        this.name = name;
        }  
        
   
    //определяем геттеры и сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }
      public int getNumberSeats() {
        return numberSeats;
    }
     public void setNumberBagage(int numberBagage) {
        this.numberBagage = numberBagage;
    }

    public int getNumberBagage() {
        return numberBagage;
    }
    public void setLevelComfort(int levelComfort) {
        this.levelComfort = levelComfort;
    }

    public int getLevelComfort() {
        return levelComfort;
    }
    @Override
    public String toString() {
        return "Вагон" + " " + name + "  "+"Количество  мест пассажиров =" +" "+ numberSeats + " "
                + "Количество мест багажа=" + " " + numberBagage + " " + "Уровень комфортности:" + " "
                + levelComfort ;
    }
}

class Kupe extends RailwayTransport {
   private final static String name = "Купе";
     Kupe(int numberSeats, int numberBagage,int levelComfort) {
        super(name, numberSeats, numberBagage,levelComfort);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

class Platskart extends   RailwayTransport {
     private final static String name = "Платцкарт";
     Platskart(int numberSeats, int numberBagage,int levelComfort) {
        super(name, numberSeats, numberBagage,levelComfort);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class Luks extends RailwayTransport {
    private final static String name = "Люкс";
    Luks(int numberSeats, int numberBagage,int levelComfort) {
        super(name, numberSeats, numberBagage,levelComfort);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class Overall extends RailwayTransport {
    private final static String name = "Общий";
    Overall(int numberSeats, int numberBagage,int levelComfort) {
        super(name, numberSeats, numberBagage,levelComfort);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class PassengerTrain{
 
    private int numberSeats;//число  мест
    private int numberBagage;//число мест багажа
   
    public int getNumberSeats() {
        return numberSeats;
    }
   public int getNumberBagage() {
        return numberBagage;
    }
    private ArrayList<RailwayTransport> railwayTransports = new ArrayList<RailwayTransport>();

    public PassengerTrain addCarriage(RailwayTransport railwayTransport) {
        railwayTransports.add(railwayTransport);
        numberSeats   += railwayTransport.getNumberSeats();
        numberBagage  += railwayTransport.getNumberBagage();
        return this;
    }

    public void sortRailwayTransport() {

        Collections.sort(railwayTransports, new MyComparator());

        for (int i = 0; i < railwayTransports.size(); i++) {
            System.out.println(railwayTransports.get(i).toString());
        }
    }

    public void findRailwayTransport(int d1, int d2) {
        int flg = 0;
        for (int i = 0; i < railwayTransports.size(); i++) {
            if ((railwayTransports.get(i).getNumberSeats()>= d1) & (railwayTransports.get(i).getNumberSeats() <= d2)) {
                System.out.println(railwayTransports.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такох вагонов");
        }
    }

}

class MyComparator implements Comparator<RailwayTransport> {
    @Override
    public int compare(RailwayTransport r1, RailwayTransport r2) {
        return Double.compare(r1.getLevelComfort(), r2.getLevelComfort());
    }
}


