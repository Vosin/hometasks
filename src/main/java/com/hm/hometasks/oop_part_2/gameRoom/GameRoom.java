/*
 * Класс Игровая комната
 */
package com.hm.hometasks.oop_part_2.gameRoom;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Osin Vladimir
 */
public class GameRoom{
     
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

        Collections.sort(toys, new ComparatorToys());

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

