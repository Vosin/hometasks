/*
 * 9.  Product: id,  Наименование , UPC,  Производитель , 
 * Цена ,  Срок   хранения ,  
 * Количество . 
 * Создать   массив   объектов .  Вывести : 
 * a)   список   товаров   для   заданного  
 * наименования ; 
 * b)   список   товаров   для   заданного  
 * наименования ,  цена   которых   не   превос ­ ходит  
 * заданную ; 
 * c )   список   товаров ,  срок   хранения   которых  
 * больше   заданного . 
 */
package hometasks.task4.subtask9;

import java.util.Scanner;

/**
 *
 * @author OsinVladimir
 */
public class ProductDemo {

    public static void main(String[] args) {
        //заполняем объект продукт данными
        Product pt1 = new Product(1, "Молоко", 3, "БалМолоко", 10.55, 30, 420);
        Product pt2 = new Product(2, "Кефир", 5, "КрасноградМолоко", 15.25, 15, 156);
        Product pt3 = new Product(3, "Сметана", 3, "БалМолоко", 20.44, 25, 148);
        Product pt4 = new Product(4, "Ряженка", 7, "ХарьковМолоко", 15.22, 15, 200);
        Product pt5 = new Product(5, "Сметана", 4, "БогодуховМолоко", 25.33, 25, 150);
        //создаем массив
        Product[] pt = new Product[5];
        pt[0] = pt1;
        pt[1] = pt2;
        pt[2] = pt3;
        pt[3] = pt4;
        pt[4] = pt5;
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Cписок   товаров   для   заданного наименования  введите  : 1 ");
            System.out.println("Cписок   товаров   для   заданного наименования ,  цена   которых   не   превос ­ ходит заданную нажмите : 2 ");
            System.out.println("Cписок   товаров ,  срок   хранения   которых больше   заданного  нажмите : 3 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        System.out.println("Введите наименование товара: Молоко -1;Кефир-2;Сметана-3;Ряженка-4");
                        int r = Integer.parseInt(sc.next());
                        printTovar(pt, r);
                    }
                    break;
                    case 2: {
                        System.out.println("Введите наименование товара: Молоко -1;Кефир-2;Сметана-3;Ряженка-4");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("Введите цену");
                        double r2 = Double.parseDouble(sc.next());
                        printPrice(pt, r1, r2);
                    }
                    break;
                    case 3: {
                        System.out.println("Введите срок хранения в днях");
                        int r3 = Integer.parseInt(sc.next());
                        printTimeStorage(pt, r3);
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

    static void printTovar(Product[] arr, int tovar) {
        String result;
        switch (tovar) {
            case 1: {
                result = "Молоко";
            }
            break;
            case 2: {
                result = "Кефир";
            }
            break;
            case 3: {
                result = "Сметана";
            }
            break;
            case 4: {
                result = "Ряженка";
            }
            break;
            default: {
                result = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().equals(result)) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такой продукции");
        }
    }

    static void printPrice(Product[] arr, int tovar, double price) {
        String result;
        switch (tovar) {
            case 1: {
                result = "Молоко";
            }
            break;
            case 2: {
                result = "Кефир";
            }
            break;
            case 3: {
                result = "Сметана";
            }
            break;
            case 4: {
                result = "Ряженка";
            }
            break;
            default: {
                result = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i].getName().equals(result)) & (arr[i].getPrice() <= price)) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такой продукции");
        }
    }

    static void printTimeStorage(Product[] arr, int timeStorage) {
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i].getTimeStorage() > timeStorage)) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такой продукции");
        }
    }

}

class Product {
//определяем поля класса

    private int    id;
    private String name;
    private int    upc;
    private String company;
    private double price;
    private int    timeStorage;//в днях
    private int    count;

//определяем конструкторы
    Product() {
    }

    Product(int id, String name, int upc, String company, double price, int timeStorage, int count) {
        this.id          = id;
        this.name        = name;
        this.upc         = upc;
        this.company     = company;
        this.price       = price;
        this.timeStorage = timeStorage;
        this.count       = count;
    }

    Product(String name, int upc, String company) {
        this.name = name;
        this.upc = upc;
        this.company = company;

    }

    Product(String name, int upc, String company, double price) {
        this.name = name;
        this.upc = upc;
        this.company = company;
        this.price = price;

    }

//определяем геттеры и сеттеры
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUpc(int upc) {
        this.upc = upc;
    }

    public int getUpc() {
        return upc;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setTimeStorage(int timeStorage) {
        this.timeStorage = timeStorage;
    }

    public int getTimeStorage() {
        return timeStorage;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Продукт" + " " + "id =" + " " + id + " " + "Наименование=" + name + " " + "UPC=" + " " + upc + " " + "Производитель =" + company + " "
                + "Цена=" + " " + price + " " + "СрокХранения:" + " " + timeStorage + " Количество=" + " "
                + count;
    }

}
