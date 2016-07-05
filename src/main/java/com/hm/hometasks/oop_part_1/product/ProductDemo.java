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
package com.hm.hometasks.oop_part_1.product;

import java.util.Scanner;

/**
 *
 * @author OsinVladimir
 */
public class ProductDemo {

    public static void main(String[] args) {
      Product[]products = createLisProducts();
      conscolIO(products);
    }
    public static Product[]createLisProducts(){
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
        return pt;
    }
    public static void conscolIO(Product[]products){
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
                        printTovar(products, r);
                    }
                    break;
                    case 2: {
                        System.out.println("Введите наименование товара: Молоко -1;Кефир-2;Сметана-3;Ряженка-4");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("Введите цену");
                        double r2 = Double.parseDouble(sc.next());
                        printPrice(products, r1, r2);
                    }
                    break;
                    case 3: {
                        System.out.println("Введите срок хранения в днях");
                        int r3 = Integer.parseInt(sc.next());
                        printTimeStorage(products, r3);
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
//Cписок   товаров   для   заданного наименования
 public static void printTovar(Product[] arr, int tovar) {
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
//Cписок   товаров   для   заданного наименования ,  цена   которых   не   превос ­ ходит заданную
public static void printPrice(Product[] arr, int tovar, double price) {
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
//Cписок   товаров ,  срок   хранения   которых больше   заданного
 public static void printTimeStorage(Product[] arr, int timeStorage) {
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

