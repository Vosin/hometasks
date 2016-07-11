/*
 * Супер класс книга
 */
package com.hm.hometasks.oop_part_1.book;

/**
 *
 * @author Osin Vladimir
 */
public class Book {
//определяем поля класса

    private int id;//ид
    private String autor;//автор
    private String name;//название
    private String izdatelstvo;//издательство
    private int godIzdania;//год издания
    private int countPage;//количество страиниц
    private double price;//цена
    private String type;//тип

//определяем конструкторы
    public Book() {
    }

    public Book(int id, String autor, String name, String izdatelstvo, int godIzdania, int countPage, double price, String type) {
        this.id = id;
        this.autor = autor;
        this.name = name;
        this.izdatelstvo = izdatelstvo;
        this.godIzdania = godIzdania;
        this.countPage = countPage;
        this.price = price;
        this.type = type;

    }

    public Book(String autor, String name, String izdatelstvo, int godIzdania) {
        this.autor = autor;
        this.name = name;
        this.izdatelstvo = izdatelstvo;
        this.godIzdania = godIzdania;
    }

    public Book(String autor, String name, String izdatelstvo, double price, String type) {
        this.autor = autor;
        this.name = name;
        this.izdatelstvo = izdatelstvo;
        this.price = price;
        this.type = type;

    }

//определяем геттеры и сеттеры
    public int getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public String getName() {
        return name;
    }

    public String getIzdatelstvo() {
        return izdatelstvo;
    }

    public int getGodIzdania() {
        return godIzdania;
    }

    public int getCountPage() {
        return countPage;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Книга" + " " + "id =" + " " + id + " " + "Автор=" + autor + " " + "Название=" + " " + name + " " + "Издательство =" + izdatelstvo + " "
                + "Год издания=" + " " + godIzdania + " " + "Количество страниц:" + " " + countPage + " цена=" + " "
                + price + ": " + "Тип переплета=" + " " + type;
    }
}
