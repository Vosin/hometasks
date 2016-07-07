/*
 * Класс предложение
 */
package com.hm.hometasks.oop_part_2.tourPackages;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Osin Vladimir
 */
public class Proposition{
        
    private ArrayList<TourPackage> tourPackages = new ArrayList<TourPackage>();
   //определяем предложение
    
     public Proposition addTourPackage(TourPackage tourPackage) {
        tourPackages.add(tourPackage);
        return this;
    }
         
//сортировка путевки по сумме
    public void sortTourPackage() {

        Collections.sort(tourPackages, new ComparatorTourPackage());

        for (int i = 0; i < tourPackages.size(); i++) {
            System.out.println(tourPackages.get(i).toString());
        }
    }
//найти путевку по транспорту,дням пребывания и типу питания
    public void findTourPackageTransfer(int transfer,int numberDays,int typeFood) {
        String result;
        String res;
        switch (transfer) {
            case 1: {
                result = "Авиа";
            }
            break;
            case 2: {
                result = "Автобус";
            }
            break;
            case 3: {
                result = "Поезд";
            }
            break;
            default: {
                result = "";
            }
        }
        switch (typeFood) {
            case 1: {
                res = "Все включено";
            }
            break;
            case 2: {
                res = "Завтрак";
            }
            break;
            case 3: {
                res = "Без питания";
            }
            break;
            default: {
                res = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < tourPackages.size(); i++) {
              if ((tourPackages.get(i).getTransfer().equals(result)) & (tourPackages.get(i).getNumberDays()== numberDays) & (tourPackages.get(i).getTypeFood().equals(res))){
                   System.out.println(tourPackages.get(i).toString());
                   flg = 1; 
                  } 
                }
        if (flg == 0) {
            System.out.println("Нет такой путевки");
        }
    }
   

   //найти путевку по названию
  public void findTourPackageName(int name) {
        String result;
        switch (name) {
            case 1: {
                result = "Отдых на море";
            }
            break;
            case 2: {
                result = "Экскурсии";
            }
            break;
            case 3: {
                result = "Лечение";
            }
            case 4: {
                result = "Шоппинг";
            }
            break;
            case 5: {
                result = "Круиз";
            }
            
            break;
            default: {
                result = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < tourPackages.size(); i++) {
              if (tourPackages.get(i).getName().equals(result)) {
                System.out.println(tourPackages.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такой путевки");
        }
    } 
}
