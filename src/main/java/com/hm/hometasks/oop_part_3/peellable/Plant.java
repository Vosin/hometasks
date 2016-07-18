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
    private double weight;//вес
    private String color;//цвет
    private String maturity;//зрелость
    private String condition;//состояние
    private boolean cleaning = false;//признак очистки, не очищен  
    //конструктор

    public Plant() {
    }

    public Plant(String name, String type, double weight, String color, String maturity, String condition, boolean cleaning) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.color = color;
        this.maturity = maturity;
        this.condition = condition;
        this.cleaning = cleaning;
    }

    public String getType() {
        return type;
    }

    ;   
    public String getName() {
        return name;
    }

    ;
    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getMaturity() {
        return maturity;
    }

    public String getCondition() {
        return condition;
    }

    public boolean getCleaning() {
        return cleaning;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCleaning(boolean cleaning) {
        this.cleaning = cleaning;
    }

    @Override
    public String toString() {
        return getName() + " " + getType() + " " + "Весом =" + getWeight() + " "
                + "Цвет " + " " + getColor() + " " + "Зрелость=" + " " + getMaturity() + " "
                + "Состояние " + " " + getCondition();
    }

}
