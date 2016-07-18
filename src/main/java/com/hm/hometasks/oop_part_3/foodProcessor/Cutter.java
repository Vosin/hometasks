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
    void cut(Object obj);
    void cutAll(ArrayList arrayList);
}
