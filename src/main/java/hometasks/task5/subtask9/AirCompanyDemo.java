/*
 * Авиакомпания .  Определить   иерархию   самолетов . 
 *  создать   авиакомпанию . 
 *  Посчитать   общую   вместимость   и   грузоподъемность . 
 *  Провести   сортировку   самолетов   компании   по  
 *  дальности   полета .  Найти   самолет   в   компании , 
 *  соответствующий   заданному   диапазону   параметров  
 *  потребления   горючего . 
 */
package hometasks.task5.subtask9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */

//класс выполнения демо 
public class AirCompanyDemo {
     public static void main(String[] args) {
         
        AirPlane boeing  = new Boeing(100,15.2,1500,330);
        AirPlane airBus  = new AirBus(150,25.2,2500,500);
        AirPlane antonov = new Antonov(90,11.2,1000,430);
        AirPlane boeing1 = new Boeing(105,15.2,1500,330);
        AirPlane airBus1 = new AirBus(160,27.2,3000,560);
   
        
        //создаем авиакомпанию
        AirCompany airCompany = new AirCompany();

        airCompany.addAirPlane(boeing);
        airCompany.addAirPlane(airBus);
        airCompany.addAirPlane(boeing1);
        airCompany.addAirPlane(airBus1);
        
       
        System.out.println("Общая вместимость  " + " " +airCompany.getCapacity()+" "+"и грузоподьемность"+" "+airCompany.getNumberGruz()+" "+"тонн ");

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
        }
     }

    
    
}
//суперкласс самолет
class AirPlane {
    //определяем поля
    private String name;//название
    private double capacity;//вместимость
    private double numberGruz;//грузоподьемность
    private int rangeFlight;//дальность полета
    private int amountFuel;//количество потребляемого горючего
    //конструкторы
    AirPlane() {
    }

    public AirPlane(String name, int capacity, double numberGruz, int rangeFlight, int amountFuel) {
        this.name = name;
        this.capacity = capacity;
        this.numberGruz = numberGruz;
        this.rangeFlight = rangeFlight;
        this.amountFuel = amountFuel;
    }
    public AirPlane(String name, int capacity, double numberGruz) {
        this.name = name;
        this.capacity = capacity;
        this.numberGruz = numberGruz;     
    }
    //определяем геттеры и сеттеры
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
      public double getCapacity() {
        return capacity;
    }
     public void setNumberGruz(double numberGruz) {
        this.numberGruz = numberGruz;
    }
    public double getNumberGruz() {
        return numberGruz;
    }
    public void setRangeFlight(int rangeFlight) {
        this.rangeFlight = rangeFlight;
    }
    public int getRangeFlight() {
        return rangeFlight;
    }
    public void setAmountFuel(int amountFuel) {
        this.rangeFlight = rangeFlight;
    }
    public int getAmountFuel() {
        return rangeFlight;
    }
    @Override
    public String toString() {
        return "Самолет" + " " + name + "  "+"Общая вместимость =" +" "+ capacity + " "
                + "Грузоподьемность=" + " " + numberGruz + "тонн "+" " + "Дальность полета:" + " "
                + rangeFlight +"км "+" "+"Количество потребляемого горючего=" + " " + amountFuel;
    }
}
//классы наследники
class Boeing extends AirPlane {
   private final static String name = "Боинг";
     Boeing(int capacity, double numberGruz, int rangeFlight, int amountFuel) {
        super(name,capacity, numberGruz, rangeFlight, amountFuel);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

class AirBus extends  AirPlane {
    private final static String name = "Аэробус";
     AirBus(int capacity, double numberGruz, int rangeFlight, int amountFuel) {
        super(name,capacity, numberGruz, rangeFlight, amountFuel);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class Antonov extends AirPlane {
   private final static String name = "Антонов";
     Antonov(int capacity, double numberGruz, int rangeFlight, int amountFuel) {
        super(name,capacity, numberGruz, rangeFlight, amountFuel);
     }
    @Override
    public String toString() {
        return super.toString();
    }
}
//класс авиакомпании
class AirCompany{
 
    private double capacity;//вместимость
    private double numberGruz;//грузоподьемность
   
    public double getCapacity() {
        return capacity;
    }
    public double getNumberGruz() {
        return numberGruz;
    }
    private ArrayList<AirPlane> airPlanes = new ArrayList<AirPlane>();
   //создаем авиакомпанию
    public AirCompany addAirPlane(AirPlane airPlane) {
        airPlanes.add(airPlane);
        capacity   += airPlane.getCapacity();
        numberGruz  += airPlane.getNumberGruz();
        return this;
    }
//сортировка самолетов по признаку дальности полета
    public void sortAirPlane() {

        Collections.sort(airPlanes, new MyComparator());

        for (int i = 0; i < airPlanes.size(); i++) {
            System.out.println(airPlanes.get(i).toString());
        }
    }
//найти самолет по диапазону потребления горючего
    public void findAirPlane(int d1, int d2) {
        int flg = 0;
        for (int i = 0; i < airPlanes.size(); i++) {
            if ((airPlanes.get(i).getAmountFuel()>= d1) & (airPlanes.get(i).getAmountFuel() <= d2)) {
                System.out.println(airPlanes.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет таких самолетов");
        }
    }

}
//класс использует интерфейс компаратор
class MyComparator implements Comparator<AirPlane> {
    @Override
    public int compare(AirPlane airPlane1, AirPlane airPlane2) {
        return Integer.compare(airPlane1.getRangeFlight(),airPlane2.getRangeFlight());
    }
}




