/*
 * 11. Bus:  Фамилия   и   инициалы   водителя ,  Номер  
 *  автобуса ,  Номер   маршрута ,  
 *  Марка ,  Год   начала   эксплуатации ,  Пробег . Создать   массив   объектов .  Вывести : 
 *  a)   список   автобусов   для   заданного   номера  
 *  маршрута ; 
 *   b)   список   автобусов ,  которые  
 *  эксплуатируются   больше   заданного   срока ; 
 *   c)   список   автобусов ,  пробег   у   которых   больше  
 *  заданного   расстояния . 
 
 */
package hometasks.task4.subtask_11;

import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class BusDemo {

    public static void main(String[] args) {
        //заполняем объект автобус данными
        Bus bs1 = new Bus("Петров В.И", 3, 14, "Лаз", 1998, 1000);
        Bus bs2 = new Bus("Сидоров А.В", 15, 18, "Богдан", 2005, 1100);
        Bus bs3 = new Bus("Джугашвили А.Юв", 23, 22, "Лаз", 2000, 5000);
        Bus bs4 = new Bus("Яковлев Ю.А", 27, 45, "ПАЗ", 2010, 10000);
        Bus bs5 = new Bus("Скубак Е.Ю", 41, 14, "Богдан", 2015, 100000);
        //создаем массив
        Bus[] bs = new Bus[5];
        bs[0] = bs1;
        bs[1] = bs2;
        bs[2] = bs3;
        bs[3] = bs4;
        bs[4] = bs5;
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Cписок   автобусов   для   заданного   номера маршрута  введите  : 1 ");
            System.out.println("Список   автобусов ,  которые  эксплуатируются   больше   заданного   срока нажмите - 2 ");
            System.out.println("Список   автобусов ,  пробег   у   которых   больше  заданного   расстояния  нажмите - 3 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        System.out.println("Введите номер маршрута:");
                        int r = Integer.parseInt(sc.next());
                        printNumberMarshruta(bs, r);
                    }
                    break;
                    case 2: {
                        System.out.println("Введите срок эксплуатации");
                        int r1 = Integer.parseInt(sc.next());
                        printSrokEkspluatatsii(bs, r1);
                    }
                    break;
                    case 3: {
                        System.out.println("Введите  пробег");
                        int r1 = Integer.parseInt(sc.next());
                        printProbeg(bs, r1);
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

    static void printNumberMarshruta(Bus[] arr, int numberMarschruta) {
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getNumberMarshruta() == numberMarschruta) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого маршрута");
        }
    }

    static void printSrokEkspluatatsii(Bus[] arr, int srokEkspluatasii) {
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].SrokEkspluatasii() > srokEkspluatasii) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого  срока эксплуатации");
        }
    }

    static void printProbeg(Bus[] arr, int probeg) {
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getProbeg() > probeg) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого  пробега");
        }
    }

}

class Bus {
//определяем поля класса

    private String surname;
    private int numberBus;
    private int numberMarshruta;
    private String marka;
    private int godStartEkspluatatsii;
    private int probeg;// в километрах

//определяем конструкторы
    Bus() {
    }

    Bus(String surname, int numberBus, int numberMarshruta, String marka, int godStartEkspluatatsii, int probeg) {
        this.surname = surname;
        this.numberBus = numberBus;
        this.numberMarshruta = numberMarshruta;
        this.marka = marka;
        this.godStartEkspluatatsii = godStartEkspluatatsii;
        this.probeg = probeg;
    }

    Bus(String surname, int numberBus, int numberMarshruta) {
        this.surname = surname;
        this.numberBus = numberBus;
        this.numberMarshruta = numberMarshruta;
    }

    Bus(int numberBus, int numberMarshruta, String marka, int probeg) {
        this.numberBus = numberBus;
        this.numberMarshruta = numberMarshruta;
        this.marka = marka;
        this.probeg = probeg;
    }

//определяем геттеры и сеттеры
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setNumberBus(int numberBus) {
        this.numberBus = numberBus;
    }

    public int getNumberBus() {
        return numberBus;
    }

    public void setNumberMarshruta(int numberMarshruta) {
        this.numberMarshruta = numberMarshruta;
    }

    public int getNumberMarshruta() {
        return numberMarshruta;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }

    public void setGodStartEkspluatatsii(int godStartEkspluatatsii) {
        this.godStartEkspluatatsii = godStartEkspluatatsii;
    }

    public int getGodStartEkspluatatsii() {
        return godStartEkspluatatsii;
    }

    public void setProbeg(int probeg) {
        this.probeg = probeg;
    }

    public int getProbeg() {
        return probeg;
    }

    @Override
    public String toString() {
        return "Автобус" + " " + "Водитель=" + " " + surname + " " + "номер=" + numberBus + " " + "номер маршрута=" + " " + numberMarshruta + " " + "Марка =" + marka + " "
                + "Год старта эксплуатации=" + " " + godStartEkspluatatsii + " " + "Пробег:" + " " + probeg;
    }

    public int SrokEkspluatasii() {
        int currentYear = 2016;
        return currentYear - godStartEkspluatatsii;
    }
}
