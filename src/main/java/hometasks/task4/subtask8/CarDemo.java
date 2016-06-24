/*
 * 8. Car: id,  Марка ,  Модель ,  Год   выпуска ,  Цвет ,  Цена , 
 *  Регистрационный   номер . 
 *  Создать   массив   объектов .  Вывести : 
 *  a)список   автомобилей   заданной   марки ; 
 *  b)список   автомобилей   заданной   модели , 
 *  которые   эксплуатируются   боль ­ ше  n лет ; 
 *  c) список   автомобилей   заданного   года  
 *  выпуска ,  цена   которых   больше   ука ­ занной .
 */
package hometasks.task4.subtask8;

import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class CarDemo {

    public static void main(String[] args) {
        //заполняем объект машина данными
        Car c1 = new Car(1, "Волга", 3, 1981, "черный", 1500.25, 1452);
        Car c2 = new Car(2, "Жигули", 5, 1978, "белый", 3000.45, 2589);
        Car c3 = new Car(3, "Москвич", 3, 1936, "зеленый", 5000.25, 4578);
        Car c4 = new Car(4, "Жигули", 7, 1948, "серебристый", 12050.45, 8965);
        Car c5 = new Car(5, "Митсубиси", 4, 1991, "белый", 75000.44, 2356);
        //создаем массив
        Car[] cr = new Car[5];
        cr[0] = c1;
        cr[1] = c2;
        cr[2] = c3;
        cr[3] = c4;
        cr[4] = c5;
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Cписок   автомобилей   заданной   марки введите  : 1 ");
            System.out.println("Cписок   автомобилей   заданной   модели которые эксплуатируются   больше  n лет нажмите : 2 ");
            System.out.println("Список   автомобилей   заданного  года  выпуска ,цена  которых больше указанной  нажмите : 3 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        System.out.println("Введите марку автомобиля: Волга -1;Жигули-2;Москвич-3;Митсубиси-4");
                        int r = Integer.parseInt(sc.next());
                        printMarka(cr, r);
                    }
                    break;
                    case 2: {
                        System.out.println("Введите модель автомобиля: целое число от 1 до 7");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("Введите количество лет эксплуатации");
                        int r2 = Integer.parseInt(sc.next());
                        printModel(cr, r1, r2);
                    }
                    break;
                    case 3: {
                        System.out.println("Введите год выпуска (целое число в формате хххх");
                        int r3 = Integer.parseInt(sc.next());
                        System.out.println("Введите цену");
                        double r4 = Double.parseDouble(sc.next());
                        printYear(cr, r3, r4);
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

    static void printMarka(Car[] arr, int marka) {
        String result;
        switch (marka) {
            case 1: {
                result = "Волга";
            }
            break;
            case 2: {
                result = "Жигули";
            }
            break;
            case 3: {
                result = "Москвич";
            }
            break;
            case 4: {
                result = "Митсубиси";
            }
            break;
            default: {
                result = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getMarka().equals(result)) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого авто");
        }
    }

    static void printModel(Car[] arr, int model, int countYear) {
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i].getModel() == model) & (arr[i].countYearEkspl() > countYear)) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого авто");
        }
    }

    static void printYear(Car[] arr, int yearVypuska, double price) {
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i].getYearVypuska() == yearVypuska) & (arr[i].getPrice() > price)) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого авто");
        }
    }

}

class Car {
//определяем поля класса

    private int id;
    private String marka;
    private int model;
    private int yearVypuska;
    private String color;
    private double price;
    private int regNumber;

//определяем конструкторы
    Car() {
    }

    Car(int id, String marka, int model, int yearVypuska, String color, double price, int regNumber) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.yearVypuska = yearVypuska;
        this.color = color;
        this.price = price;
        this.price = regNumber;
    }

    Car(int id, String marka, int model, int yearVypuska, String color) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.yearVypuska = yearVypuska;
        this.color = color;

    }

    Car(int id, String marka, int model) {
        this.id = id;
        this.marka = marka;
        this.model = model;
    }

//определяем геттеры и сеттеры
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getModel() {
        return model;
    }

    public void setYearVypuska(int yearVypuska) {
        this.yearVypuska = yearVypuska;
    }

    public int getYearVypuska() {
        return yearVypuska;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public int getRegNumber() {
        return regNumber;
    }

    @Override
    public String toString() {
        return "Автомобиль" + " " + "id =" + " " + id + " " + "Марка=" + marka + " " + "Модель=" + " " + model + " " + "Год выпуска =" + yearVypuska + " "
                + "Цвет=" + " " + color + " " + "Цена:" + " " + price + " Регистрационный номер=" + " "
                + regNumber;
    }

    public int countYearEkspl() {
        int currentYear = 2016;
        return currentYear - yearVypuska;
    }
}
