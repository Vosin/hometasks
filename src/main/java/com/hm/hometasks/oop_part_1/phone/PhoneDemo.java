/*
 * Phone: id,  Фамилия ,  Имя ,  Отчество ,  Адрес ,  Номер  
 * кредитной   карточки ,  
 * Дебет ,  Кредит ,  Время   городских   и  
 * междугородных   разговоров . 
 * Создать   массив   объектов .  Вывести : 
 * a)   сведения   об   абонентах ,  у   которых   время  
 * внутригородских   разговоров   
 * превышает   заданное ; b)   сведения   об   абонентах ,  которые  
 * пользовались   междугородной   связью ; 
 * c)   сведения   об   абонентах   в   алфавитном  
 * порядке . 
 */
package com.hm.hometasks.oop_part_1.phone;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class PhoneDemo {

    public static void main(String[] args) {
       
        Phone[]phones = createListPhones();
        consolIO(phones);
       }
public static Phone[]createListPhones(){
     //заполняем объект телефонов данными
        Phone p1 = new Phone(1, "Глебов", "Иван", "Ильич", "ул.Северная 125", 6425, 100, 257, 20, 0);
        Phone p2 = new Phone(2, "Мышков", "Семен", "Федорович", "ул.Крутая 15", 8856, 0, 328, 15, 45);
        Phone p3 = new Phone(3, "Яковлев", "Валентин ", "Петрович", "ул.Крутая 15", 7835, 300, 1000, 120, 0);
        Phone p4 = new Phone(4, "Джигурда", "Василий ", "Семенович", "ул.Крутая 2", 2569, 400, 4589, 360, 45);
        Phone p5 = new Phone(5, "Хабибулин", "Петр ", "Николаевич", "ул.Крепкая 147", 8930, 0, 2589, 458, 0);
        //создаем массивІ
        Phone[] ph = new Phone[5];
        ph[0] = p1;
        ph[1] = p2;
        ph[2] = p3;
        ph[3] = p4;
        ph[4] = p5;
        return ph;
}
public static void consolIO(Phone[]phones){
      Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Сведения   об   абонентах ,  у   которых   время внутригородских   разговоров превышает   заданное нажмите : 1 ");
            System.out.println("Сведения   об   абонентах ,  которые пользовались   междугородной   связью   нажмите :2");
            System.out.println("Сведения   об   абонентах ,  в   алфавитном  порядке. нажмите : 3");

            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        System.out.println("Задайте время внутри городских разговоров в минутах-");
                        int r1 = Integer.parseInt(sc.next());
                        printTimeCity(phones, r1);
                    }
                    break;
                    case 2: {
                        printTimeBetweenCity(phones);
                    }
                    break;
                    case 3: {
                        printPhone(phones);
                    }
                    break;
                    default: {
                        end = true;
                    }
                }
            } catch (Exception e) {
                end = true;
            }
            System.out.println("Желаете продолжить: 1 -Да,0-Нет ");
            int contunue = Integer.parseInt(sc.next());
            if(contunue==1){
                end = false;
            }else{
                end = true;
            }
        }
}
//Сведения   об   абонентах ,  у   которых   время внутригородских   разговоров превышает   заданное
public static void printTimeCity(Phone[] arr, int countTimeCity) {
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getTimeCity() > countTimeCity) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого абонента");
        }
    }
//Сведения   об   абонентах ,  которые пользовались   междугородной   связью   
public static void printTimeBetweenCity(Phone[] arr) {
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getTimeBetweenCity() > 0) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого абонента");
        }
    }
//Сведения   об   абонентах ,  в   алфавитном  порядке
public static void printPhone(Phone[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }

}

