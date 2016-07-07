/*
 * Класс Контракт
 */
package com.hm.hometasks.oop_part_2.InsuranceLiabilities;


import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Osin Vladimir
 */
public class Contract{
 
    private double price;//стоимость
   
    public double getPrice() {
        return price ;
    }
   
    private ArrayList<Commitment> commitments = new ArrayList<Commitment>();
   //создаем договор
    public Contract addCommitment(Commitment commitment) {
        commitments.add(commitment);
        price   += commitment.getPrice();
        return this;
    }
//сортировка обязательств на основе уменьшения степени риска
    public void sortCommitment() {

        Collections.sort(commitments, new ComparatorContract());

        for (int i = 0; i < commitments.size(); i++) {
            System.out.println(commitments.get(i).toString());
        }
    }
//найти обязательство по сумме страховки
    public void findСommitment(int d1, int d2) {
        int flg = 0;
        for (int i = 0; i < commitments.size(); i++) {
            if ((commitments.get(i).getAmountСontribution()>= d1) & (commitments.get(i).getAmountСontribution() <= d2)) {
                System.out.println(commitments.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет таких обязательств");
        }
    }

}

