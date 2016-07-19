/*
 * Класс кухонный комбайн
 */
package com.hm.hometasks.oop_part_3.foodProcessor;

import com.hm.hometasks.oop_part_3.peellable.Fruit;
import com.hm.hometasks.oop_part_3.peellable.Vegetable;
import java.util.ArrayList;

/**
 *
 * @author Osin Vladimir
 */
public class FoodProcessor implements Peeller, Cutter, Slicer {

    public FoodProcessor() {
    }

    @Override
    public void peellItem(Object obj) {
        if (obj instanceof Fruit) {
            Fruit fruit = (Fruit) obj;
            fruit.setCleaning(true);
            fruit.setWeight(fruit.getWeight() - ((fruit.getWeight() * 2) / 100));
            System.out.println("Вес после очистки" + " " + fruit.getWeight());
            System.out.println("Вес потерь после  очистки" + " " + (fruit.getWeight() * 2) / 100);
        } else if (obj instanceof Vegetable) {
            Vegetable vegetable = (Vegetable) obj;
            vegetable.setCleaning(true);
            vegetable.setWeight(vegetable.getWeight() - ((vegetable.getWeight() * 5) / 100));
            System.out.println("Вес после очистки" + " " + vegetable.getWeight());
            System.out.println("Вес потерь после  очистки" + " " + (vegetable.getWeight() * 5) / 100);
        }

    }

    @Override
    public void peellItems(ArrayList fruitVegetables) {
        for (int i = 0; i < fruitVegetables.size(); i++) {
            Object obj = fruitVegetables.get(i);
            if (obj instanceof Fruit) {
                Fruit fruit = (Fruit) obj;
                fruit.setCleaning(true);
                fruit.setWeight(fruit.getWeight() - ((fruit.getWeight() * 2) / 100));
                System.out.println("Вес после очистки" + " " + fruit.getWeight());
                System.out.println("Вес потерь после  очистки" + " " + (fruit.getWeight() * 2) / 100);
            } else if (obj instanceof Vegetable) {
                Vegetable vegetable = (Vegetable) obj;
                vegetable.setCleaning(true);
                vegetable.setWeight(vegetable.getWeight() - ((vegetable.getWeight() * 5) / 100));
                System.out.println("Вес после очистки" + " " + vegetable.getWeight());
                System.out.println("Вес потерь после  очистки" + " " + (vegetable.getWeight() * 5) / 100);
            }

        }

    }

    @Override
    public void cut(Object obj) {
        if (obj instanceof Fruit) {
            Fruit fruit = (Fruit) obj;
            if (fruit.getCleaning() == true) {
                fruit.setWeight(fruit.getWeight() - ((fruit.getWeight() * 2) / 100));
                System.out.println("Вес после шинковки" + " " + fruit.getWeight());
                System.out.println("Вес потерь после  шинковки" + " " + (fruit.getWeight() * 2) / 100);
            } else {
                throw new IllegalArgumentException(fruit.toString() + " " + "не очищен!!!");
            }
        } else if (obj instanceof Vegetable) {
            Vegetable vegetable = (Vegetable) obj;
            if (vegetable.getCleaning() == true) {
                vegetable.setWeight(vegetable.getWeight() - ((vegetable.getWeight() * 2) / 100));
                System.out.println("Вес после шинковки" + " " + vegetable.getWeight());
                System.out.println("Вес потерь после  шинковки" + " " + (vegetable.getWeight() * 2) / 100);
            } else {
                throw new IllegalArgumentException(vegetable.toString() + " " + "не очищен!!!");
            }

        }

    }

    @Override
    public void cutAll(ArrayList fruitVegetables) {
        for (int i = 0; i < fruitVegetables.size(); i++) {
            Object obj = fruitVegetables.get(i);
            if (obj instanceof Fruit) {
                Fruit fruit = (Fruit) obj;
                if (fruit.getCleaning() == true) {
                    fruit.setWeight(fruit.getWeight() - ((fruit.getWeight() * 2) / 100));
                    System.out.println("Вес после шинковки" + " " + fruit.getWeight());
                    System.out.println("Вес потерь после  шинковки" + " " + (fruit.getWeight() * 2) / 100);
                } else {
                    throw new IllegalArgumentException(fruit.toString() + " " + "не очищен!!!");
                }
            } else if (obj instanceof Vegetable) {
                Vegetable vegetable = (Vegetable) obj;
                if (vegetable.getCleaning() == true) {
                    vegetable.setWeight(vegetable.getWeight() - ((vegetable.getWeight() * 2) / 100));
                    System.out.println("Вес после шинковки" + " " + vegetable.getWeight());
                    System.out.println("Вес потерь после  шинковки" + " " + (vegetable.getWeight() * 2) / 100);
                } else {
                    throw new IllegalArgumentException(vegetable.toString() + " " + "не очищен!!!");
                }

            }
        }

    }

    @Override
    public void slicerItem(Object obj) {

        if (obj instanceof Fruit) {
            Fruit fruit = (Fruit) obj;
            if (fruit.getCleaning() == true) {
                fruit.setWeight(fruit.getWeight() - ((fruit.getWeight() * 2) / 100));
                System.out.println("Вес после нарезки" + " " + fruit.getWeight());
                System.out.println("Вес потерь после  нарезки" + " " + (fruit.getWeight() * 2) / 100);
            } else {
                throw new IllegalArgumentException(fruit.toString() + " " + "не очищен!!!");
            }
        } else if (obj instanceof Vegetable) {
            Vegetable vegetable = (Vegetable) obj;
            if (vegetable.getCleaning() == true) {
                vegetable.setWeight(vegetable.getWeight() - ((vegetable.getWeight() * 2) / 100));
                System.out.println("Вес после нарезки" + " " + vegetable.getWeight());
                System.out.println("Вес потерь после нарезки" + " " + (vegetable.getWeight() * 2) / 100);
            } else {
                throw new IllegalArgumentException(vegetable.toString() + " " + "не очищен!!!");
            }

        }

    }

    @Override
    public void slicerItems(ArrayList fruitVegetables) {
        double weight = 0;
        for (int i = 0; i < fruitVegetables.size(); i++) {
            Object obj = fruitVegetables.get(i);
            if (obj instanceof Fruit) {
                Fruit fruit = (Fruit) obj;
                if (fruit.getCleaning() == true) {
                    fruit.setWeight(fruit.getWeight() - ((fruit.getWeight() * 2) / 100));
                    System.out.println("Вес после нарезки" + " " + fruit.getWeight());
                    System.out.println("Вес потерь после  нарезки" + " " + (fruit.getWeight() * 2) / 100);
                } else {
                    throw new IllegalArgumentException(fruit.toString() + " " + "не очищен!!!");
                }
            } else if (obj instanceof Vegetable) {
                Vegetable vegetable = (Vegetable) obj;
                if (vegetable.getCleaning() == true) {
                    vegetable.setWeight(vegetable.getWeight() - ((vegetable.getWeight() * 2) / 100));
                    System.out.println("Вес после нарезки" + " " + vegetable.getWeight());
                    System.out.println("Вес потерь после  нарезки" + " " + (vegetable.getWeight() * 2) / 100);
                } else {
                    throw new IllegalArgumentException(vegetable.toString() + " " + "не очищен!!!");
                }

            }
        }

    }
}
