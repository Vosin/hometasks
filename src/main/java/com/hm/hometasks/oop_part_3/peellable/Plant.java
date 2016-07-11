/*
 * Иерархия должна содержать 
 * промежуточный абстрактный слой ​
 * растение (Plant)
 */
package com.hm.hometasks.oop_part_3.peellable;

/**
 *
 * @author Osin Vladimir
 */
public abstract class Plant {
  private String name;//название растения
  private String type;//тип растения
   
  //конструктор
  public Plant(String name,String type){
      this.name = name;
      this.type = type;
  }
  //абстрактный метод
  abstract String getType();   
  abstract String getName();   
  
  
}
