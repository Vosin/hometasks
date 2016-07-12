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

    private double weightBin;

    public double getWeightBin() {
        return weightBin;
    }

    //заполняем корзину овощами и фруктами
    public Bin addPlant(Fruit fruit, Vegetable vegetable) {
        double weightFruit = 0;
        double weightVegetables = 0;
        add(fruit);
        add(vegetable);
        weightFruit += fruit.getWeight();
        weightVegetables += vegetable.getWeight();
        weightBin = weightFruit + weightVegetables;
        return this;
    }

    //перегружаем добавляем на входе массив из фруктов
    public Bin addPlant(ArrayList fruitVegetables) {
        for (int i = 0; i < fruitVegetables.size(); i++) {
            add(fruitVegetables.get(i));
        }
        return this;
    }
    //перегружаем добавляем на входе корзину из фруктов

    public Bin addPlant(Bin bin) {
        for (int i = 0; i < bin.size(); i++) {
            add(bin.get(i));
        }
        return this;
    }

    public int extractPlant(int ind) {
        int index = indexOf(ind);
        remove(index);
        return index;
    }

    //извлечение содержимого и очистка корзины 
    public Bin extractAll() {
        for (int i = 0; i < size(); i++) {
            System.out.println("Элемент корзины =" + get(i));
        }
        clear();
        System.out.println("Корзина очищена" + size());
        return this;
    }     //извлечение всех фруктов

    public void extractAllFruts() {

        for (int i = 0; i < size(); i++) {
            System.out.println("Элемент корзины =" + get(i));
        }

    }

    public void extractAllVegetables() {
        for (int i = 0; i < size(); i++) {
            System.out.println("Элемент корзины =" + get(i));
        }

    }
}
