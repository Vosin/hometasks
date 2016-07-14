/*
 * Класс меню
 */
package com.hm.hometasks.oop_part_3.applicationDemo;

import com.hm.hometasks.oop_part_3.peellable.Apple;
import com.hm.hometasks.oop_part_3.peellable.Banana;
import com.hm.hometasks.oop_part_3.peellable.Bow;
import com.hm.hometasks.oop_part_3.peellable.Carrot;
import com.hm.hometasks.oop_part_3.peellable.Celery;
import java.util.Scanner;
import com.hm.hometasks.oop_part_3.peellable.Fruit;
import com.hm.hometasks.oop_part_3.peellable.Orange;
import com.hm.hometasks.oop_part_3.peellable.Pear;
import com.hm.hometasks.oop_part_3.peellable.Plant;
import com.hm.hometasks.oop_part_3.peellable.Potatoes;

/**
 *
 * @author Osin Vladimir
 */
public class ConsolMenu {

    public void Initialisation() {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("WELCOME TO APPLICATION!! ");
            System.out.println("Создание овощей и фруктов:");
            System.out.println("Введите характеристики для Яблоко - 1");
            System.out.println("Введите характеристики для Груша - 2 ");
            System.out.println("Введите характеристики для Банан - 3 ");
            System.out.println("Введите характеристики для Апельсин - 4 ");
            System.out.println("Введите характеристики для Картофель - 5");
            System.out.println("Введите характеристики для Морковь - 6 ");
            System.out.println("Введите характеристики для Сельдерей - 7 ");
            System.out.println("Введите характеристики для Лук - 8 ");
            try {
                int result = Integer.parseInt(sc.next());
                createFruitVegetables(result, sc);
            } catch (Exception e) {
                end = true;
            }System.out.println("Желаете продолжить: 1 -Да,0-Нет,2-Заполнить Корзину ");
            int contunue = Integer.parseInt(sc.next());
            if (contunue == 1) {
                end = false;
            } else {
                end = true;
            }
        }
       }

    public static void createFruitVegetables(int result, Scanner sc) {
        switch (result) {
            case 1: {
                 createApple(result, sc);
                }break;
            case 2: {   
                createPear(result, sc);
                }break;
            case 3: {   
                createBanana(result, sc);
                }break; 
            case 4: {   
                createOrange(result, sc);
                }break;   
             case 5: {
                 createPotatoes(result, sc);
                }break;
            case 6: {   
                createCarrot(result, sc);
                }break;
            case 7: {   
                createCelery(result, sc);
                }break; 
            case 8: {   
                createBow(result, sc);
                }break;        
                
        }
    }

    public static String findColor(int color) {
        String result;
        switch (color) {
            case 1: {
                result = "Желтый";
            }
            break;
            case 2: {
                result = "Зеленый";
            }
            break;
            case 3: {
                result = "Красный";
            }
            break;
            default: {
                result = "Нет такого цвета";
            }
        }
        return result;
    }
    public static String findMaturity(int maturity) {
        String result;
        switch (maturity) {
            case 1: {
                result = "Зрелый";
            }
            break;
            case 2: {
                result = "Не зрелый";
            } break;
            default: {
                result = "Нет  такого уровня";
            }
        }
        return result;
    }
    public static String findCondition(int condition) {
        String result;
        switch (condition) {
            case 1: {
                result = "Кондиционный";
            }
            break;
            case 2: {
                result = "Не кондиционный";
            } break;
            default: {
                result = "Нет такой кондиции";
            }
        }
        return result;
    }
    public static Plant createApple(int io,Scanner sc) {
               System.out.println("Введите вес ");
                double weight = Double.parseDouble(sc.next());
                System.out.println("Введите цвет:1-Желтый,2-Зеленый,Красный ");
                int color1 = Integer.parseInt(sc.next());
                String color = findColor(color1);
                System.out.println("Введите уровень зрелости:1-Зрелый,2-Не зрелый ");
                int maturity1 = Integer.parseInt(sc.next());
                String maturity = findMaturity(maturity1);
                System.out.println("Введите уровень кондиции:1-Кондиционный,2-Не кондиционный ");
                int condition1 = Integer.parseInt(sc.next());
                String condition = findCondition(condition1);
                Plant apple= new Apple(weight, color, maturity, condition, false);
                System.out.println(apple.toString());
                return apple;
}
    public static Plant createPear(int io,Scanner sc) {
                System.out.println("Введите вес ");
                double weight = Double.parseDouble(sc.next());
                System.out.println("Введите цвет:1-Желтый,2-Зеленый,Красный ");
                int color1 = Integer.parseInt(sc.next());
                String color = findColor(color1);
                System.out.println("Введите уровень зрелости:1-Зрелый,2-Не зрелый ");
                int maturity1 = Integer.parseInt(sc.next());
                String maturity = findMaturity(maturity1);
                System.out.println("Введите уровень кондиции:1-Кондиционный,2-Не кондиционный ");
                int condition1 = Integer.parseInt(sc.next());
                String condition = findCondition(condition1);
                Plant pear= new Pear(weight, color, maturity, condition, false);
                System.out.println(pear.toString());
                return pear;
}
    public static Plant createBanana(int io,Scanner sc) {
                System.out.println("Введите вес ");
                double weight = Double.parseDouble(sc.next());
                System.out.println("Введите цвет:1-Желтый,2-Зеленый,Красный ");
                int color1 = Integer.parseInt(sc.next());
                String color = findColor(color1);
                System.out.println("Введите уровень зрелости:1-Зрелый,2-Не зрелый ");
                int maturity1 = Integer.parseInt(sc.next());
                String maturity = findMaturity(maturity1);
                System.out.println("Введите уровень кондиции:1-Кондиционный,2-Не кондиционный ");
                int condition1 = Integer.parseInt(sc.next());
                String condition = findCondition(condition1);
                Plant banana= new Banana(weight, color, maturity, condition, false);
                System.out.println(banana.toString());
                return banana;
}
    public static Plant createOrange(int io,Scanner sc) {
                System.out.println("Введите вес ");
                double weight = Double.parseDouble(sc.next());
                System.out.println("Введите цвет:1-Желтый,2-Зеленый,Красный ");
                int color1 = Integer.parseInt(sc.next());
                String color = findColor(color1);
                System.out.println("Введите уровень зрелости:1-Зрелый,2-Не зрелый ");
                int maturity1 = Integer.parseInt(sc.next());
                String maturity = findMaturity(maturity1);
                System.out.println("Введите уровень кондиции:1-Кондиционный,2-Не кондиционный ");
                int condition1 = Integer.parseInt(sc.next());
                String condition = findCondition(condition1);
                Plant orange = new Orange(weight, color, maturity, condition, false);
                System.out.println(orange.toString());
                return orange;
}
    public static Plant createPotatoes(int io,Scanner sc) {
                System.out.println("Введите вес ");
                double weight = Double.parseDouble(sc.next());
                System.out.println("Введите цвет:1-Желтый,2-Зеленый,Красный ");
                int color1 = Integer.parseInt(sc.next());
                String color = findColor(color1);
                System.out.println("Введите уровень зрелости:1-Зрелый,2-Не зрелый ");
                int maturity1 = Integer.parseInt(sc.next());
                String maturity = findMaturity(maturity1);
                System.out.println("Введите уровень кондиции:1-Кондиционный,2-Не кондиционный ");
                int condition1 = Integer.parseInt(sc.next());
                String condition = findCondition(condition1);
                Plant potatoes = new Potatoes(weight, color, maturity, condition, false);
                System.out.println(potatoes.toString());
                return potatoes;
}
   public static Plant createCarrot(int io,Scanner sc) {
                System.out.println("Введите вес ");
                double weight = Double.parseDouble(sc.next());
                System.out.println("Введите цвет:1-Желтый,2-Зеленый,Красный ");
                int color1 = Integer.parseInt(sc.next());
                String color = findColor(color1);
                System.out.println("Введите уровень зрелости:1-Зрелый,2-Не зрелый ");
                int maturity1 = Integer.parseInt(sc.next());
                String maturity = findMaturity(maturity1);
                System.out.println("Введите уровень кондиции:1-Кондиционный,2-Не кондиционный ");
                int condition1 = Integer.parseInt(sc.next());
                String condition = findCondition(condition1);
                Plant carrot = new Carrot(weight, color, maturity, condition, false);
                System.out.println(carrot.toString());
                return carrot;
} 
   public static Plant createCelery(int io,Scanner sc) {
                System.out.println("Введите вес ");
                double weight = Double.parseDouble(sc.next());
                System.out.println("Введите цвет:1-Желтый,2-Зеленый,Красный ");
                int color1 = Integer.parseInt(sc.next());
                String color = findColor(color1);
                System.out.println("Введите уровень зрелости:1-Зрелый,2-Не зрелый ");
                int maturity1 = Integer.parseInt(sc.next());
                String maturity = findMaturity(maturity1);
                System.out.println("Введите уровень кондиции:1-Кондиционный,2-Не кондиционный ");
                int condition1 = Integer.parseInt(sc.next());
                String condition = findCondition(condition1);
                Plant celery = new Celery(weight, color, maturity, condition, false);
                System.out.println(celery.toString());
                return celery;
} 
   public static Plant createBow(int io,Scanner sc) {
                System.out.println("Введите вес ");
                double weight = Double.parseDouble(sc.next());
                System.out.println("Введите цвет:1-Желтый,2-Зеленый,Красный ");
                int color1 = Integer.parseInt(sc.next());
                String color = findColor(color1);
                System.out.println("Введите уровень зрелости:1-Зрелый,2-Не зрелый ");
                int maturity1 = Integer.parseInt(sc.next());
                String maturity = findMaturity(maturity1);
                System.out.println("Введите уровень кондиции:1-Кондиционный,2-Не кондиционный ");
                int condition1 = Integer.parseInt(sc.next());
                String condition = findCondition(condition1);
                Plant bow = new Bow(weight, color, maturity, condition, false);
                System.out.println(bow.toString());
                return bow;
   
}
}
