/*
 * Класс корзина
 */
package com.hm.hometasks.oop_part_3.bin;

import java.util.ArrayList;
import com.hm.hometasks.oop_part_3.peellable.Fruit;
import com.hm.hometasks.oop_part_3.peellable.Vegetable;

/**
 *
 * @author Osin Vladimir
 */
public class Bin extends ArrayList<Object> {

    private double weightBin = 0;

    public double getWeightBin() {
        return weightBin;
    }

    //заполняем корзину овощами и фруктами
    public void addfruitVegetables(Object obj) {
        if (obj instanceof Fruit) {
            Fruit fruit = (Fruit) obj;
            add(fruit);
            weightBin += fruit.getWeight();
        } else if (obj instanceof Vegetable) {
            Vegetable vegetable = (Vegetable) obj;
            add(vegetable);
            weightBin += vegetable.getWeight();
        }

    }

    //перегружаем добавляем на входе массив из фруктов
    public void addfruitVegetables(ArrayList fruitVegetables) {
        for (int i = 0; i < fruitVegetables.size(); i++) {
            add(fruitVegetables.get(i));
        }
    }
    //перегружаем добавляем на входе корзину из фруктов

    public void addfruitVegetables(Bin bin) {
        Bin bin1 = new Bin();
        for (int i = 0; i < bin.size(); i++) {
            bin1.add(bin.get(i));
        }
    }
//извлечение элемента корзины по индексу

    public Object extractFruitVegetables(int ind) {
        Object obj = get(ind);
        if (obj instanceof Fruit) {
            Fruit fruit = (Fruit) obj;
            weightBin -= fruit.getWeight();
        } else if (obj instanceof Vegetable) {
            Vegetable vegetable = (Vegetable) obj;
            weightBin -= vegetable.getWeight();
        }
        return remove(ind);

    }

    //извлечение содержимого и очистка корзины 
    public Bin extractAll() {
        for (int i = 0; i < size(); i++) {
            System.out.println("Элемент корзины удален =" + get(i));
        }
        clear();
        System.out.println("Корзина очищена" + size());
        return this;
    }
    //извлечение всех фруктов

    public void extractAllFruts() {
        for (int i = 0; i < size(); i++) {
            Object obj = get(i);
            if (obj instanceof Fruit) {
                Fruit fruit = (Fruit) obj;
                System.out.println("Элемент корзины извлечен =" + fruit.getName());
                int index = indexOf(i);
                remove(index);
            }

        }
    }

    //удаление всех овощей
    public void extractAllVegetables() {
        for (int i = 0; i < size(); i++) {
            Object obj = get(i);
            if (obj instanceof Vegetable) {
                Vegetable vegetable = (Vegetable) obj;
                System.out.println("Элемент корзины извлечен =" + vegetable.getName());
                int index = indexOf(i);
                remove(index);
            }
        }
    }
}
