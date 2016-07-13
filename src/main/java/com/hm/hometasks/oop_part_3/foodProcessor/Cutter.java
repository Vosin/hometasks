/*
 * Шинковка
 */
package com.hm.hometasks.oop_part_3.foodProcessor;
import java.util.ArrayList;
/**
 *
 * @author Osin Vladimir
 */
public interface Cutter {
    double cut(Object obj);
    double cutAll(ArrayList arrayList);
}
