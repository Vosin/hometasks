/*
 * 3.  Домашние   электроприборы .  Определить   иерархию  
 * электроприборов . 
 *  Включить   некоторые   в   розетку .  Подсчитать  
 *  потребляемую   мощность .  Провести   сортировку  
 *  приборов   в   квартире   на   основе   мощности .  Найти  
 *  прибор   в   квартире ,  соответствующий   заданному  
 *  диапазону   параметров . 
 */
package hometasks.task5.subtask3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author OsinVladimir
 */
public class HomeDeviceDemo {

    public static void main(String[] args) {
        HomeDevice k1 = new Kettle(1.20, true, 220);
        HomeDevice ir = new Iron(2.5, false, 210);
        HomeDevice hd = new HairDryer(1.5, false, 215);
        HomeDevice ir1 = new Iron(2.1, true, 220);
        HomeDevice k2 = new Kettle(1.8, true, 230);

        FlatDevice flatD = new FlatDevice();

        flatD.addHomeDevice(k1);
        flatD.addHomeDevice(ir);
        flatD.addHomeDevice(hd);
        flatD.addHomeDevice(ir1);
        flatD.addHomeDevice(k2);

        System.out.println("Общая мощность приборов в квартире  " + " " + flatD.getPower() + " кВт");

        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Провести сортировку   приборов на основе мощности нажмите   : 1 ");
            System.out.println("Найти прибор в квартире,соответствующий заданному диапазону   параметров нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        flatD.sortHomeDevice();;
                    }
                    break;
                    case 2: {
                        System.out.println("Введите начальный диапазон вольт. ");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("Введите конечный диапазон вольт. ");
                        int r2 = Integer.parseInt(sc.next());
                        flatD.findHomeDevice(r1, r2);
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

}

class HomeDevice {
    //определяем поля

    private String name;//название
    private double power;//мощность
    private boolean state;//флаг включен выключен
    private int voltage;//напряжение

    //конструкторы
    HomeDevice() {
    }

    HomeDevice(String name, double power, boolean state, int voltage) {
        this.name = name;
        this.power = power;
        this.state = state;
        this.voltage = voltage;
    }

    HomeDevice(String name, double power) {
        this.name = name;
        this.power = power;

    }

    //определяем геттеры и сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean getState() {
        return state;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public int getVoltage() {
        return voltage;
    }

    @Override
    public String toString() {
        return "Электроприбор:" + " " + name + " " + "Мощностью =" + power + " " + "Состояние = " + " "
                + state + " " + "Используемое напряжение сети =" + voltage;
    }

}
//классы наследники

class Kettle extends HomeDevice {

    private final static String name = "Электрочайник";

    Kettle(double power, boolean state, int voltage) {
        super(name, power, state, voltage);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Iron extends HomeDevice {

    private final static String name = "Электроутюг";

    Iron(double power, boolean state, int voltage) {
        super(name, power, state, voltage);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class HairDryer extends HomeDevice {

    private final static String name = "Электрофен";

    HairDryer(double power, boolean state, int voltage) {
        super(name, power, state, voltage);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class FlatDevice {

    private double power;//мощность

    public double getPower() {
        return power;
    }

    private ArrayList<HomeDevice> homeDevices = new ArrayList<HomeDevice>();

    public FlatDevice addHomeDevice(HomeDevice homeDevice) {
        homeDevices.add(homeDevice);
        power += homeDevice.getPower();
        return this;
    }

    public void sortHomeDevice() {

        Collections.sort(homeDevices, new MyComparator());

        for (int i = 0; i < homeDevices.size(); i++) {
            System.out.println(homeDevices.get(i).toString());
        }
    }

    public void findHomeDevice(int d1, int d2) {
        int flg = 0;
        for (int i = 0; i < homeDevices.size(); i++) {
            if ((homeDevices.get(i).getVoltage() >= d1) & (homeDevices.get(i).getVoltage() <= d2)) {
                System.out.println(homeDevices.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такого прибора");
        }
    }

}

class MyComparator implements Comparator<HomeDevice> {

    @Override
    public int compare(HomeDevice h1, HomeDevice h2) {
        return Double.compare(h1.getPower(), h2.getPower());
    }

}
