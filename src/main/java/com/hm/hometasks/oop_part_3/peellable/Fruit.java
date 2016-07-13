/*
 * Класс Фрукт
*/



package com.hm.hometasks.oop_part_3.peellable;

/**
 *
 * @author Osin Vladimir
 */
public class Fruit extends Plant implements Peellable{
    private double weight;//вес
    private String color;//цвет
    private String maturity;//зрелость
    private String condition;//состояние
    private boolean cleaning = false;//признак очистки, не очищен  
    private final static String type = "Фрукт";

    public Fruit(String name,double weight,String color,String maturity,String condition,boolean cleaning) {
        super(name, type);
    } 
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setCleaning(boolean cleaning){
        this.cleaning = cleaning;
    }
    public double getWeight(){
        return weight;
    }
    public String getColor(){
        return color;
    }
    public String getMaturity(){
        return maturity;
    }
    public String getCondition(){
        return condition;
    }
     public boolean getCleaning(){
        return cleaning;
    }
     @Override
    public String getType(){
        return getType();
    }
    @Override
    public String getName(){
        return getType();
    } 
    @Override
    public String toString() {
        return getType() + " " + getName() + " " + "Весом =" + getWeight() + " "
                + "Цвет " + " " + getColor() + " " + "Зрелость=" + " " + getMaturity() + " "
                + "Состояние " + " " + getCondition();
    } 
   @Override
    public void peell(){
        setWeight(getWeight()-((getWeight()*2)/100));
        setCleaning(true);
        System.out.println(this+" очищен!");
    }
}
