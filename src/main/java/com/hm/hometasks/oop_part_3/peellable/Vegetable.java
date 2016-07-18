/*
 *Класс наследник Овощ
 */
package com.hm.hometasks.oop_part_3.peellable;

/**
 *
 * @author Osin Vladimir
 */
public class Vegetable extends Plant implements Peellable {

    private final static String type = "Овощ";

    public Vegetable(String name, double weight, String color, String maturity, String condition, boolean cleaning) {
        super(name, type, weight, color, maturity, condition, cleaning);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void peell() {
        setWeight(getWeight() - ((getWeight() * 5) / 100));
        setCleaning(true);
        System.out.println(this + " очищен!");
    }

}
