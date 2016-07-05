/*Customer
  id,  Фамилия ,  Имя ,  Отчество ,  Адрес ,  Номер  
  кредитной   карточки ,  номер   банковского  
  счета . 
  Создать   массив   объектов .  Вывести : 
  a)   список   покупателей   в   алфавитном   порядке ; 
  b)   список   покупателей ,  у   которых   номер  
   кредитной   карточки   находится   
  в   заданном   интервале . 
 */
package com.hm.hometasks.oop_part_1.customer;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class CustomerDemo {

    public static void main(String[] args) {
        Customer [] customers = createListCustomer();
        consolIO(customers);
    }
public  static Customer [] createListCustomer(){
    //заполняем объект покупатель данными
        Customer c1 = new Customer(1, "Глебов", "Иван", "Ильич", "ул.Северная 125", 6425, 123456789);
        Customer c2 = new Customer(2, "Мышков", "Семен", "Федорович", "ул.Крутая 15", 8856, 123547892);
        Customer c3 = new Customer(3, "Яковлев", "Валентин ", "Петрович", "ул.Крутая 15", 7835, 254800369);
        Customer c4 = new Customer(4, "Джигурда", "Василий ", "Семенович", "ул.Крутая 2", 2569, 52368975);
        Customer c5 = new Customer(5, "Хабибулин", "Петр ", "Николаевич", "ул.Крепкая 147", 8930, 50602534);
        //создаем массивІ
        Customer[] ct = new Customer[5];
        ct[0] = c1;
        ct[1] = c2;
        ct[2] = c3;
        ct[3] = c4;
        ct[4] = c5;
        return ct;
}
public static void consolIO(Customer[]customers){
       Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("для выведения списка покупателей в алфавитном порядке нажмите : 1 ");
            System.out.println("Для выведения списка покупателей ,  у   которых   номер  кредитной   карточки   находится  в   заданном   интервале нажмите :2");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        printCustomer(customers);
                    }
                    break;
                    case 2: {
                        System.out.println("Задайте интервал номера кредитной карты");
                        System.out.println("Начальный диапазон");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("Конечный диапазон");
                        int r2 = Integer.parseInt(sc.next());
                        printCreditCard(customers, r1, r2);
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
public static void printCustomer(Customer[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }

public static void printCreditCard(Customer[] arr, int d1, int d2) {
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i].getCreditCard() > d1) & (arr[i].getCreditCard() < d2)) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого покупателя");
        }
    }
}

