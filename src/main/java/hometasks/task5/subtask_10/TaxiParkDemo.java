/*
 * 10.  Таксопарк .  Определить   иерархию   легковых  
 *  автомобилей .  Создать   таксопарк .  Подсчитать  
 *  стоимость   автопарка .  Провести   сортировку  автомобилей   парка   по   расходу   топлива .  Найти  
 *  автомобиль   в   компании ,  соответствующий  
 *  заданному   диапазону   параметров   скорости
 */
package hometasks.task5.subtask_10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Osin vladimir
 */
public class TaxiParkDemo {
     public static void main(String[] args) {
         
         Car lada = new Lada(145000.00, 160, 8);
         Car lanos = new Lanos(200000.00, 180, 6);
         Car geely = new Geely(210000.00, 190, 7);
         Car lada1 = new Lada(145000.00, 160, 8);
         Car lanos1 = new Lanos(205000.00, 180, 6);
   
        
        //создаем таксопарк
        TaxiPark taxiPark = new TaxiPark();
        taxiPark.addCar(lada);
        taxiPark.addCar(lanos);
        taxiPark.addCar(geely);
        taxiPark.addCar(lada1);
        taxiPark.addCar(lanos1);
        
       
        System.out.println("Стоимость автопарка  " + " " +taxiPark.getPrice()+" "+"грн");

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
                        System.out.println("Введите начальный диапазон скорости. ");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("Введите конечный диапазон скорости. ");
                        int r2 = Integer.parseInt(sc.next());
                        taxiPark.findCar(r1, r2);
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
//суперкласс авто
class Car {
    //определяем поля
    private String name;//название
    private double price;//стоимость
    private int speed;//скорость
    private int amountFuel;//расход топлива
    //конструкторы
    public Car() {
    }
    public Car(String name, double price, int speed, int amountFuel) {
        this.name = name;
        this.price = price;
        this.speed = speed;
        this.amountFuel = amountFuel;
    }
    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    //определяем геттеры и сеттеры
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
      public double getPrice() {
        return price;
    }
     public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
    public void setAmountFuel(int amountFuel) {
        this.amountFuel = amountFuel;
    }
    public int getAmountFuel() {
        return amountFuel;
    }
   
    @Override
    public String toString() {
        return "Авто" + " " + name + "  "+"Цена =" +" "+ price + " "
                + "Скорость=" + " " + speed + "км/ч "+" " + "Расход топлива:" + " "
                + amountFuel+" "+"л"+" "+"на 100 км ";
    }
}
//классы наследники
class Lada extends Car {
   private final static String name = "Лада";
     Lada(double price, int speed, int amountFuel) {
        super(name,price,speed,amountFuel);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

class Lanos extends   Car {
    private final static String name = "Ланос";
    Lanos(double price, int speed, int amountFuel) {
        super(name,price,speed,amountFuel);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class Geely extends Car {
   private final static String name = "Джилли";
       Geely(double price, int speed, int amountFuel) {
        super(name,price,speed,amountFuel);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
//класс таксопарка
class TaxiPark{
 
    private double price;//стоимость
   
    public double getPrice() {
        return price ;
    }
   
    private ArrayList<Car> cars = new ArrayList<Car>();
   //создаем таксопарк
    public TaxiPark addCar(Car car) {
        cars.add(car);
        price   += car.getPrice();
        return this;
    }
//сортировка авто по расходу топлива
    public void sortCar() {

        Collections.sort(cars, new MyComparator());

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).toString());
        }
    }
//найти машину по диапазону скорости
    public void findCar(int d1, int d2) {
        int flg = 0;
        for (int i = 0; i < cars.size(); i++) {
            if ((cars.get(i).getSpeed()>= d1) & (cars.get(i).getSpeed() <= d2)) {
                System.out.println(cars.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет таких авто");
        }
    }

}
//класс использует интерфейс компаратор
class MyComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return Integer.compare(car1.getAmountFuel(),car2.getAmountFuel());
    }
}




