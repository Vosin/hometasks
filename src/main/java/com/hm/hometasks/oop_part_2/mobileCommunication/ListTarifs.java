/*
 * Класс список тарифов
 */
package com.hm.hometasks.oop_part_2.mobileCommunication;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Osin Vladimir
 */
public class ListTarifs{
 
    private int amountClient;//количество клиентов
   
    public int amountClient() {
        return amountClient ;
    }
   
    private ArrayList<Tarif> tarifs = new ArrayList<Tarif>();
   //создаем список
    public ListTarifs addTarif(Tarif tarif) {
        tarifs.add(tarif);
        amountClient   += tarif.getAmountClient();
        return this;
    }
//сортировка тарифов на основе абон платы
    public void sortTarif() {

        Collections.sort(tarifs, new ComparatorTarif());

        for (int i = 0; i < tarifs.size(); i++) {
            System.out.println(tarifs.get(i).toString());
        }
    }
//найти тариф по стоимости минуты
    public void findTarif(double d1, double d2) {
        int flg = 0;
        for (int i = 0; i < tarifs.size(); i++) {
            if ((tarifs.get(i).getPriceMinute()>= d1) & (tarifs.get(i).getPriceMinute() <= d2)) {
                System.out.println(tarifs.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет таких обязательств");
        }
    }

}

