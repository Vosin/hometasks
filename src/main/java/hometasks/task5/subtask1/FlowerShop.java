/*
 *1.  Цветочница .  Определить   иерархию   цветов .  Создать  
 * несколько   объектов ­ цветов .  Собрать   букет  
 * ( используя   аксессуары )  с   определением   его  
 * стоимости .  Провести   сортировку   цветов   в   букете   на  
 * основе   уровня   свежести .  Найти   цветок   в   букете , 
 * соответствующий   заданному   диапазону   длин  
 * стеблей . 
 */
package hometasks.task5.subtask1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author OsinVladimir
 */
public class FlowerShop {

    public static void main(String[] args) {
        Flower ros = new Rose(40.55, 1, 15);
        Flower tup = new Tulip(20.00, 2, 50);
        Flower carn = new Carnation(10.25, 3, 50);
        Flower ros1 = new Rose(20.55, 3, 35);
        Flower tup2 = new Tulip(25.00, 1, 25);

        Bouquet bouquet = new Bouquet();

        bouquet.addFlower(ros);
        bouquet.addFlower(tup);
        bouquet.addFlower(carn);
        bouquet.addFlower(ros1);
        bouquet.addFlower(tup2);

        //добавляем аксесуары
        bouquet.setAccessories("Пленка прозрачная");
        bouquet.setPriceAccessories(10.5);
        double totalPrice;
        totalPrice = bouquet.getPrice() + bouquet.getPriceAccessories();

        System.out.println("Стоимость букета с учетом акссесуаров" + " " + totalPrice);
        System.out.println("Стоимость букета без акссесуаров" + " " + bouquet.getPrice());
        System.out.println("Стоимость акссесуара" + " " + bouquet.getAccessories() + " " + "=" + bouquet.getPriceAccessories());

        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Сортировка цветов на уровне свежести нажмите  : 1 ");
            System.out.println("Найти цветок в букете,соответствующий заданному  диапазону длин стеблей нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        bouquet.sortList();
                    }
                    break;
                    case 2: {
                        System.out.println("Введите начальный диапазон длины стебля. ");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("Введите конечный диапазон длины стебля. ");
                        int r2 = Integer.parseInt(sc.next());
                        bouquet.findFlower(r1, r2);
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
// базовый класс цветок

class Flower {
//определяем поля

    private String name;//название
    private double price;//цена
    private int levelFresh;//уровень свежести
    private int stemLength;//длина стебля
    //конструкторы

    Flower() {
    }

    Flower(String name, double price, int levelFresh, int stemLength) {
        this.name = name;
        this.price = price;
        this.levelFresh = levelFresh;
        this.stemLength = stemLength;
    }

    Flower(String name, double price) {
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

    public void setLevelFresh(int levelFresh) {
        this.levelFresh = levelFresh;
    }

    public int getLevelFresh() {
        return levelFresh;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    public int getStemLength() {
        return stemLength;
    }

    @Override
    public String toString() {
        return "Цветок:" + " " + name + " " + "Цена =" + price + " " + "Уровень свежести=" + " "
                + levelFresh + " " + "Длина стебля =" + stemLength;
    }

}
//классы наследники

class Rose extends Flower {

    private final static String name = "Роза";

    Rose(double price, int levelFresh, int stemLength) {
        super(name, price, levelFresh, stemLength);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Tulip extends Flower {

    private final static String name = "Тюльпан";

    Tulip(double price, int levelFresh, int stemLength) {
        super(name, price, levelFresh, stemLength);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Carnation extends Flower {

    private final static String name = "Гвоздика";

    Carnation(double price, int levelFresh, int stemLength) {
        super(name, price, levelFresh, stemLength);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Bouquet {

    private double price;//цена букета
    private String accessories;//акссесуары букета
    private double priceAccessories;//цена акссесуара

    public double getPrice() {
        return price;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    public String getAccessories() {
        return accessories;
    }

    public void setPriceAccessories(double priceAccessories) {
        this.priceAccessories = priceAccessories;
    }

    public double getPriceAccessories() {
        return priceAccessories;
    }

    private ArrayList<Flower> flowers = new ArrayList<Flower>();

    public Bouquet addFlower(Flower flower) {
        flowers.add(flower);
        price += flower.getPrice();
        return this;
    }

    public void sortList() {

        Collections.sort(flowers, new MyComparator());

        for (int i = 0; i < flowers.size(); i++) {
            System.out.println(flowers.get(i).toString());
        }
    }

    public void findFlower(int d1, int d2) {
        int flg = 0;
        for (int i = 0; i < flowers.size(); i++) {
            if ((flowers.get(i).getStemLength() >= d1) & (flowers.get(i).getStemLength() <= d2)) {
                System.out.println(flowers.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такого  цветка");
        }
    }

}

class MyComparator implements Comparator<Flower> {

    @Override
    public int compare(Flower f1, Flower f2) {
        return Integer.compare(f1.getLevelFresh(), f2.getLevelFresh());
    }

}
