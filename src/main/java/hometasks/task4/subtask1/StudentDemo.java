/*
 * Student: id,  Фамилия ,  Имя ,  Отчество ,  Дата   рождения , 
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
package hometasks.task4.subtask1;

import java.util.Arrays;
import java.util.Scanner;

public class StudentDemo {

    public static void main(String[] args) {
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
                        printDepartment(st, r);//список   студентов   заданного   факультета ;
                    }
                    break;
                    case 2: {
                        printDepartmentCourse(st);// списки   студентов   для   каждого   факультета   и   курса ; 
                    }
                    break;
                    case 3: {
                        System.out.println("Введите год: ");
                        int r = Integer.parseInt(sc.next());
                        printStudentAfterYear(st, r);//список   студентов ,  родившихся   после заданного   года ;
                    }
                    break;
                    case 4: {
                        System.out.println("Введите номер учебной группы: ");
                        int a = Integer.parseInt(sc.next());
                        printGroup(st, a);//список   учебной   группы .
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

    static void printDepartment(Student[] arr, int dep) {
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

    static void printDepartmentCourse(Student[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }

    static void printStudentAfterYear(Student[] arr, int birthDay) {
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

    static void printGroup(Student[] arr, int numberGroup) {
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

class Student implements Comparable {
//определяем поля класса"

    private int id;
    private String surname;
    private String name;
    private String patronimic;
    private int birthDay;
    private String adress;
    private String phone;
    private String department;
    private int course;
    private int group;
//определяем конструкторы

    Student() {
    }

    Student(int id, String surname, String name, String patronimic, int birthDay, String adress, String phone, String department, int course, int group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronimic = patronimic;
        this.birthDay = birthDay;
        this.adress = adress;
        this.phone = phone;
        this.department = department;
        this.course = course;
        this.group = group;
    }

    Student(int id, String surname, String name, String patronimic, int birthDay) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronimic = patronimic;
        this.birthDay = birthDay;
    }

    Student(int id, String surname, String name, String patronimic, int birthDay, String adress, String phone) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronimic = patronimic;
        this.birthDay = birthDay;
        this.adress = adress;
    }
//определяем геттеры и сеттеры

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSurnname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPatronimic(String patronimic) {
        this.patronimic = patronimic;

    }

    public String getPatronimic() {
        return patronimic;
    }

    public void setBirthDay(int birthday) {
        this.birthDay = birthday;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setDepartment(String department) {
        this.department = department;

    }

    public String getDepartment() {
        return department;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Студент" + " " + "Фамилия=" + surname + " " + "Имя=" + " " + name + " " + "Отчеcтво=" + patronimic + " "
                + "ДеньРождения" + " " + birthDay + " " + "Адрес=" + " " + adress + " " + "Телефон=" + " " + phone + " "
                + "Факультет=" + " " + department + " " + "Курс=" + " " + course + " " + "Группа=" + " " + group;
    }

    @Override
    public int compareTo(Object obj) {

        Student entry = (Student) obj;

        int result = department.compareTo(entry.department);
        if (result != 0) {
            return result;
        }

        result = course - entry.course;
        if (result != 0) {
            return (int) result / Math.abs(result);
        }
        return 0;
    }
}
