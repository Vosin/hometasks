/*
 * Класс меню
 */
package com.hm.hometasks.oop_part_3.applicationDemo;

import com.hm.hometasks.oop_part_3.bin.Bin;
import com.hm.hometasks.oop_part_3.foodProcessor.FoodProcessor;
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
import com.hm.hometasks.oop_part_3.peellable.Vegetable;

/**
 *
 * @author Osin Vladimir
 */
public class ConsolMenu {

    public void Initialisation() {
        Bin bin = new Bin();
        FoodProcessor foodProcessor = new FoodProcessor();
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        boolean fin = false;
        while (!end) {
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
                createFruitVegetables(result, sc, bin);
            } catch (Exception e) {
                end = true;
            }
            System.out.println("Желаете продолжить создавать объекты?: 1 -Да,0-Нет ");
            int contunue = Integer.parseInt(sc.next());
            if (contunue == 1) {
                end = false;
            } else {
                System.out.println("Общее количество фруктов и овощей положенных в корзину составляет " + bin.size() + " штук");
                while (!fin) {
                    System.out.println("Желаете извлечь овощи или фрукты для очистки из корзины?: 1 -Да,0-Нет ");
                    int contunue1 = Integer.parseInt(sc.next());
                    if (contunue1 == 1) {
                        int count = bin.size() - 1;
                        System.out.println("Введите число от 0 до " + count);
                        int contunue2 = Integer.parseInt(sc.next());
                        Object obj = bin.extractFruitVegetables(contunue2);
                        if (obj instanceof Fruit) {
                            Fruit fruit = (Fruit) obj;
                            System.out.println("Извлечен" + " " + fruit.toString());
                        } else if (obj instanceof Vegetable) {
                            Vegetable vegetable = (Vegetable) obj;
                            System.out.println("Извлечен" + " " + vegetable.toString());
                        }
                        System.out.println("Общий Вес корзины до чистки = " + bin.getWeightBin());
                        System.out.println("Очистить,пошинковать и нарезать? : 1 -Да,0-Нет");
                        int contunue3 = Integer.parseInt(sc.next());
                        if (contunue3 == 1) {
                            foodProcessor.peellItem(obj);
                            foodProcessor.cut(obj);
                            foodProcessor.slicerItem(obj);
                            fin = false;
                        } else {
                            fin = true;
                        }
                    } else {
                        fin = true;
                    }
                }
            }
        }
    }

    public static void createFruitVegetables(int result, Scanner sc, Bin bin) {
        switch (result) {
            case 1: {
                Plant apple = createApple(result, sc);
                System.out.println("Добавить в корзину? 1 -Да,0-Нет");
                int r1 = Integer.parseInt(sc.next());
                if (r1 == 1) {
                    addBin(apple, bin);
                    System.out.println("Общий Вес корзины = " + bin.getWeightBin());
                }
            }
            break;
            case 2: {
                Plant pear = createPear(result, sc);
                System.out.println("Добавить в корзину? 1 -Да,0-Нет");
                int r1 = Integer.parseInt(sc.next());
                if (r1 == 1) {
                    addBin(pear, bin);
                    System.out.println("Общий Вес корзины = " + bin.getWeightBin());
                }
            }
            break;
            case 3: {
                Plant banana = createBanana(result, sc);
                System.out.println("Добавить в корзину? 1 -Да,0-Нет");
                int r1 = Integer.parseInt(sc.next());
                if (r1 == 1) {
                    addBin(banana, bin);
                    System.out.println("Общий Вес корзины = " + bin.getWeightBin());
                }
            }
            break;
            case 4: {
                Plant orange = createOrange(result, sc);
                System.out.println("Добавить в корзину? 1 -Да,0-Нет");
                int r1 = Integer.parseInt(sc.next());
                if (r1 == 1) {
                    addBin(orange, bin);
                    System.out.println("Общий Вес корзины = " + bin.getWeightBin());
                }
            }
            break;
            case 5: {
                Plant potatoes = createPotatoes(result, sc);
                System.out.println("Добавить в корзину? 1 -Да,0-Нет");
                int r1 = Integer.parseInt(sc.next());
                if (r1 == 1) {
                    addBin(potatoes, bin);
                    System.out.println("Общий Вес корзины = " + bin.getWeightBin());
                }
            }
            break;
            case 6: {
                Plant carrot = createCarrot(result, sc);
                System.out.println("Добавить в корзину? 1 -Да,0-Нет");
                int r1 = Integer.parseInt(sc.next());
                if (r1 == 1) {
                    addBin(carrot, bin);
                    System.out.println("Общий Вес корзины = " + bin.getWeightBin());
                }
            }
            break;
            case 7: {
                Plant celery = createCelery(result, sc);
                System.out.println("Добавить в корзину? 1 -Да,0-Нет");
                int r1 = Integer.parseInt(sc.next());
                if (r1 == 1) {
                    addBin(celery, bin);
                    System.out.println("Общий Вес корзины = " + bin.getWeightBin());
                }
            }
            break;
            case 8: {
                Plant bow = createBow(result, sc);
                System.out.println("Добавить в корзину? 1 -Да,0-Нет");
                int r1 = Integer.parseInt(sc.next());
                if (r1 == 1) {
                    addBin(bow, bin);
                    System.out.println("Общий Вес корзины = " + bin.getWeightBin());
                }
            }
            break;

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
            }
            break;
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
            }
            break;
            default: {
                result = "Нет такой кондиции";
            }
        }
        return result;
    }

    public static Plant createApple(int io, Scanner sc) {
        System.out.println("Введите вес ");
        double weight = Double.parseDouble(sc.next());
        String[] str = consolIo(sc);
        Plant apple = new Apple(weight, str[0], str[1], str[2], false);
        System.out.println(apple.toString());
        return apple;
    }

    public static Plant createPear(int io, Scanner sc) {
        System.out.println("Введите вес ");
        double weight = Double.parseDouble(sc.next());
        String[] str = consolIo(sc);
        Plant pear = new Pear(weight, str[0], str[1], str[2], false);
        System.out.println(pear.toString());

        return pear;
    }

    public static Plant createBanana(int io, Scanner sc) {
        System.out.println("Введите вес ");
        double weight = Double.parseDouble(sc.next());
        String[] str = consolIo(sc);
        Plant banana = new Banana(weight, str[0], str[1], str[2], false);
        System.out.println(banana.toString());
        return banana;
    }

    public static Plant createOrange(int io, Scanner sc) {
        System.out.println("Введите вес ");
        double weight = Double.parseDouble(sc.next());
        String[] str = consolIo(sc);
        Plant orange = new Orange(weight, str[0], str[1], str[2], false);
        System.out.println(orange.toString());
        return orange;
    }

    public static Plant createPotatoes(int io, Scanner sc) {
        System.out.println("Введите вес ");
        double weight = Double.parseDouble(sc.next());
        String[] str = consolIo(sc);
        Plant potatoes = new Potatoes(weight, str[0], str[1], str[2], false);
        System.out.println(potatoes.toString());
        return potatoes;
    }

    public static Plant createCarrot(int io, Scanner sc) {
        System.out.println("Введите вес ");
        double weight = Double.parseDouble(sc.next());
        String[] str = consolIo(sc);
        Plant carrot = new Carrot(weight, str[0], str[1], str[2], false);
        System.out.println(carrot.toString());
        return carrot;
    }

    public static Plant createCelery(int io, Scanner sc) {
        System.out.println("Введите вес ");
        double weight = Double.parseDouble(sc.next());
        String[] str = consolIo(sc);
        Plant celery = new Celery(weight, str[0], str[1], str[2], false);
        System.out.println(celery.toString());
        return celery;
    }

    public static Plant createBow(int io, Scanner sc) {
        System.out.println("Введите вес ");
        double weight = Double.parseDouble(sc.next());
        String[] str = consolIo(sc);
        Plant bow = new Bow(weight, str[0], str[1], str[2], false);
        System.out.println(bow.toString());
        return bow;

    }

    public static void addBin(Plant plant, Bin bin) {
        bin.addfruitVegetables(plant);
    }

    public static String[] consolIo(Scanner sc) {
        String[] arr = new String[3];
        System.out.println("Введите цвет:1-Желтый,2-Зеленый,3-Красный ");
        int color1 = Integer.parseInt(sc.next());
        arr[0] = findColor(color1);
        System.out.println("Введите уровень зрелости:1-Зрелый,2-Не зрелый ");
        int maturity1 = Integer.parseInt(sc.next());
        arr[1] = findMaturity(maturity1);
        System.out.println("Введите уровень кондиции:1-Кондиционный,2-Не кондиционный ");
        int condition1 = Integer.parseInt(sc.next());
        arr[2] = findCondition(condition1);
        return arr;
    }

}
