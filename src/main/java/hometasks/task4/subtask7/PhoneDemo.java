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
package hometasks.task4.subtask7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class PhoneDemo {

    public static void main(String[] args) {
        //заполняем объект абонент данными
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
                        printTimeCity(ph, r1);
                    }
                    break;
                    case 2: {
                        printTimeBetweenCity(ph);
                    }
                    break;
                    case 3: {
                        printPhone(ph);
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

    static void printTimeCity(Phone[] arr, int countTimeCity) {
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

    static void printTimeBetweenCity(Phone[] arr) {
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

    static void printPhone(Phone[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }

}

class Phone implements Comparable {
//определяем поля класса"

    private int id;
    private String surname;
    private String name;
    private String patronimic;
    private String adress;
    private int creditCard;
    private int debet;
    private int kredit;
    private int timeCity;//время в минутах
    private int timeBetweenCity;//время в минутах

//определяем конструкторы
    Phone() {
    }

    Phone(int id, String surname, String name, String patronimic, String adress, int creditCard, int debet, int kredit, int timeCity, int timeBetweenCity) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronimic = patronimic;
        this.adress = adress;
        this.creditCard = creditCard;
        this.debet = debet;
        this.kredit = kredit;
        this.timeCity = timeCity;
        this.timeBetweenCity = timeBetweenCity;

    }

    Phone(String surname, String name, String patronimic, int creditCard) {
        this.surname = surname;
        this.name = name;
        this.patronimic = patronimic;
        this.creditCard = creditCard;
    }

    Phone(int creditCard) {
        this.creditCard = creditCard;

    }
///определяем геттеры и сеттеры

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSurname(String surname) {
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

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    public int getCreditCard() {
        return creditCard;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setDebet(int debet) {
        this.debet = debet;
    }

    public int getDebet() {
        return debet;
    }

    public void setKredit(int kredit) {
        this.kredit = kredit;
    }

    public int getKredit() {
        return kredit;
    }

    public void setTimeCity(int timeCity) {
        this.timeCity = timeCity;
    }

    public int getTimeCity() {
        return timeCity;
    }

    public void setTimeBetweenCity(int timeBetweenCity) {
        this.timeBetweenCity = timeBetweenCity;
    }

    public int getTimeBetweenCity() {
        return timeBetweenCity;
    }

    @Override
    public String toString() {
        return "Абонент" + " " + "id =" + " " + id + " " + "Фамилия=" + surname + " " + "Имя=" + " " + name + " " + "Отчеcтво=" + patronimic + " "
                + "Адрес=" + " " + adress + " " + "Номер кредитки=" + " " + creditCard + " "
                + "Дебет=" + " " + debet + " " + "Кредит = " + " " + kredit + " " + "Время городских переговоров = " + " "
                + timeCity + " " + "Время междугородних преговоров= " + " " + timeBetweenCity;
    }

    @Override
    public int compareTo(Object obj) {

        Phone entry = (Phone) obj;

        int result = surname.compareTo(entry.surname);
        if (result != 0) {
            return result;
        }
        return 0;
    }

}
