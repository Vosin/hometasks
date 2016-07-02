/*
 * Звукозапись .  Определить   иерархию   музыкальных  
 * композиций .  Записать   на   диск   сборку .  Подсчитать  
 *  продолжительность .  Провести   перестановку  
 *  композиций   диска   на   основе   принадлежности   к  
 *  стилю .  Найти   композицию ,  соответствующую  
 *  заданному   диапазону   длины   треков . 

 */
package hometasks.task5.subtask5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author OsinVladimir
 */
public class SoundTrekDemo {
      public static void main(String[] args) {
         
        Composition i  = new Instrument(12,1,10);
        Composition p  = new Pop(5,2,12);
        Composition c  = new Classic(11,3,10);
        Composition i1 = new Instrument(8,4,3);
        Composition p1 = new Pop(7,2,4);

        Installation inst = new Installation();
        inst.addComposition(i);
        inst.addComposition(p);
        inst.addComposition(c);
        inst.addComposition(i1);
        inst.addComposition(p1);
       
        System.out.println("Продолжительность диска  " + " " +inst.getDuration() + " "+"минут");

        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Провести перестановку композиций   диска   на основе принадлежности к стилю  нажмите   : 1 ");
            System.out.println("Стили.1-Инструментальный,2-Поп,3-Классика,4-Ретро");
            System.out.println("Найти композицию ,  соответствующую заданному диапазону   длины   треков нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        inst.sortComposition();
                    }
                    break;
                    case 2: {
                        System.out.println("Введите начальный диапазон длины трека. ");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("Введите конечный длины трека. ");
                        int r2 = Integer.parseInt(sc.next());
                        inst.findComposition(r1, r2);
                    }
                    break;
                    default: {
                        end = true;
                    }
                }
            } catch (Exception e) {
                end = true;
            }
        }
     }
           

}
class Composition {
    //определяем поля

    private String name;//название
    private int   duration;//продолжительность
    private int style;//стиль
    private int trackLength;//длина трека
      

    //конструкторы
    Composition() {
    }

    public Composition(String name, int duration, int style, int trackLength) {
        this.name = name;
        this.duration = duration;
        this.style = style;
        this.trackLength = trackLength;
    }
   public Composition(String name, int duration) {
        this.name = name;
        this.duration = duration;
    
    }

    //определяем геттеры и сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setStyle(int style) {
        this.style = style;
    }

    public int getStyle() {
        return style;
    }

    public void setTrackLength(int trackLength) {
        this.trackLength = trackLength;
    }

    public int getTrackLength() {
        return trackLength;
    }
    @Override
    public String toString() {
        return "Композиция:" + " " + name + " " + "Продолжительность =" + duration + " " + "Стиль = " + " "
                + style+ " " + "Длина трека =" +trackLength ;
    }

}
class Instrument extends Composition {

    private final static String name = "Инструментальная";
    Instrument(int duration, int style, int trackLength) {
        super(name, duration, style, trackLength);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Pop extends Composition {

    private final static String name = "Популярная";

    Pop (int duration, int style, int trackLength) {
        super(name, duration, style, trackLength);
    }
    

    @Override
    public String toString() {
        return super.toString();
    }
}

class Classic extends Composition {

    private final static String name = "Классическая";

   Classic (int duration, int style, int trackLength) {
        super(name, duration, style, trackLength);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

class Installation{

    private int   duration;//продолжительность

    public int getDuration() {
        return duration;
    }

    private ArrayList<Composition> compositions = new ArrayList<Composition>();

    public Installation addComposition(Composition composition) {
        compositions.add(composition);
        duration += composition.getDuration();
        return this;
    }

    public void sortComposition() {

        Collections.sort(compositions, new MyComparator());

        for (int i = 0; i < compositions.size(); i++) {
            System.out.println(compositions.get(i).toString());
        }
    }

    public void findComposition(int d1, int d2) {
        int flg = 0;
        for (int i = 0; i < compositions.size(); i++) {
            if ((compositions.get(i).getTrackLength()>= d1) & (compositions.get(i).getTrackLength() <= d2)) {
                System.out.println(compositions.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такой звукозаписи");
        }
    }

}

class MyComparator implements Comparator<Composition> {

    @Override
    public int compare(Composition c1, Composition c2) {
        return Integer.compare(c1.getStyle(), c2.getStyle());
    }

}

