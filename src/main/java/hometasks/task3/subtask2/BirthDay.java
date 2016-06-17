/*
 * Реализовать приложение, которое запрашивает у пользователя дату рождения, 
 * преобразует ее в целое число и выводит в консоль, производит обратную 
 *  операцию над числом, введенным пользователем, проверяя данные из 
 *  необходимых бит на валидность, если число является датой ­ выводит ее в Консоль
 */
package hometasks.task3.subtask2;

import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class BirthDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println();
            System.out.println("Введите дату своего рождения в формате:дд/мм/гг");
            try {
                String result = sc.nextLine();
                //выделяем на день, месяц и год
                String day = result.substring(0, 2);
                String month = result.substring(3, 5);
                String year = result.substring(6, 8);
                //переводим в целое
                byte d = Byte.parseByte(day);
                byte m = Byte.parseByte(month);
                short y = Short.parseShort(year);
                int dmy = (d) | (m << 8) | (y << 16);//переводим в целое
                int mask = 0b11111111;//255
                //проверка
                boolean inspDay = inspectionDay((int) d);
                if (inspDay == true) {
                    boolean inspMonth = inspectionMonth((int) m);
                    if (inspMonth == true) {
                        boolean inspYear = inspectionYear((int) y);
                        if (inspYear == true) {
                            //печатаем
                            System.out.printf("День: %d, Месяц: %d, год: %d",
                                    mask & d,//накладываем битовую маску 
                                    mask & m,
                                    mask & y);
                        } else {
                            System.out.println("Вы ввели неправильный год дня рождения!!");
                             end = true;
                        }
                    } else {
                        System.out.println("Вы ввели неправильный месяц дня рождения!!");
                         end = true;
                    }

                } else {
                    System.out.println("Вы ввели неправильный день дня рождения!!");
                     end = true;
                }
            } catch (Exception e) {
                end = true;
            }
        }

    }

    static boolean inspectionDay(int day) {
        final int countDay = 31;
        if (day < 0) {
            return false;
        } else if (day > countDay) {
            return false;
        } else {
            return true;
        }
    }

    static boolean inspectionMonth(int month) {
        final int countMonth = 12;
        if (month < 0) {
            return false;
        } else if (month > countMonth) {
            return false;
        } else {
            return true;
        }
    }

    static boolean inspectionYear(int year) {
        final int countYear = 2018;
        if (year < 0) {
            return false;
        } else if (year > countYear) {
            return false;
        } else {
            return true;
        }
    }

}
