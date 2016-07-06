/*
 * класс сравнения
 */
package com.hm.hometasks.oop_part_2.transport;

import java.util.Comparator;

/**
 *
 * @author Osin Vladimir
 */
public class ComparatorTransport implements Comparator<RailwayTransport> {
    @Override
    public int compare(RailwayTransport r1, RailwayTransport r2) {
        return Double.compare(r1.getLevelComfort(), r2.getLevelComfort());
    }
}

