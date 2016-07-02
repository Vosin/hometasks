/*
 * 14.  Игровая   комната .  Подготовить   игровую   комнату  
 *       для   детей   разных   возрастных   групп .  Игрушек   должно  
 *       быть   фиксированное   количество   в   пределах  
 *       выделенной   суммы   денег .  Должны   встречаться  
 *       игрушки   родственных   групп :  маленькие ,  средние   и  
 *       большие   машины ,  куклы ,  мячи ,  кубики . 
 *       Провести   сортировку   игрушек   в   комнате   по   одному  
 *       из   параметров .   Найти   игрушки   в   комнате , 
 *       соответствующие   заданному   диапазону   параметров . .
 */
package hometasks.task5.subtask_14;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class GameRoomDemo {
   public static void main(String[] args) {
    
        Toy  carBig     =  new Car(45.00,"Большая",6,1000,"Высокое","Пластик");
        Toy  carMedium  =  new Car(35.00,"Средняя",4,500,"Высокое","Пластик");
        Toy  carSmall   =  new Car(25.00,"Маленькая",3,200,"Высокое","Металл");
        Toy  dollBig     =  new Doll(125.00,"Большая",3,1000,"Высокое","Пластик");
        Toy  dollMedium  =  new Doll(325.00,"Средняя",4,500,"Среднее","Пластик");
        Toy  dollSmall   =  new Doll(425.00,"Маленькая",8,200,"Высокое","Пластик");
        Toy  bollBig     =  new Boll(15.00,"Большой",9,500,"Высокое","Резина");
        Toy  bollMedium  =  new Boll(335.00,"Средний",7,200,"Среднее","Резина");
        Toy  bollSmall   =  new Boll(40.00,"Маленький",5,100,"Низкое","Пластик"); 
        Toy  cubeBig     =  new Cube(10.00,"Большой",10,100,"Высокое","Дерево");
        Toy  cubeMedium  =  new Cube(8.00,"Средний",12,50,"Среднее","Дерево");
        Toy  cubeSmall   =  new Cube(5.00,"Маленький",8,80,"Низкое","Дерево"); 
               
        //создаем игровую комнату
       GameRoom gameRoom = new GameRoom();
       Scanner sc = new Scanner(System.in);
       System.out.println("Введите сумму на определенное количество игрушек: ");
            double result = Double.parseDouble(sc.next());
            gameRoom.setCost(result);
            gameRoom.addToy(carBig);
            gameRoom.addToy(carMedium);
            gameRoom.addToy(carSmall);
            gameRoom.addToy(dollBig);
            gameRoom.addToy(dollMedium);
            gameRoom.addToy(dollSmall);
            gameRoom.addToy(bollBig);
            gameRoom.addToy(bollMedium);
            gameRoom.addToy(bollSmall);
            gameRoom.addToy(cubeBig);
            gameRoom.addToy(cubeMedium);
            gameRoom.addToy(cubeSmall); 
       boolean end = false;
       while (!end) {
            System.out.println("Провести сортировку игрушек в комнате по возрастной группе нажмите  : 1 ");
            System.out.println("Найти игрушки в комнате , соответствующие заданному диапазону цен нажмите  : 2 ");
            try {
                int result1 = Integer.parseInt(sc.next());
                switch (result1) {
                    case 1: {
                       gameRoom.sortAgeGroup();
                    }
                    break;
                    case 2: {
                        System.out.println("Введите начальный диапазон цены. ");
                        double r1 = Double.parseDouble(sc.next());
                        System.out.println("Введите конечный диапазон цены. ");
                        double r2 = Double.parseDouble(sc.next());
                        gameRoom.findToys(r1, r2);
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
//суперкласс игрушка
class Toy {
    //определяем поля
    private String name;//название
    private double price;//цена 
    private String size;//размер игрушки
    private int ageGroup;//возрастная группа
    private double weight;//вес игрушки в граммах
    private String quality;//качество
    private String material;//материал игрушки 
    
    //конструкторы
    public Toy() {
    }

    public Toy(String name, double price, String size, int ageGroup, double weight, String quality, String material) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.ageGroup = ageGroup;
        this.weight = weight;
        this.quality = quality;
        this.material = material;
    }
     public Toy(String name, double price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
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
     public void setSize(String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }
    public void setAgeGroup(int ageGroup) {
        this.ageGroup = ageGroup;
    }
    public int getAgeGroup() {
        return ageGroup;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public void setQuality(String quality) {
        this.quality = quality;
    }
    public String getQuality() {
        return quality;
    }
     public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }
    @Override
    public String toString() {
        return "Игрушка" + " " + name + "  "+"Цена =" +" "+ price + " "
        +"грн."+" "+"Размер=" + " " + size +" " + "Для возрастной группы:" + " "
        + ageGroup+" "+"лет"+" "+"Вес= "+" "+weight+" "+"Качество= "+" "+quality+" "
        +"Материал изготовления="+" "+material;
    }
}
//классы наследники
class Car extends Toy {
   private final static String name = "Машина";
     Car(double price, String size, int ageGroup, double weight, String quality, String material){
        super(name, price, size, ageGroup, weight, quality, material);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

class Doll extends  Toy {
    private final static String name = "Кукла";
       Doll(double price, String size, int ageGroup, double weight, String quality, String material){
        super(name, price, size, ageGroup, weight, quality, material);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class Boll extends Toy {
   private final static String name = "Мячик";
        Boll(double price, String size, int ageGroup, double weight, String quality, String material){
        super(name, price, size, ageGroup, weight, quality, material);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class Cube extends Toy {
   private final static String name = "Кубик";
        Cube(double price, String size, int ageGroup, double weight, String quality, String material){
        super(name, price, size, ageGroup, weight, quality, material);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}



//класс игровая комната
class GameRoom{
     
    private double cost;//выделенная сумма денег 
    private double priceToys;//стоимость всех игрушек
    public void setCost(double cost) {
        this.cost = cost;
    }  
    public double getCost() {
        return cost ;
    }
    public double priceToys() {
        return priceToys ;
    } 
    private ArrayList<Toy> toys = new ArrayList<Toy>();
   //заполняем комнату игрушками
    public GameRoom addToy(Toy toy) {
        priceToys += toy.getPrice();
        if(priceToys< this.getCost()){
        toys.add(toy);
        }
        return this;
    }
//сортировка товара на основе возрастной группы
    public void sortAgeGroup() {

        Collections.sort(toys, new MyComparator());

        for (int i = 0; i < toys.size(); i++) {
            System.out.println(toys.get(i).toString());
        }
    }
//найти игрушки по цене
    public void findToys(double price1,double price2) {
        int flg = 0;
        for (int i = 0; i < toys.size(); i++) {
              if ((toys.get(i).getPrice()>= price1) & (toys.get(i).getPrice()<= price2)) {
                System.out.println(toys.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такой игрушки");
        }
    }
}
//класс использует интерфейс компаратор
class MyComparator implements Comparator<Toy> {
    @Override
    public int compare(Toy toys1, Toy toys2) {
        return Integer.compare(toys1.getAgeGroup(),toys1.getAgeGroup());
         
    }
}