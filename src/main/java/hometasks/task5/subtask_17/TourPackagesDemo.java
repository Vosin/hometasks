/*
 * 17.  Туристические   путевки .  Сформировать   набор  
 *  предложений   клиенту   по   выбору   туристической  
 *  путевки   различного   типа  ( отдых ,  экскурсии , 
 *  лечение ,  шопинг ,  круиз   и   т .  д .)  для   оптимального  
 *  выбора .  Учитывать   возможность   выбора   транспорта , 
 *  питания   и   числа   дней .  Реализовать   выбор   и  
 *  сортировку   путевок . 

 */
package hometasks.task5.subtask_17;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class TourPackagesDemo {
       public static void main(String[] args) {
           
       TourPackage relax = new Relaxation(2500.00,"Все включено",14,"Авиа","Египет");
       TourPackage relax1 = new Relaxation(3500.00,"Все включено",12,"Авиа","Турция");
       TourPackage excursion = new Excursion(1000.00,"Без питания",1,"Автобус","Украина");
       TourPackage excursion1 = new Excursion(800.00,"Без питания",3,"Автобус","Украина");
       TourPackage treatment = new Treatment(10000.00,"Все включено",10,"Автобус","Украина");
       TourPackage treatment1 = new Treatment(15000.00,"Все включено",7,"Автобус","Украина");
       TourPackage shopping = new Shopping(8000.00,"Без питания",1,"Поезд","Франция");
       TourPackage shopping1 = new Shopping(1000.00,"Завтрак",2,"Поезд","Германия");
       TourPackage сruize = new Cruize(100000.00,"Все включено",14,"Автобус","Европа");
       TourPackage сruize1 = new Cruize(100045.30,"Завтрак",12,"Поезд","Европа");
       //создаем предложение
       Proposition proposition = new Proposition();
       proposition.addTourPackage(relax);
       proposition.addTourPackage(relax1);
       proposition.addTourPackage(excursion);
       proposition.addTourPackage(excursion1);
       proposition.addTourPackage(treatment);
       proposition.addTourPackage(treatment1 );
       proposition.addTourPackage(shopping);
       proposition.addTourPackage(shopping1);
       proposition.addTourPackage(сruize);
       proposition.addTourPackage(сruize1);
       System.out.println("Сортировка путевок по цене "); 
       proposition.sortTourPackage();
       Scanner sc = new Scanner(System.in);
       boolean end = false;
       while (!end) {
            System.out.println("Для формирования предложения выберите путевку выберите пункт ");
            System.out.println("Отдых на море : 1 ");
            System.out.println("Экскурсии : 2 ");
            System.out.println("Лечение : 3 ");
            System.out.println("Шоппинг : 4 ");
            System.out.println("Круиз : 5 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        System.out.println("Для отбора по типу транспорта Введите тип транспорта - 1-Авиа,2-Автобус,3-Поезд");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("\"Для отбора по типу дней Введите количество дней");
                        int r2 = Integer.parseInt(sc.next());
                        System.out.println("\"Для отбора по типу питания введите тип питания:1-Все включено,2-Завтрак,3-Без питания");
                        int r3 = Integer.parseInt(sc.next());
                        proposition.findTourPackageTransfer(r1, r2, r3);
                    }
                    break;
                    case 2: {
                        System.out.println("Для отбора по типу транспорта Введите тип транспорта - 1-Авиа,2-Автобус,3-Поезд");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("\"Для отбора по типу дней Введите количество дней");
                        int r2 = Integer.parseInt(sc.next());
                        System.out.println("\"Для отбора по типу питания введите тип питания:1-Все включено,2-Завтрак,3-Без питания");
                        int r3 = Integer.parseInt(sc.next());
                        proposition.findTourPackageTransfer(r1, r2, r3);
                    }
                    break;
                    case 3: {
                       System.out.println("Для отбора по типу транспорта Введите тип транспорта - 1-Авиа,2-Автобус,3-Поезд");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("\"Для отбора по типу дней Введите количество дней");
                        int r2 = Integer.parseInt(sc.next());
                        System.out.println("\"Для отбора по типу питания введите тип питания:1-Все включено,2-Завтрак,3-Без питания");
                        int r3 = Integer.parseInt(sc.next());
                        proposition.findTourPackageTransfer(r1, r2, r3);
                    }
                    break;
                    case 4: {
                       System.out.println("Для отбора по типу транспорта Введите тип транспорта - 1-Авиа,2-Автобус,3-Поезд");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("\"Для отбора по типу дней Введите количество дней");
                        int r2 = Integer.parseInt(sc.next());
                        System.out.println("\"Для отбора по типу питания введите тип питания:1-Все включено,2-Завтрак,3-Без питания");
                        int r3 = Integer.parseInt(sc.next());
                        proposition.findTourPackageTransfer(r1, r2, r3);
                    }
                    break;
                    case 5: {
                        System.out.println("Для отбора по типу транспорта Введите тип транспорта - 1-Авиа,2-Автобус,3-Поезд");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("\"Для отбора по типу дней Введите количество дней");
                        int r2 = Integer.parseInt(sc.next());
                        System.out.println("\"Для отбора по типу питания введите тип питания:1-Все включено,2-Завтрак,3-Без питания");
                        int r3 = Integer.parseInt(sc.next());
                        proposition.findTourPackageTransfer(r1, r2, r3);
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
//суперкласс путевка
class TourPackage {
    //определяем поля
    private String name;//название
    private double ammount;//сумма путевки
    private String  typeFood ;//тип питания
    private int numberDays ;//количество дней 
    private String transfer ;//доставка
    private String  country ;//страна
    
    
    //конструкторы
    public TourPackage() {
    }

    public TourPackage(String name, double ammount, String typeFood, int numberDays, String transfer, String country) {
        this.name = name;
        this.ammount = ammount;
        this.typeFood = typeFood;
        this.numberDays = numberDays;
        this.transfer = transfer;
        this.country = country;
    }
    public TourPackage(String name, double ammount, String country) {
        this.name = name;
        this.ammount = ammount;
        this.country = country;
    }
    
    //определяем геттеры и сеттеры
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }
      public double getAmmount() {
        return ammount;
    }
     public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }
    public String getTypeFood() {
        return typeFood;
    }
     public void setNumberDays(int numberDays) {
        this.numberDays = numberDays;
    }
    public double getNumberDays() {
        return numberDays;
    }
     public void setTransfer(String transfer) {
        this.transfer = transfer;
    }
    public String getTransfer() {
        return transfer;
    }
    public void setcountry(String country) {
        this.country = country;
    }
    public String getcountry() {
        return country;
    }
    @Override
    public String toString() {
        return "Путевка" + " " + name + "  "+"Сумма =" +" "+ ammount + " "
        +"грн."+" "+"Тип питания=" + " " + typeFood+" "+"Количество дней = " +" "
        +numberDays+" "+"Доставка=" + " " +transfer+" "+"Страна=" + " " + country;
    }
}
//классы наследники
class Relaxation extends TourPackage {
   private final static String name = "Отдых на море";
     Relaxation(double ammount, String typeFood, int numberDays, String transfer, String country){
        super(name,ammount,typeFood,numberDays,transfer,country);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

class Excursion extends TourPackage {
   private final static String name = "Экскурсии";
     Excursion(double ammount, String typeFood, int numberDays, String transfer, String country){
        super(name,ammount,typeFood,numberDays,transfer,country);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class Treatment extends TourPackage {
   private final static String name = "Лечение";
     Treatment(double ammount, String typeFood, int numberDays, String transfer, String country){
        super(name,ammount,typeFood,numberDays,transfer,country);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class Shopping extends TourPackage {
   private final static String name = "Шоппинг";
     Shopping(double ammount, String typeFood, int numberDays, String transfer, String country){
        super(name,ammount,typeFood,numberDays,transfer,country);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class Cruize extends TourPackage {
   private final static String name = "Круиз";
     Cruize(double ammount, String typeFood, int numberDays, String transfer, String country){
        super(name,ammount,typeFood,numberDays,transfer,country);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
//класс предложение
class Proposition{
        
    private ArrayList<TourPackage> tourPackages = new ArrayList<TourPackage>();
   //определяем предложение
    
     public Proposition addTourPackage(TourPackage tourPackage) {
        tourPackages.add(tourPackage);
        return this;
    }
         
//сортировка путевки по сумме
    public void sortTourPackage() {

        Collections.sort(tourPackages, new MyComparator());

        for (int i = 0; i < tourPackages.size(); i++) {
            System.out.println(tourPackages.get(i).toString());
        }
    }
//найти путевку по транспорту
    public void findTourPackageTransfer(int transfer,int numberDays,int typeFood) {
        String result;
        String res;
        switch (transfer) {
            case 1: {
                result = "Авиа";
            }
            break;
            case 2: {
                result = "Автобус";
            }
            break;
            case 3: {
                result = "Поезд";
            }
            break;
            default: {
                result = "";
            }
        }
        switch (typeFood) {
            case 1: {
                res = "Все включено";
            }
            break;
            case 2: {
                res = "Завтрак";
            }
            break;
            case 3: {
                res = "Без питания";
            }
            break;
            default: {
                res = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < tourPackages.size(); i++) {
              if ((tourPackages.get(i).getTransfer().equals(result)) & (tourPackages.get(i).getNumberDays()== numberDays) & (tourPackages.get(i).getTypeFood().equals(res))){
                   System.out.println(tourPackages.get(i).toString());
                   flg = 1; 
                  } 
                }
        if (flg == 0) {
            System.out.println("Нет такой путевки");
        }
    }
   

   //найти путевку по названию
  public void findTourPackageName(int name) {
        String result;
        switch (name) {
            case 1: {
                result = "Отдых на море";
            }
            break;
            case 2: {
                result = "Экскурсии";
            }
            break;
            case 3: {
                result = "Лечение";
            }
            case 4: {
                result = "Шоппинг";
            }
            break;
            case 5: {
                result = "Круиз";
            }
            
            break;
            default: {
                result = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < tourPackages.size(); i++) {
              if (tourPackages.get(i).getName().equals(result)) {
                System.out.println(tourPackages.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такой путевки");
        }
    } 
    
//класс использует интерфейс компаратор
class MyComparator implements Comparator<TourPackage> {
    @Override
    public int compare(TourPackage tourPackage1, TourPackage tourPackage2) {
        return Double.compare(tourPackage1.getAmmount(),tourPackage2.getAmmount());
         
    }
}
}