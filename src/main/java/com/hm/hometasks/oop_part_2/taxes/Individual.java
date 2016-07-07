/*
 * Класс физ лицо
 */
package com.hm.hometasks.oop_part_2.taxes;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Osin Vladimir
 */
public class Individual{
     
    private double amount;//сумма всех налогов 
    
    public double getAmount() {
        return amount ;
    }
    private ArrayList<Tax> taxs = new ArrayList<Tax>();
   //определяем массив налогов
    public Individual addTax(Tax tax) {
        amount += tax.getPrice();
        taxs.add(tax);
        return this;
    }
     public int getQuantity() {
        return taxs.size();
     } 
    
//сортировка налогов по сумме
    public void sortTax() {

        Collections.sort(taxs, new ComparatorTax());

        for (int i = 0; i < taxs.size(); i++) {
            System.out.println(taxs.get(i).toString());
        }
    }
}
