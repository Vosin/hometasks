/*
 * 7.  Мотоциклист .  Определить   иерархию   амуниции . 
 *     Экипировать   мотоциклиста .  Подсчитать   стоимость . 
 *     Провести   сортировку   амуниции   на   основе   веса . 
 *     Найти   элементы   амуниции ,  соответствующие  
 *     заданному   диапазону   параметров   цены . 
 *
 */
package hometasks.task5.subtask7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class MotocyclistDemo {
     public static void main(String[] args) {
         
        Ammunition h  = new Helmet(1.5,45.00,"Пластик");
        Ammunition s  = new Suit(3.8,3000.00,"Кожа");
        Ammunition b  = new Boots(2.5,2000.00,"Кожа");
        Ammunition g =  new Gloves(0.8,150.00,"Исскуственная кожа");
        
        Motocyclist mt = new Motocyclist();

       
        mt.addAmmunition(h);
        mt.addAmmunition(s);
        mt.addAmmunition(b);
        mt.addAmmunition(g);
       
        System.out.println("Общая стоимость амуниции  " + " " +mt.getPrice());

        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Провести   сортировку   амуниции   на   основе   веса   нажмите   : 1 ");
            System.out.println("Найти   элементы   амуниции , соответствующие заданному   диапазону   параметров   цены  нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        mt.sortAmmunition();
                    }
                    break;
                    case 2: {
                        System.out.println("Введите начальный диапазон цены. ");
                        double r1 = Double.parseDouble(sc.next());
                        System.out.println("Введите конечный диапазон цены. ");
                        double r2 = Double.parseDouble(sc.next());
                        mt.findAmmunition(r1, r2);
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
class Ammunition {
    //определяем поля

    private String name;//название
    private double weight;//вес
    private double price;//цена
    private String material;//материал
   
    //конструкторы
    Ammunition() {
    }

    Ammunition(String name, double weight, double price, String material) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.material = material;
    }
    Ammunition(String name, double price) {
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

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setMaterial(String material) {
        this.material= material;
    }

    public String getMaterial() {
        return material;
    }
        
    
    @Override
    public String toString() {
        return "Аммуниция:" + " " + name + " " + "Вес =" + weight + " " + "Цена = " + " "
                + price+ " " + "Материал =" +material ;
    }

}
class Helmet extends Ammunition {
    private final static String name = "Шлем";
    Helmet(double weight, double price, String material) {
        super(name, weight,price,material);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

class Suit extends Ammunition {
   private final static String name = "МотоКостюм";
     Suit(double weight, double price, String material) {
        super(name, weight,price,material);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

class Boots extends  Ammunition {
    private final static String name = "Сапоги";
    Boots(double weight, double price, String material) {
        super(name, weight,price,material);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class Gloves extends Ammunition {
    private final static String name = "Перчатки";
    Gloves(double weight, double price, String material) {
        super(name, weight,price,material);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class Motocyclist{
 
    private double price;//стоимость
   
    public double getPrice() {
        return price;
    }

    private ArrayList<Ammunition> ammunitions = new ArrayList<Ammunition>();

    public Motocyclist addAmmunition(Ammunition ammunition) {
        ammunitions.add(ammunition);
        price  += ammunition.getPrice();
        return this;
    }

    public void sortAmmunition() {

        Collections.sort(ammunitions, new MyComparator());

        for (int i = 0; i < ammunitions.size(); i++) {
            System.out.println(ammunitions.get(i).toString());
        }
    }

    public void findAmmunition(double d1, double d2) {
        int flg = 0;
        for (int i = 0; i < ammunitions.size(); i++) {
            if ((ammunitions.get(i).getPrice()>= d1) & (ammunitions.get(i).getPrice() <= d2)) {
                System.out.println(ammunitions.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такой амуниции");
        }
    }

}

class MyComparator implements Comparator<Ammunition> {
    @Override
    public int compare(Ammunition a1, Ammunition a2) {
        return Double.compare(a1.getWeight(), a2.getWeight());
    }
}


