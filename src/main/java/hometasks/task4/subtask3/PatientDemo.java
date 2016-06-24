/*
 * id,  Фамилия ,  Имя ,  Отчество ,  Адрес ,  Телефон , 
 *  Номер   медицинской   карты ,  Диагноз . 
 *  Создать   массив   объектов .  Вывести : 
 *  a)   список   пациентов ,  имеющих   данный   диагноз ; 
 *  b)   список   пациентов ,  номер   медицинской   карты  
 *  которых   находится   в   за ­ данном   интервале . 
 */
package hometasks.task4.subtask3;

import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class PatientDemo {

    public static void main(String[] args) {
        //заполняем объект пациент данными
        Patient p1 = new Patient(1, "Иванов", "Иван", "Иванович", "ул.Корчагинцев 2", 24, "123 45 67", "диабет");
        Patient p2 = new Patient(2, "Петров", "Сергей", "Иванович", "ул.Блюхера 4", 12, "123 88 67", "ишемия");
        Patient p3 = new Patient(3, "Сидоров", "Василий", "Митрофанович", "ул.Пушкинская44", 11, "189 40 88", "инфаркт");
        Patient p4 = new Patient(4, "Козлов", "Валентин", "Ильич", "ул.Блюхера 4", 44, "123 88 67", "инсульт");
        Patient p5 = new Patient(5, "Быков", "Петр", "Васильевич", "ул.Пушкинская44", 88, "189 40 88", "диабет");
        //создаем массив
        Patient[] pt = new Patient[5];
        pt[0] = p1;
        pt[1] = p2;
        pt[2] = p3;
        pt[3] = p4;
        pt[4] = p5;
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Для списка  пациентов ,  имеющих   данный   диагноз : 1 ");
            System.out.println("Для списка  список   пациентов ,  номер   медицинской   карты  которых   находится   в   за ­ данном   интервале нажмите 2  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        System.out.println("Введите диагноз:диабет -1,ишемия -2,инфаркт-3,инсульт-4");
                        int r = Integer.parseInt(sc.next());
                        printPatient(pt, r);
                    }
                    break;
                    case 2: {
                        System.out.println("Задайте интервал номера медицинской карты");
                        System.out.println("Начальный диапазон");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("Конечный диапазон");
                        int r2 = Integer.parseInt(sc.next());
                        printNumberMedicinCard(pt, r1, r2);
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

    static void printPatient(Patient[] arr, int d) {
        String result;
        switch (d) {
            case 1: {
                result = "диабет";
            }
            break;
            case 2: {
                result = "ишемия";
            }
            break;
            case 3: {
                result = "инфаркт";
            }
            break;
            case 4: {
                result = "инсульт";
            }
            break;
            default: {
                result = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDiagnoz().equals(result)) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого диагноза");
        }
    }

    static void printNumberMedicinCard(Patient[] arr, int d1, int d2) {
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i].getMedicinCard() > d1) & (arr[i].getMedicinCard() < d2)) {
                System.out.println(arr[i].toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такого пациента");
        }
    }
}

class Patient {
//определяем поля класса

    private int id;
    private String surname;
    private String name;
    private String patronimic;
    private String adress;
    private String phone;
    private int medicinCard;
    private String diagnoz;

//определяем конструкторы
    Patient() {
    }

    Patient(int id, String surname, String name, String patronimic, String adress, int medicinCard, String phone, String diagnoz) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronimic = patronimic;
        this.adress = adress;
        this.medicinCard = medicinCard;
        this.phone = phone;
        this.diagnoz = diagnoz;
    }

    Patient(String surname, String name, String patronimic, int creditCard) {
        this.surname = surname;
        this.name = name;
        this.patronimic = patronimic;
        this.medicinCard = medicinCard;
    }

    Patient(int creditCard) {
        this.medicinCard = medicinCard;

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

    public void setMedicinCard(int medicinCard) {
        this.medicinCard = medicinCard;
    }

    public int getMedicinCard() {
        return medicinCard;
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

    public void setDiagnoz(String diagnoz) {
        this.diagnoz = diagnoz;
    }

    public String getDiagnoz() {
        return diagnoz;
    }

    @Override
    public String toString() {
        return "Пациент" + " " + "id =" + " " + id + " " + "Фамилия=" + surname + " " + "Имя=" + " " + name + " " + "Отчеcтво=" + patronimic + " "
                + "Адрес=" + " " + adress + " " + "Телефон:" + " " + phone + "Номер медицинской карты=" + " " + medicinCard + " "
                + "Диагноз=" + " " + diagnoz;
    }
}
