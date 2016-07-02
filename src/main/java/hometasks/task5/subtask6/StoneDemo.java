/*
 * 6.  Камни .  Определить   иерархию   драгоценных   и  
 *     полудрагоценных   камней . 
 *     Отобрать   камни   для   ожерелья .  Подсчитать   общий   вес  
 *     ( в   каратах )  и   стоимость .  Провести   сортировку  
 *     камней   ожерелья   на   основе   ценности .  Найти   камни   в  
 *     ожерелье ,  соответствующие   заданному   диапазону  
 *     параметров   прозрачности
 */
package hometasks.task5.subtask6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class StoneDemo {
     public static void main(String[] args) {
         
        Stone d  = new Diamond(5,12.2,5,1);
        Stone r  = new Ruby(7,10.1,6,1);
        Stone q  = new Quartz(8,9.2,4,2);
        Stone a =  new Agate(3,8.2,9,2);
        Stone d1 = new Diamond(7,5.8,5,1);

        Necklace neck = new Necklace();
        neck.addStone(d);
        neck.addStone(r);
        neck.addStone(q);
        neck.addStone(a);
        neck.addStone(d1);
       
        System.out.println("Общий вес ожерелья  " + " " +neck.getWeight()+ " "+"Общая стоимость"+neck.getPrice());

        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Провести сортировку  камней   ожерелья   на   основе   ценности  нажмите   : 1 ");
            System.out.println("1-Драгоценный,2-Полудрагоценный");
            System.out.println("Найти камни в  ожерелье ,  соответствующие   заданному   диапазону параметров   прозрачности нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        neck.sortStone();
                    }
                    break;
                    case 2: {
                        System.out.println("Введите начальный диапазон прозрачности. ");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("Введите конечный диапазон прозрачности. ");
                        int r2 = Integer.parseInt(sc.next());
                        neck.findStone(r1, r2);
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
    

class Stone {
    //определяем поля

    private String name;//название
    private double weight;//вес
    private double price;//цена
    private int transparency;//прозрачность
    private int value;//ценность драгоценный -1, полу-2  

    //конструкторы
    Stone() {
    }

    public Stone(String name, double weight, double price, int transparency, int value) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.transparency = transparency;
        this.value = value;
    }

    public Stone(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
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

    public void setTransparency(int transparency) {
        this.transparency = transparency;
    }

    public int getTransparency() {
        return transparency;
    }
     public void setValue(int value) {
        this.transparency = value;
    }

    public int getValue() {
        return value;
    }
    
    
    @Override
    public String toString() {
        return "Камень:" + " " + name + " " + "Вес =" + weight + " " + "Цена = " + " "
                + price+ " " + "Прозрачность =" +transparency + " " + "Ценность =" +value ;
    }

}
class Diamond extends Stone {

    private final static String name = "Алмаз";
    Diamond(double weight, double price, int transparency, int value) {
        super(name, weight, price, transparency, value);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Ruby extends Stone {
   private final static String name = "Рубин";
    Ruby(double weight, double price, int transparency, int value) {
        super(name, weight, price, transparency, value);
    }
     @Override
    public String toString() {
        return super.toString();
    }
}

class Quartz extends Stone {
    private final static String name = "Кварц";
    Quartz(double weight, double price, int transparency, int value) {
        super(name, weight, price, transparency, value);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class Agate extends Stone {
    private final static String name = "Агат";
    Agate(double weight, double price, int transparency, int value) {
        super(name, weight, price, transparency, value);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class Necklace{

    private double weight;//вес
    private double price;//цена

    public double getWeight() {
        return weight;
    }
    public double getPrice() {
        return price;
    }

    private ArrayList<Stone> stones = new ArrayList<Stone>();

    public Necklace addStone(Stone stone) {
        stones.add(stone);
        weight += stone.getWeight();
        price  += stone.getPrice();
        return this;
    }

    public void sortStone() {

        Collections.sort(stones, new MyComparator());

        for (int i = 0; i < stones.size(); i++) {
            System.out.println(stones.get(i).toString());
        }
    }

    public void findStone(int d1, int d2) {
        int flg = 0;
        for (int i = 0; i < stones.size(); i++) {
            if ((stones.get(i).getTransparency()>= d1) & (stones.get(i).getTransparency() <= d2)) {
                System.out.println(stones.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такого камня");
        }
    }

}

class MyComparator implements Comparator<Stone> {
    @Override
    public int compare(Stone s1, Stone s2) {
        return Integer.compare(s1.getValue(), s2.getValue());
    }
}
    