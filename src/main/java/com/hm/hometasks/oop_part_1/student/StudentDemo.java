/*
 *  Student: id,  Фамилия ,  Имя ,  Отчество ,  Дата   рождения , 
 *  Адрес ,  Телефон ,  
 *  Факультет ,  Курс ,  Группа . 
 *  Создать   массив   объектов .  Вывести : 
 *  a)   список   студентов   заданного   факультета ; 
 *  b)   списки   студентов   для   каждого   факультета   и  
 *  курса ; 
 *  c)   список   студентов ,  родившихся   после  
 *  заданного   года ; 
 *  d)   список   учебной   группы . 
 */
/**
 *
 * @author Osin Vladimir
 */
package com.hm.hometasks.oop_part_1.student;

import java.util.Arrays;
import java.util.Scanner;

public class StudentDemo {

    public static void main(String[] args) {
        
        Student [] students = createListStudent();
        consolIO(students);
       
    }
    
 public static Student [] createListStudent(){
     //заполняем объект студент данными
        Student s1 = new Student(1, "Иванов", "Иван", "Иванович", 1978, "ул.Корчагинцев 2", "123 45 67", "математический", 1, 1);
        Student s2 = new Student(2, "Петров", "Сергей", "Иванович", 1988, "ул.Блюхера 4", "123 88 67", "физический", 2, 3);
        Student s3 = new Student(3, "Сидоров", "Василий", "Митрофанович", 1980, "ул.Пушкинская44", "189 40 88", "химический", 3, 4);
        Student s4 = new Student(4, "Козлов", "Валентин", "Ильич", 1989, "ул.Блюхера 4", "123 88 67", "математический", 4, 2);
        Student s5 = new Student(5, "Быков", "Петр", "Васильевич", 1995, "ул.Пушкинская44", "189 40 88", "математический", 5, 3);
        //создаем массив
        Student[] st = new Student[5];
        st[0] = s1;
        st[1] = s2;
        st[2] = s3;
        st[3] = s4;
        st[4] = s5;  
        return st;
    }
    
public static void consolIO(Student [] students){
       Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Для списка  студентов   заданного   факультета введите : 1 ");
            System.out.println("Для списка  студентов   для   каждого   факультета   и   курса введите : 2 ");
            System.out.println("Для списка  студентов ,  родившихся   после заданного   года введите : 3 ");
            System.out.println("Для список  учебной   группы введите : 4 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        System.out.println("Введите номер факультета:математика -1,физика -2,химия-3");
                        int r = Integer.parseInt(sc.next());
                        printDepartment(students, r);//список   студентов   заданного   факультета ;
                    }
                    break;
                    case 2: {
                        printDepartmentCourse(students);// списки   студентов   для   каждого   факультета   и   курса ; 
                    }
                    break;
                    case 3: {
                        System.out.println("Введите год: ");
                        int r = Integer.parseInt(sc.next());
                        printStudentAfterYear(students, r);//список   студентов ,  родившихся   после заданного   года ;
                    }
                    break;
                    case 4: {
                        System.out.println("Введите номер учебной группы: ");
                        int a = Integer.parseInt(sc.next());
                        printGroup(students, a);//список   учебной   группы .
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
    
//Выводит список   студентов   заданного   факультета ;
public static void printDepartment(Student[] arr, int dep) {
        String result;
        switch (dep) {
            case 1: {
                result = "математический";
            }
            break;
            case 2: {
                result = "физический";
            }
            break;
            case 3: {
                result = "химический";
            }
            break;
            default: {
                result = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDepartment().equals(result)) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого студента");
        }
    }
// Выводит списки   студентов   для   каждого   факультета   и   курса ;
public static void printDepartmentCourse(Student[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }
//Выводит список   студентов ,  родившихся   после заданного   года ;
public static void printStudentAfterYear(Student[] arr, int birthDay) {
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getBirthDay() > birthDay) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого студента");
        }
    }
//Выводит список   учебной   группы .
public static void printGroup(Student[] arr, int numberGroup) {
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getGroup() == numberGroup) {
                System.out.println(arr[i].toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такого студента");
        }
    }
}

