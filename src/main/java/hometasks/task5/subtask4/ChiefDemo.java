/*
 * 4. Шеф ­ повар .  Определить   иерархию   овощей .  Сделать  
 *     салат .  Подсчитать   калорийность .  Провести  
 *     сортировку   овощей   для   салата   на   основе   одного   из  
 *     параметров .  Найти   овощи   в   салате ,  соответствующие  
 *     заданному   диапазону   калорийности .   
 */
package hometasks.task5.subtask4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author OsinVladimir
 */
public class ChiefDemo {
     public static void main(String[] args) {
         
        Vegetable c  = new Cabbage(2.25,3.20,4.55,5.25);
        Vegetable cr = new Carrot(3.25,4.80,5.55,8.25);
        Vegetable t  = new Tomato(7.25,1.20,1.55,3.25);
        Vegetable t1 = new Tomato(5.25,2.30,2.44,4.44);
        Vegetable cr1 = new Carrot(1.25,3.10,3.50,1.25);

        Salad salad = new Salad();
        salad.addVegetable(c);
        salad.addVegetable(cr);
        salad.addVegetable(t);
        salad.addVegetable(t1);
        salad.addVegetable(cr1);
        System.out.println("Калорийность салата  " + " " + salad.getСaloricValue() + " "+"кКл");

        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Провести сортировку   овощей   для   салата   на   основе   одного   из параметров нажмите   : 1 ");
            System.out.println("Найти овощи в салате ,  соответствующие  заданному диапазону калорийности нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        salad.sortVegetable();
                    }
                    break;
                    case 2: {
                        System.out.println("Введите начальный диапазон калорийности. ");
                        double r1 = Double.parseDouble(sc.next());
                        System.out.println("Введите конечный диапазон калорийности. ");
                        double r2 = Double.parseDouble(sc.next());
                        salad.findVegetable(r1, r2);
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



class Vegetable {
    //определяем поля

    private String name;//название
    private double protein;//белок
    private double carbohydrates;//углеводы
    private double caloricValue;//калорийность
    private double carotin;//каротин
    

    //конструкторы
    Vegetable() {
    }

    public Vegetable(String name, double protein, double carbohydrates, double caloricValue, double carotin) {
        this.name = name;
        this.protein = protein;
        this.carbohydrates = carbohydrates;
        this.caloricValue = caloricValue;
        this.carotin = carotin;
    }

   

    public Vegetable(String name, double caloricValue) {
        this.name = name;
        this.caloricValue = caloricValue;
    }

    //определяем геттеры и сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getProtein() {
        return protein;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCaloricValue(double caloricValue) {
        this.caloricValue = caloricValue;
    }

    public double getCaloricValue() {
        return caloricValue;
    }
    
    public void setCarotin(double carotin) {
        this.carotin = carotin;
    }

    public double getCarotin() {
        return carotin;
    }
    @Override
    public String toString() {
        return "Овощь:" + " " + name + " " + "Белки =" + protein + " " + "Углеводы = " + " "
                + carbohydrates + " " + "Количество калорий =" + caloricValue +" "+"Каротин ="+" "+carotin;
    }

}
//классы наследники

class Cabbage extends Vegetable {

    private final static String name = "Капуста";

    Cabbage(double protein, double carbohydrates, double caloricValue, double carotin) {
        super(name, protein, carbohydrates, caloricValue,  carotin);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Carrot extends Vegetable {

    private final static String name = "Морковь";

  Carrot(double protein, double carbohydrates, double caloricValue, double carotin) {
        super(name, protein, carbohydrates, caloricValue,  carotin);
    }
    

    @Override
    public String toString() {
        return super.toString();
    }
}

class Tomato extends Vegetable {

    private final static String name = "Томат";

   Tomato(double protein, double carbohydrates, double caloricValue, double carotin) {
        super(name, protein, carbohydrates, caloricValue,  carotin);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Salad{

    private double caloricValue;//калорийность

    public double getСaloricValue() {
        return caloricValue;
    }

    private ArrayList<Vegetable> vegetables = new ArrayList<Vegetable>();

    public Salad addVegetable(Vegetable vegetable) {
        vegetables.add(vegetable);
        caloricValue += vegetable.getCaloricValue();
        return this;
    }

    public void sortVegetable() {

        Collections.sort(vegetables, new MyComparator());

        for (int i = 0; i < vegetables.size(); i++) {
            System.out.println(vegetables.get(i).toString());
        }
    }

    public void findVegetable(double d1, double d2) {
        int flg = 0;
        for (int i = 0; i < vegetables.size(); i++) {
            if ((vegetables.get(i).getCaloricValue() >= d1) & (vegetables.get(i).getCaloricValue() <= d2)) {
                System.out.println(vegetables.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такого овоща");
        }
    }

}

class MyComparator implements Comparator<Vegetable> {

    @Override
    public int compare(Vegetable v1, Vegetable v2) {
        return Double.compare(v1.getProtein(), v2.getProtein());
    }

}

