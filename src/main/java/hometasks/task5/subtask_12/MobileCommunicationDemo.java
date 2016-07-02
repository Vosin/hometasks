/*
 * 12.Мобильная   связь .  Определить   иерархию   тарифов  
 *    мобильной   компании .  Создать   список   тарифов  
 *   компании .  Подсчитать   общую   численность   клиентов . 
 *   Провести   сортировку   тарифов   на   основе   размера  
 *   абонентской   платы .  Найти   тариф   в   компании , 
 *   соответствующий   заданному   диапазону   параметров . 
 */
package hometasks.task5.subtask_12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class MobileCommunicationDemo {
      public static void main(String[] args) {
    
        Tarif  basis = new Basis(10.0,1000,0.15,0.25);
        Tarif  vip   =  new Vip(25.0,100,0.25,0.35);
        Tarif  noLimit =  new NoLimit(30.0,15000,0.10,0.45);
        Tarif  basis1 =  new Basis(10.0,1000,0.15,0.25);
        Tarif  vip1  =  new Vip(45.0,10,0.45,0.35);
   
        
        //создаем список
       
        ListTarifs listTarif= new ListTarifs();
        listTarif.addTarif(basis);
        listTarif.addTarif(vip);
        listTarif.addTarif(noLimit);
        listTarif.addTarif(basis1);
        listTarif.addTarif(vip1);
               
       
        System.out.println("Численность клиентов  " + " " +listTarif.amountClient()+" "+"человек");

        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Провести   сортировку   тарифов   на   основе   размера абонентской   платы  нажмите   : 1 ");
            System.out.println("Найти тариф в компании , соответствующий заданному диапазону стоимости минуты разговора нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        listTarif.sortTarif();
                    }
                    break;
                    case 2: {
                        System.out.println("Введите начальный диапазон суммы. ");
                        double r1 = Double.parseDouble(sc.next());
                        System.out.println("Введите конечный диапазон суммы. ");
                        double r2 = Double.parseDouble(sc.next());
                        listTarif.findTarif(r1, r2);
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
//суперкласс тариф
class Tarif {
    //определяем поля
    private String name;//название
    private double price;//абон плата
    private int amountClient;//количество клиентов
    private double payCommunication;//плата за соединение
    private double priceMinute;//стоимость минуты разговора
    //конструкторы
    public Tarif() {
    }

    public Tarif(String name, double price, int amountClient, double payCommunication, double priceMinute) {
        this.name = name;
        this.price = price;
        this.amountClient = amountClient;
        this.payCommunication = payCommunication;
        this.priceMinute = priceMinute;
    }
    public Tarif(String name, double price) {
        this.name = name;
        this.price = price;
    }

    
   
    //определяем геттеры и сеттеры
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
      public double getPrice() {
        return price;
    }
     public void setAmountClient(int amountClient) {
        this.amountClient = amountClient;
    }
    public int getAmountClient() {
        return amountClient;
    }
    public void setPayCommunication(double payCommunication) {
        this.payCommunication = payCommunication;
    }
    public double getPayCommunication() {
        return payCommunication;
    }
    
    public void setPriceMinute(double priceMinute) {
        this.priceMinute = priceMinute;
    }
    public double getPriceMinute() {
        return priceMinute;
    }
   
    @Override
    public String toString() {
        return "Тариф" + " " + name + "  "+"Абон плата =" +" "+ price + " "
                + "Количество клиентов=" + " " + amountClient +" " + "Плата за соединение:" + " "
                + payCommunication+" "+"Стоимость минуты разговора= "+" "+priceMinute;
    }
}
//классы наследники
class Basis extends Tarif {
   private final static String name = "Базовый";
     Basis( double price, int amountClient, double payCommunication, double priceMinute) {
        super(name,  price,  amountClient, payCommunication,  priceMinute);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

class NoLimit extends  Tarif {
    private final static String name = "Безлимит";
    NoLimit( double price, int amountClient, double payCommunication, double priceMinute) {
        super(name,  price,  amountClient, payCommunication,  priceMinute);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class Vip extends Tarif {
   private final static String name = "Вип";
      Vip( double price, int amountClient, double payCommunication, double priceMinute) {
        super(name,  price,  amountClient, payCommunication,  priceMinute);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
//класс список тарифов
class ListTarifs{
 
    private int amountClient;//количество клиентов
   
    public int amountClient() {
        return amountClient ;
    }
   
    private ArrayList<Tarif> tarifs = new ArrayList<Tarif>();
   //создаем список
    public ListTarifs addTarif(Tarif tarif) {
        tarifs.add(tarif);
        amountClient   += tarif.getAmountClient();
        return this;
    }
//сортировка тарифов на основе абон платы
    public void sortTarif() {

        Collections.sort(tarifs, new MyComparator());

        for (int i = 0; i < tarifs.size(); i++) {
            System.out.println(tarifs.get(i).toString());
        }
    }
//найти тариф по стоимости минуты
    public void findTarif(double d1, double d2) {
        int flg = 0;
        for (int i = 0; i < tarifs.size(); i++) {
            if ((tarifs.get(i).getPriceMinute()>= d1) & (tarifs.get(i).getPriceMinute() <= d2)) {
                System.out.println(tarifs.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет таких обязательств");
        }
    }

}
//класс использует интерфейс компаратор
class MyComparator implements Comparator<Tarif> {
    @Override
    public int compare(Tarif tarif1, Tarif tarif2) {
        return Double.compare(tarif1.getPrice(),tarif2.getPrice());
    }
}
