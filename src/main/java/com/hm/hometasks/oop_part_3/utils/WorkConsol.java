/*
 * Работа с консолью
 */
package com.hm.hometasks.oop_part_3.utils;

import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class WorkConsol {
 public double enterWeight(Scanner sc){
     System.out.println("Введите вес в граммах");
        return  Double.parseDouble(sc.next());
 }
 public int enterBin(Scanner sc){
      System.out.println("Добавить в корзину? 1 -Да,0-Нет");
      return Integer.parseInt(sc.next());
 }
 public int cutSlicer(Scanner sc){
     System.out.println("Пошинковать и нарезать?1 -Да,0-Нет");
     return Integer.parseInt(sc.next());
 }
}
