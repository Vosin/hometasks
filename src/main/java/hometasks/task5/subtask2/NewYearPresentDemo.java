/*
 * 2.  Новогодний   подарок .  Определить   иерархию   конфет  
 *  и   прочих   сладостей . 
 *  Создать   несколько   объектов ­ конфет .  Собрать  
 *  детский   подарок   с   определением   его   веса .  Провести  
 *  сортировку   конфет   в   подарке   на   основе   одного   из  
 *  параметров .  Найти   конфету   в   подарке , 
 *  соответствующую   заданному   диапазону   содержания  
 *  сахара . 
 */
package hometasks.task5.subtask2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author vplpdka
 */
public class NewYearPresentDemo {

    public static void main(String[] args) {
        Candy ch1 = new ChocolatCandy("Ласточка", 125.25, 15, 12);
        Candy lol = new LollipopCandy("Бум Бум", 25.05, 10, 5);
        Candy caram = new CaramelCandy("Рачки", 78.15, 8, 3);
        Candy ch2 = new ChocolatCandy("Южная Ночь", 95.13, 12, 8);
        Candy caram2 = new CaramelCandy("Клубника", 85.80, 15, 7);

        NewYearPresent newYearPresent = new NewYearPresent();

        newYearPresent.addCandy(ch1);
        newYearPresent.addCandy(lol);
        newYearPresent.addCandy(caram);
        newYearPresent.addCandy(ch2);
        newYearPresent.addCandy(caram2);

        System.out.println("Вес подарка " + " " + newYearPresent.getWeight() + " грамм");

        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Провести сортировку   конфет   в   подарке по цене нажмите   : 1 ");
            System.out.println("Найти   конфету   в   подарке соответствующую   заданному   диапазону   содержания сахара нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        newYearPresent.sortCandy();
                    }
                    break;
                    case 2: {
                        System.out.println("Введите начальный диапазон содержания сахара. ");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("Введите конечный диапазон содержания сахара. ");
                        int r2 = Integer.parseInt(sc.next());
                        newYearPresent.findCandy(r1, r2);
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

class Candy {
    //определяем поля

    private String name;//название
    private double price;//цена
    private String type;//тип
    private int sugar;//содержание сахара
    private int weight;//вес

    //конструкторы
    Candy() {
    }

    Candy(String name, double price, String type, int sugar, int weight) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.sugar = sugar;
        this.weight = weight;
    }

    Candy(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
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

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getSugar() {
        return sugar;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Конфета:" + " " + name + " " + "Цена =" + price + " " + "Тип = " + " "
                + type + " " + "Содержание сахара =" + sugar + " " + "Вес=" + " " + weight;
    }

}
//классы наследники

class ChocolatCandy extends Candy {

    private final static String type = "Шоколадная";

    ChocolatCandy(String name, double price, int sugar, int weight) {
        super(name, price, type, sugar, weight);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class CaramelCandy extends Candy {

    private final static String type = "Карамельная";

    CaramelCandy(String name, double price, int sugar, int weight) {
        super(name, price, type, sugar, weight);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class LollipopCandy extends Candy {

    private final static String type = "Леденцовая";

    LollipopCandy(String name, double price, int sugar, int weight) {
        super(name, price, type, sugar, weight);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class NewYearPresent {

    private double price;//цена подарка
    private float weight;//вес подарка

    public double getPrice() {
        return price;
    }

    public float getWeight() {
        return weight;
    }

    private ArrayList<Candy> candys = new ArrayList<Candy>();

    public NewYearPresent addCandy(Candy candy) {
        candys.add(candy);
        weight += candy.getWeight();
        return this;
    }

    public void sortCandy() {

        Collections.sort(candys, new MyComparator());

        for (int i = 0; i < candys.size(); i++) {
            System.out.println(candys.get(i).toString());
        }
    }

    public void findCandy(int d1, int d2) {
        int flg = 0;
        for (int i = 0; i < candys.size(); i++) {
            if ((candys.get(i).getSugar() >= d1) & (candys.get(i).getSugar() <= d2)) {
                System.out.println(candys.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такой конфетки");
        }
    }

}

class MyComparator implements Comparator<Candy> {

    @Override
    public int compare(Candy c1, Candy c2) {
        return Double.compare(c1.getPrice(), c2.getPrice());
    }

}
