/*
 * класс Акссесуар
 */
 
package com.hm.hometasks.oop_part_2.flower;

/**
 *
 * @author Osin Vladimir
 */
public class Aksessuar {
    private String name;// название аксекссуара
    private String type;// тип аксекссуара
    private double price;// цена аксекссуара
    public Aksessuar(){
        
    }
    public Aksessuar(String name, double price, String type){
        this.name = name;
        this.price = price;
        this.type = type;
    }
    public Aksessuar(String name, double price){
        this.name = name;
        this.price = price;
     }
       public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setType(String type) {
        this.type = this.type;
    }

    public String getType() {
        return type;
    }
    @Override
    public String toString() {
        return getName() + " " + "Цена =" + getPrice() + " "  
                + getType();
    }
    
}
