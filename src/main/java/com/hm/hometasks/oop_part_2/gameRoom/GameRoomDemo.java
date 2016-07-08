/*
 * 14.  Игровая   комната .  Подготовить   игровую   комнату  
 *       для   детей   разных   возрастных   групп .  Игрушек   должно  
 *       быть   фиксированное   количество   в   пределах  
 *       выделенной   суммы   денег .  Должны   встречаться  
 *       игрушки   родственных   групп :  маленькие ,  средние   и  
 *       большие   машины ,  куклы ,  мячи ,  кубики . 
 *       Провести   сортировку   игрушек   в   комнате   по   одному  
 *       из   параметров .   Найти   игрушки   в   комнате , 
 *       соответствующие   заданному   диапазону   параметров . .
 */
package com.hm.hometasks.oop_part_2.gameRoom;

import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class GameRoomDemo {

    public void GameRoomInit() {
        consolIO();

    }

    public static void consolIO() {
        Toy carBig = new CarToy(45.00, "Большая", 6, 1000, "Высокое", "Пластик");
        Toy carMedium = new CarToy(35.00, "Средняя", 4, 500, "Высокое", "Пластик");
        Toy carSmall = new CarToy(25.00, "Маленькая", 3, 200, "Высокое", "Металл");
        Toy dollBig = new DollToy(125.00, "Большая", 3, 1000, "Высокое", "Пластик");
        Toy dollMedium = new DollToy(325.00, "Средняя", 4, 500, "Среднее", "Пластик");
        Toy dollSmall = new DollToy(425.00, "Маленькая", 8, 200, "Высокое", "Пластик");
        Toy bollBig = new BollToy(15.00, "Большой", 9, 500, "Высокое", "Резина");
        Toy bollMedium = new BollToy(335.00, "Средний", 7, 200, "Среднее", "Резина");
        Toy bollSmall = new BollToy(40.00, "Маленький", 5, 100, "Низкое", "Пластик");
        Toy cubeBig = new CubeToy(10.00, "Большой", 10, 100, "Высокое", "Дерево");
        Toy cubeMedium = new CubeToy(8.00, "Средний", 12, 50, "Среднее", "Дерево");
        Toy cubeSmall = new CubeToy(5.00, "Маленький", 8, 80, "Низкое", "Дерево");
        //создаем игровую комнату
        GameRoom gameRoom = new GameRoom();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму на определенное количество игрушек: ");
        double result = Double.parseDouble(sc.next());
        gameRoom.setCost(result);
        gameRoom.addToy(carBig);
        gameRoom.addToy(carMedium);
        gameRoom.addToy(carSmall);
        gameRoom.addToy(dollBig);
        gameRoom.addToy(dollMedium);
        gameRoom.addToy(dollSmall);
        gameRoom.addToy(bollBig);
        gameRoom.addToy(bollMedium);
        gameRoom.addToy(bollSmall);
        gameRoom.addToy(cubeBig);
        gameRoom.addToy(cubeMedium);
        gameRoom.addToy(cubeSmall);
        boolean end = false;
        while (!end) {
            System.out.println("Провести сортировку игрушек в комнате по возрастной группе нажмите  : 1 ");
            System.out.println("Найти игрушки в комнате , соответствующие заданному диапазону цен нажмите  : 2 ");
            try {
                int result1 = Integer.parseInt(sc.next());
                switch (result1) {
                    case 1: {
                        gameRoom.sortAgeGroup();
                    }
                    break;
                    case 2: {
                        findToys(sc, gameRoom);
                    }
                    break;
                    default: {
                        end = true;
                    }
                }
            } catch (Exception e) {
                end = true;
            }
            System.out.println("Желаете продолжить: 1 -Да,0-Нет ");
            int contunue = Integer.parseInt(sc.next());
            if (contunue == 1) {
                end = false;
            } else {
                end = true;
            }
        }

    }

    public static void findToys(Scanner sc, GameRoom gameRoom) {
        System.out.println("Введите начальный диапазон цены. ");
        double r1 = Double.parseDouble(sc.next());
        System.out.println("Введите конечный диапазон цены. ");
        double r2 = Double.parseDouble(sc.next());
        gameRoom.findToys(r1, r2);
    }

}
