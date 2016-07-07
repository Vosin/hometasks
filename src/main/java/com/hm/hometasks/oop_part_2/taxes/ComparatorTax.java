/*
 * Класс сравнения налогов
 */
package com.hm.hometasks.oop_part_2.taxes;

import java.util.Comparator;

/**
 *
 * @author vplpdka
 */
public class ComparatorTax implements Comparator<Tax> {
    @Override
    public int compare(Tax taxs1, Tax taxs2) {
        return Double.compare(taxs1.getPrice(),taxs2.getPrice());
         
    }
}

    

