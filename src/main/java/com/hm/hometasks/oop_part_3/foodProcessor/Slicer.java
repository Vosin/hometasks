/*
 * Нарезка ломтиками
 */
package com.hm.hometasks.oop_part_3.foodProcessor;

import java.util.ArrayList;

/**
 *
 * @author Osin Vladimir
 */
public interface Slicer {
    double slicerItem(Object obj);
    double slicerItems(ArrayList arrayList);
}
