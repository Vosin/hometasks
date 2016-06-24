/*
 * Abiturient: id,  Фамилия ,  Имя ,  Отчество ,  Адрес , 
 * Телефон ,  Оценки .  
 * Создать   массив   объектов .  Вывести : a)   список   абитуриентов ,  имеющих  
 * неудовлетворительные   оценки ; 
 * b)   список   абитуриентов ,  у   которых   сумма  
 * баллов   выше   заданной ; 
 * c)   выбрать   заданное   число  n абитуриентов , 
 * имеющих   самую   высокую   
 *  сумму   баллов  ( вывести   также   полный   список  
 * абитуриентов ,  имеющих   полупроходную   сумму ). 
 */
package hometasks.task4.subtask4;

import java.util.Scanner;

/**
 * @author Osin vladimir
 */
public class AbiturientDemo {

    public static void main(String[] args) {
        //заполняем объект абитурент данными
        Abiturient a1 = new Abiturient(1, "Иванов", "Иван", "Иванович", "ул.Корчагинцев 2", 10, 8, 12, "123 45 67");
        Abiturient a2 = new Abiturient(2, "Петров", "Сергей", "Иванович", "ул.Блюхера 4", 4, 12, 8, "123 88 67");
        Abiturient a3 = new Abiturient(3, "Сидоров", "Василий", "Митрофанович", "ул.Пушкинская44", 6, 10, 12, "123 88 67");
        Abiturient a4 = new Abiturient(4, "Козлов", "Валентин", "Ильич", "ул.Блюхера 4", 12, 10, 10, "123 88 67");
        Abiturient a5 = new Abiturient(5, "Быков", "Петр", "Васильевич", "ул.Пушкинская44", 8, 6, 12, "123 88 67");
        //создаем массив
        Abiturient[] at = new Abiturient[5];
        at[0] = a1;
        at[1] = a2;
        at[2] = a3;
        at[3] = a4;
        at[4] = a5;
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Для списка   абитуриентов ,  имеющих  неудовлетворительные   оценки введите  : 1 ");
            System.out.println("Для списка   абитуриентов ,  у   которых   сумма  баллов   выше   заданной нажмите : 2 ");
            System.out.println("Для списка   абитуриентов ,   имеющих   самую   высокую сумму   баллов нажмите : 3 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        printAbiturient(at);
                    }
                    break;
                    case 2: {
                        System.out.println("Задайте сумму баллов");
                        int r1 = Integer.parseInt(sc.next());
                        printSumBall(at, r1);
                    }
                    break;
                    case 3: {
                        System.out.println("Задайте количество абитурьентов, но не больше 5");
                        int r1 = Integer.parseInt(sc.next());
                        printHighSumBall(at, r1);
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

    static void printAbiturient(Abiturient[] arr) {
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].badBall() == true) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет таких абитурьентов");
        }
    }

    static void printSumBall(Abiturient[] arr, int count) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].sumAllBall() > count) {
                System.out.println("Сумма баллов выше заданной");
                System.out.println(arr[i].toString());
            } else {
                System.out.println("Сумма баллов меньше заданной");
                System.out.println(arr[i].toString());
            }
        }
    }

    static void printHighSumBall(Abiturient[] arr, int countAbiturient) {

        int maxValue = 30;//задаем проходной балл
        int maxValue2 = 15;//задаем полупроходной балл

        for (int i = 0; i < countAbiturient; i++) {
            if (arr[i].sumAllBall() > maxValue) {
                System.out.println("Сумма баллов высокая");
                System.out.println(arr[i].toString());
            } else if (arr[i].sumAllBall() == maxValue2) {
                System.out.println("Сумма баллов полупроходная");
                System.out.println(arr[i].toString());
            }
        }
    }
}

class Abiturient {
//определяем поля класса

    private int id;
    private String surname;
    private String name;
    private String patronimic;
    private String adress;
    private String phone;
    private int ballFizika;
    private int ballChimiya;
    private int ballBiologiya;

//определяем конструкторы
    Abiturient() {
    }

    Abiturient(int id, String surname, String name, String patronimic, String adress, int ballFizika, int ballChimiya, int ballBiologiya, String phone) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronimic = patronimic;
        this.adress = adress;
        this.ballFizika = ballFizika;
        this.ballChimiya = ballChimiya;
        this.ballBiologiya = ballBiologiya;
        this.phone = phone;

    }

    Abiturient(String surname, String name, String patronimic, int ballFizika, int ballChimiya, int ballBiologiya) {
        this.surname = surname;
        this.name = name;
        this.patronimic = patronimic;
        this.ballFizika = ballFizika;
        this.ballChimiya = ballChimiya;
        this.ballBiologiya = ballBiologiya;
    }

    Abiturient(int ballFizika, int ballChimiya, int ballBiologiya) {
        this.ballFizika = ballFizika;
        this.ballChimiya = ballChimiya;
        this.ballBiologiya = ballBiologiya;

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

    public void setBallFizika(int ballFizika) {
        this.ballFizika = ballFizika;
    }

    public int getBallFizika() {
        return ballFizika;
    }

    public void setBallChimiya(int ballChimiya) {
        this.ballChimiya = ballChimiya;
    }

    public int getBallChimiya() {
        return ballChimiya;
    }

    public void setBallBiologiya(int ballBiologiya) {
        this.ballBiologiya = ballBiologiya;
    }

    public int getBallBiologiya() {
        return ballBiologiya;
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

    @Override
    public String toString() {
        return "Абитурьент" + " " + "id =" + " " + id + " " + "Фамилия=" + surname + " " + "Имя=" + " " + name + " " + "Отчеcтво=" + patronimic + " "
                + "Адрес=" + " " + adress + " " + "Телефон:" + " " + phone + " Оценка по физике=" + " "
                + ballFizika + ": " + "Оценка по химии=" + " " + ballChimiya + ": " + "Оценка по биологии =" + " " + ballBiologiya;
    }

    public int sumAllBall() {
        return ballFizika + ballChimiya + ballBiologiya;
    }
//хорошими будем считать оценки выше 8 баллов

    public boolean badBall() {
        if (ballFizika < 8 | ballChimiya < 8 | ballBiologiya < 8) {
            return true;
        } else {
            return false;
        }

    }
}
