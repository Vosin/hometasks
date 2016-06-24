/*
 * 12. Airline:  Пункт   назначения ,  Номер   рейса ,  Тип  
 *  самолета ,  Время   вылета ,  Дни   недели .  
 *  Создать   массив   объектов .  Вывести : 
 *  a)   список   рейсов   для   заданного   пункта  
 *  назначения ; 
 *  b)   список   рейсов   для   заданного   дня   недели ; 
 *  c)   список   рейсов   для   заданного   дня   недели , 
 *  время   вылета   для   которых   больше   заданного . 
 */
package hometasks.task4.subtask_12;

import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class AirLineDemo {

    public static void main(String[] args) {
        //заполняем объект лайнер данными
        AirLine ar1 = new AirLine("Москва", 3, "Пассажирский", 12.00, "Понедельник");
        AirLine ar2 = new AirLine("Питер", 15, "Грузовой", 15.45, "Вторник");
        AirLine ar3 = new AirLine("Вашингтон", 23, "Пассажирский", 16.00, "Пятница");
        AirLine ar4 = new AirLine("НьюЙорк", 27, "Пассажирский", 12.00, "Суббота");
        AirLine ar5 = new AirLine("Москва", 41, "Грузовой", 00.45, "Пятница");
        //создаем массив
        AirLine[] ar = new AirLine[5];
        ar[0] = ar1;
        ar[1] = ar2;
        ar[2] = ar3;
        ar[3] = ar4;
        ar[4] = ar5;
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Cписок   рейсов   для   заданного   пункта назначения   введите  : 1 ");
            System.out.println("Cписок   рейсов   для   заданного   дня   недели нажмите - 2 ");
            System.out.println("Cписок   рейсов   для   заданного   дня   недели время   вылета   для   которых   больше   заданного  нажмите - 3 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        System.out.println("Введите пункт назначения:Москва -1,Питер-2,Вашингтон-3,НьюЙорк-4");
                        int r = Integer.parseInt(sc.next());
                        printDestination(ar, r);
                    }
                    break;
                    case 2: {
                        System.out.println("Введите день недели понедельник-1; вторник-2; среда-3;четверг-4;пятница-5;суббота -6; воскресенье-7");
                        int r1 = Integer.parseInt(sc.next());
                        printDays(ar, r1);
                    }
                    break;
                    case 3: {

                        System.out.println("Введите день недели понедельник-1; вторник-2; среда-3;четверг-4;пятница-5;суббота -6; воскресенье-7");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("Введите  время вылета");
                        double r2 = Double.parseDouble(sc.next());
                        printTimeDeparture(ar, r1, r2);
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

    static void printDestination(AirLine[] arr, int destination) {
        String result;
        switch (destination) {
            case 1: {
                result = "Москва";
            }
            break;
            case 2: {
                result = "Питер";
            }
            break;
            case 3: {
                result = "Вашингтон";
            }
            break;
            case 4: {
                result = "НьюЙорк";
            }
            break;
            default: {
                result = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDestination().equals(result)) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого пункта назначения");
        }
    }

    static void printDays(AirLine[] arr, int day) {
        String result;
        switch (day) {
            case 1: {
                result = "Понедельник";
            }
            break;
            case 2: {
                result = "Вторник";
            }
            break;
            case 3: {
                result = "Среда";
            }
            break;
            case 4: {
                result = "Четверг";
            }
            break;
            case 5: {
                result = "Пятница";
            }
            break;
            case 6: {
                result = "Суббота";
            }
            break;
            case 7: {
                result = "Воскресенье";
            }
            break;
            default: {
                result = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDays().equals(result)) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого  дня недели");
        }
    }

    static void printTimeDeparture(AirLine[] arr, int day, double timeDepature) {
        String result;
        switch (day) {
            case 1: {
                result = "Понедельник";
            }
            break;
            case 2: {
                result = "Вторник";
            }
            break;
            case 3: {
                result = "Среда";
            }
            break;
            case 4: {
                result = "Четверг";
            }
            break;
            case 5: {
                result = "Пятница";
            }
            break;
            case 6: {
                result = "Суббота";
            }
            break;
            case 7: {
                result = "Воскресенье";
            }
            break;
            default: {
                result = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i].getDays().equals(result)) & (arr[i].getTimeDeparture() > timeDepature)) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого  времени вылета ");
        }
    }

}

class AirLine {
//определяем поля класса

    private String destination;
    private int numberReys;
    private String typeAir;
    private double timeDeparture;
    private String days;

//определяем конструкторы
    AirLine() {
    }

    AirLine(String destination, int numberReys, String typeAir, double timeDeparture, String days) {
        this.destination = destination;
        this.numberReys = numberReys;
        this.typeAir = typeAir;
        this.timeDeparture = timeDeparture;
        this.days = days;
    }

    AirLine(String destination, int numberReys, String typeAir) {
        this.destination = destination;
        this.numberReys = numberReys;
        this.typeAir = typeAir;
    }

    AirLine(int numberReys, String typeAir, double timeDeparture) {
        this.numberReys = numberReys;
        this.typeAir = typeAir;
        this.timeDeparture = timeDeparture;

    }

//определяем геттеры и сеттеры
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setNumberReys(int numberReys) {
        this.numberReys = numberReys;
    }

    public int getNumberReys() {
        return numberReys;
    }

    public void setTypeAir(String typeAir) {
        this.typeAir = typeAir;
    }

    public String getTypeAir() {
        return typeAir;
    }

    public void setTimeDeparture(double timeDeparture) {
        this.timeDeparture = timeDeparture;
    }

    public double getTimeDeparture() {
        return timeDeparture;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getDays() {
        return days;
    }

    @Override
    public String toString() {
        return "Лайнер" + " " + "Пункт назначения=" + " " + destination + " " + "номер рейса=" + numberReys + " "
                + "тип самолета=" + " " + typeAir + " " + "Время вылета =" + timeDeparture + " "
                + "День недели=" + " " + days;
    }

    
}
