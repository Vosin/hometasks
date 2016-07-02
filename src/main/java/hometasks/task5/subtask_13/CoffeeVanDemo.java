/*
 * 13.  Фургон   кофе .  Загрузить   фургон   определенного  
 *  объема   грузом   на   определенную   сумму   из   различных  
 *  сортов   кофе ,  находящихся ,  к   тому   же ,  в   разных  
 *  физических   состояниях  ( зерно ,  молотый , 
 *  растворимый   в   банках   и   пакетиках ).  Учитывать   объем  
 *  кофе   вместе   с   упаковкой .  Провести   сортировку  
 *  товаров   на   основе   соотношения   цены   и   веса .  Найти   в  
 *  фургоне   товар ,  соответствующий   заданному  
 *  диапазону   параметров   качества . 
 */
package hometasks.task5.subtask_13;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class CoffeeVanDemo {
      public static void main(String[] args) {
    
        Coffee  pauling =  new Pauling("Арабика","молотый",100,120.25,"Высший",2);
        Coffee  blaser  =  new Blaser("Робуста","в зернах",200,320.25,"Высший",3);
        Coffee  mokko   =  new Mokko("Арабика","растворимый",100,120.25,"Высший",2);
        Coffee  blaser1  =  new Blaser("Робуста","в пакетах",300,55.75,"Первый",4);
        Coffee  mokko1   =  new Mokko("Арабика","молотый",500,88.00,"Второй",1);
         
        //создаем фургон
        CoffeeVan сoffeeVan = new CoffeeVan();
        сoffeeVan.addCoffee(pauling);
        сoffeeVan.addCoffee(blaser);
        сoffeeVan.addCoffee(mokko);
        сoffeeVan.addCoffee(blaser1);
        сoffeeVan.addCoffee(blaser1);
      System.out.println("Общий Вес фургона равен = "+сoffeeVan.getWeight());
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Провести сортировку товаров   на   основе   соотношения   цены   и   веса  нажмите   : 1 ");
            System.out.println("Найти в фургоне товар , соответствующий   заданному диапазону   параметров   качества сорта нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        сoffeeVan.sortCoffee();
                    }
                    break;
                    case 2: {
                        System.out.println("Введите сорт качества 1-Высший,2-Первый,3-Второй. ");
                        int r1 = Integer.parseInt(sc.next());
                        сoffeeVan.findCoffee(r1);
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
//суперкласс кофе
class Coffee {
    //определяем поля
    private String name;//название
    private String sort;//сорт
    private String condition;//состояние
    private int weight;//вес в граммах
    private double price;//цена за упаковку
    private String quality;//качество
    private int weightUp;//вес упаковки
    private double ratio;//соотношение цены к весу;
    
    //конструкторы
    public Coffee() {
    }

    public Coffee(String name, String sort, String condition, int weight, double price, String quality,int weightUp){
        this.name = name;
        this.sort = sort;
        this.condition = condition;
        this.weight = weight;
        this.price = price;
        this.quality = quality;
        this.weightUp = weightUp;
      }
    public Coffee(String name, String sort, String condition) {
        this.name = name;
        this.sort = sort;
        this.condition = condition;
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
     public void setSort(String sort) {
        this.sort = sort;
    }
    public String getSort() {
        return sort;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
    public String getCondition() {
        return condition;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public void setQuality(String quality) {
        this.quality = quality;
    }
    public String getQuality() {
        return quality;
    }
     public void setWeightUp(int weightUp) {
        this.weightUp = weightUp;
    }
    public int getWeightUp() {
        return weightUp;
    }
    public void setRatio(double price,int weight) {
        this.ratio = price/weight;
    }
    public double getRatio() {
        return ratio;
    }
    @Override
    public String toString() {
        return "Кофе" + " " + name + "  "+"Сорт =" +" "+ sort + " "
                + "Состояние=" + " " + condition +" " + "Вес в граммах c упаковкой:" + " "
                + weight+weightUp+" "+"Цена за упаковку= "+" "+price+" "+"Качество сорта= "+" "+quality;
    }
}
//классы наследники
class Pauling extends Coffee {
   private final static String name = "Паулинг";
     Pauling(String sort, String condition, int weight, double price, String quality,int weightUp){
        super(name, sort, condition, weight, price, quality,weightUp);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

class Blaser extends  Coffee {
    private final static String name = "Блейзер";
     Blaser(String sort, String condition, int weight, double price, String quality,int weightUp) {
        super(name, sort, condition, weight, price, quality,weightUp);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class Mokko extends Coffee {
   private final static String name = "Мокко";
      Mokko(String sort, String condition, int weight, double price, String quality,int weightUp) {
        super(name, sort, condition, weight, price, quality,weightUp);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
//класс фургон кофе
class CoffeeVan{
      
    private final static int WEIGHT_FULL = 12000;//вес фургона определен полностью с грузом кг
    private double weight; //вес фургона  
    private double price;//стоимость фургона с кофе
      
    public double getPrice() {
        return price ;
    }
    public double getWeight() {
        return weight ;
    }
   
    private ArrayList<Coffee> coffees = new ArrayList<Coffee>();
   //заполняем фургон кофе
    public CoffeeVan addCoffee(Coffee coffee) {
        weight +=coffee.getWeight()+coffee.getWeightUp();
        if(weight< WEIGHT_FULL){
        coffees.add(coffee);
        price += coffee.getPrice();
        }else{
            System.out.println("Превышен обьем фургона!!");
        }
        return this;
    }
//сортировка товара на основе цены и веса
    public void sortCoffee() {

        Collections.sort(coffees, new MyComparator());

        for (int i = 0; i < coffees.size(); i++) {
            System.out.println(coffees.get(i).toString());
        }
    }
//найти кофе по качеству
    public void findCoffee(int quality) {
        String result;
        switch (quality) {
            case 1: {
                result = "Высший";
            }
            break;
            case 2: {
                result = "Первый";
            }
            break;
            case 3: {
                result = "Второй";
            }
            break;
            default: {
                result = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < coffees.size(); i++) {
            if (coffees.get(i).getQuality().equals(result)) {
                   System.out.println(coffees.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такого кофе");
        }
    }
}
//класс использует интерфейс компаратор
class MyComparator implements Comparator<Coffee> {
    @Override
    public int compare(Coffee coffee1, Coffee coffee2) {
        return Double.compare(coffee1.getRatio(),coffee2.getRatio());
         
    }
}