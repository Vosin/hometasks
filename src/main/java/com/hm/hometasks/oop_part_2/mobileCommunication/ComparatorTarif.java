/*
 * Класс сравнения тарифов
 */
package com.hm.hometasks.oop_part_2.mobileCommunication;

import java.util.Comparator;

/**
 *
 * @author Osin Vladimir
 */
public class ComparatorTarif implements Comparator<Tarif> {
    @Override
    public int compare(Tarif tarif1, Tarif tarif2) {
        return Double.compare(tarif1.getPrice(),tarif2.getPrice());
    }
}
