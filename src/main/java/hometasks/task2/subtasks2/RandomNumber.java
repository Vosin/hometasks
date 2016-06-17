/*
 * Используя конструкцию switch, простейшие арифметические операции и 
 * операции сравнения реализовать приложение, которое выводит в консоль текстовое 
 * представление случайного целого числа в диапазоне от 0 до 99 включительно. 
 */
package hometasks.task2.subtasks2;

import java.util.Random;


/**
 *
 * @author Osin Vladimir
 */
public class RandomNumber {

    public static void main(String[] args) {
        Random random = new Random();
        printRandomNumber(random.nextInt(99));
    }

    static void printRandomNumber(int i) {
        String s;
        switch (i) {
            case 0 :s = "ноль";break;
            case 1 :s = "один";break;
            case 2 :s = "два";break;
            case 3 :s = "три";break;
            case 4 :s = "четыре";break;
            case 5 :s = "пять";break;
            case 6 :s = "шесть";break;
            case 7 :s = "семь";break;
            case 8 :s = "восемь";break;
            case 9 :s = "девять";break;
            case 10:s = "десять";break;
            case 11:s = "одинннадцать";break;
            case 12:s = "двенадцать";break;
            case 13:s = "тринадцать";break;
            case 14:s = "четырнадцать";break;
            case 15:s = "пятнадцать";break;
            case 16:s = "шестнадцать";break;
            case 17:s = "семнадцать";break;
            case 18:s = "восемнадцать";break;
            case 19:s = "девятнадцать";break;
            case 20:s = "двадцать";break;
            case 21:s = "двадцать один";break;
            case 22:s = "двадцать два";break;
            case 23:s = "двадцать три";break;
            case 24:s = "двадцать четыре";break;
            case 25:s = "двадцать пять";break;
            case 26:s = "двадцать шесть";break;
            case 27:s = "двадцать семь";break;
            case 28:s = "двадцать восем";break;
            case 29:s = "двадцать девять";break;
            case 30:s = "тридцать";break;
            case 31:s = "тридцать один";break;
            case 32:s = "тридцать два";break;
            case 33:s = "тридцать три";break;
            case 34:s = "тридцать четыре";break;
            case 35:s = "тридцать пять";break;
            case 36:s = "тридцать шесть";break;
            case 37:s = "тридцать семь";break;
            case 38:s = "тридцать восемь";break;
            case 39:s = "тридцать девять";break;
            case 40:s = "сорок";break;
            case 41:s = "сорок один";break;
            case 42:s = "сорок два";break;
            case 43:s = "сорок три";break;
            case 44:s = "сорок четыре";break;
            case 45:s = "сорок пять";break;
            case 46:s = "сорок шесть";break;
            case 47:s = "сорок семь";break;
            case 48:s = "сорок восемь";break;
            case 49:s = "сорок девять";break;
            case 50:s = "пятьдесят";break;
            case 51:s = "пятьдесят один";break;
            case 52:s = "пятьдесят два";break;
            case 53:s = "пятьдесят три";break;
            case 54:s = "пятьдесят четыре";break;
            case 55:s = "пятьдесят пять";break;
            case 56:s = "пятьдесят шесть";break;
            case 57:s = "пятьдесят семь";break;
            case 58:s = "пятьдесят восемь";break;
            case 59:s = "пятьдесят девять";break;
            case 60:s = "шестьдесят";break;
            case 61:s = "шестьдесят один";break;
            case 62:s = "шестьдесят два";break;
            case 63:s = "шестьдесят три";break;
            case 64:s = "шестьдесят четыре";break;
            case 65:s = "шестьдесят пять";break;
            case 66:s = "шестьдесят шесть";break;
            case 67:s = "шестьдесят семь";break;
            case 68:s = "шестьдесят восемь";break;
            case 69:s = "шестьдесят девять";break;
            case 70:s = "семьдесят";break;
            case 71:s = "семьдесят один";break;
            case 72:s = "семьдесят два";break;
            case 73:s = "семьдесят три";break;
            case 74:s = "семьдесят четыре";break;
            case 75:s = "семьдесят пять";break;
            case 76:s = "семьдесят шесть";break;
            case 77:s = "семьдесят семь";break;
            case 78:s = "семьдесят восемь";break;
            case 79:s = "семьдесят девять";break;
            case 80:s = "восемьдесят";break;
            case 81:s = "восемьдесят один";break;
            case 82:s = "восемьдесят два";break;
            case 83:s = "восемьдесят три";break;
            case 84:s = "восемьдесят четыре";break;
            case 85:s = "восемьдесят пять";break;
            case 86:s = "восемьдесят шесть";break;
            case 87:s = "восемьдесят семь";break;
            case 88:s = "восемьдесят восемь";break;
            case 89:s = "восемьдесят девять";break;
            case 90:s = "девяносто";break;
            case 91:s = "девяносто один";break;
            case 92:s = "девяносто два";break;
            case 93:s = "девяносто три";break;
            case 94:s = "девяносто четыре";break;
            case 95:s = "девяносто пять";break;
            case 96:s = "девяносто шесть";break;
            case 97:s = "девяносто семь";break;
            case 98:s = "девяносто восемь";break;
            case 99:s = "девяносто девять";break;
            default:
                    s = "Нет такого числа ";break;

        }
        System.out.println("Случайное число = " +" "+ s);
    }

}