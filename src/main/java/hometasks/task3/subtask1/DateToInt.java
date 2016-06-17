/*
 * Используя числовые типы данных int, short и byte, а так же битовые операции 
 * создать приложение, которое записывает в целочисленную переменную (int) 
 * дату в формате день, месяц, год. Для хранения значений дня и месяца 
 * использовать по 1 байту, год ­ 2 байта. Реализовать механизм, для обратного 
 * преобразования. .
 */
package hometasks.task3.subtask1;

/**
 *
 * @author OsinVladimir
 */
public class DateToInt {
    public static void main(String[] args) {
        String sourseStr = "12/05/16";
        //выделяем на день, месяц и год
        String d       = sourseStr.substring(0,2);
        String m       = sourseStr.substring(3,5);
        String y       = sourseStr.substring(6,8);
        //переводим в байты
        byte day       = Byte.parseByte(d);//храним 1 байт
        byte month     = Byte.parseByte(m);//храним 1 байт
        short year     = Short.parseShort(y);// храним 2 байта
        //записываем в целую переменную
        int dt         =  (day) |(month << 8)|(year << 16);
        int mask       =   0b11111111;//255

        System.out.printf("День: %d, Месяц: %d, год: %d", 
        mask & dt ,//накладываем битовую маску 
        mask & dt >>> 8, 
        mask & dt >>> 16);
        // разбиваем целое ( обратная операция)
        int day1       = dt ;
        int month1     = dt >> 8 ;
        int year1      = dt >> 16 ;
        System.out.println();
        System.out.printf("День: %d, Месяц: %d, год: %d", 
        mask & day1,//накладываем битовую маску 
        mask & month1 , 
        mask & year1 );
  
        
    }       
        

    
}
