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
    public Bin addfruitVegetables(Object obj) {
        double weightFruit = 0;
        double weightVegetables = 0;
        if (obj instanceof Fruit) {
            Fruit fruit = (Fruit) obj;
            add(fruit);
            weightFruit += fruit.getWeight();
        } else if (obj instanceof Vegetable) {
            Vegetable vegetable = (Vegetable) obj;
            add(vegetable);
            weightVegetables += vegetable.getWeight();
        }
        weightBin = weightFruit + weightVegetables;
        return this;
    }

    //перегружаем добавляем на входе массив из фруктов
    public Bin addfruitVegetables(ArrayList fruitVegetables) {
        for (int i = 0; i < fruitVegetables.size(); i++) {
            add(fruitVegetables.get(i));
        }
        return this;
    }
    //перегружаем добавляем на входе корзину из фруктов

    public Bin addBin(Bin bin) {
        Bin bin1 = new Bin();
        for (int i = 0; i < bin.size(); i++) {
           bin1.add(bin.get(i));
        }
        return bin1;
    }
//получение элемента корзины по индексу
    public int extractPlant(int ind) {
        int index = indexOf(ind);
        remove(index);
        return index;
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
            System.out.println("Элемент корзины извлечен =" + get(i));
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
            System.out.println("Элемент корзины извлечен =" + get(i));
            int index = indexOf(i);
            remove(index);
        }
}
}
}    
