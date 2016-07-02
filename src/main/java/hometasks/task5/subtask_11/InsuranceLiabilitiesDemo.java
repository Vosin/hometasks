/*
 *11.  Страхование .  Определить   иерархию   страховых  
 *     обязательств .  Собрать   из   обязательств   дериватив . 
 *     Подсчитать   стоимость .  Провести   сортировку  
 *     обязательств   в   деривативе   на   основе   уменьшения  
 *     степени   риска .  Найти   обязательство   в   деривативе , 
 *     соответствующее   заданному   диапазону   параметров
 */
package hometasks.task5.subtask_11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author OsinVladimir
 */
public class InsuranceLiabilitiesDemo {
     public static void main(String[] args) {
    
        Commitment  voluntary = new Voluntary(145.25,2,1000,"Иванов");
        Commitment  compulsory= new Compulsory(105.35,5,10000,"Сидоров");
        Commitment  social = new Social(885.25,6,100000,"Петров");
        Commitment  voluntary1 = new Voluntary(1000.00,3,12500,"Яковлев");
        Commitment  social1 = new Social(325.25,4,50000,"Козлов");
   
        
        //создаем договор
        Contract сontract = new Contract();
        сontract.addCommitment(voluntary);
        сontract.addCommitment(compulsory);
        сontract.addCommitment(social);
        сontract.addCommitment(voluntary1);
        сontract.addCommitment(social1);
        
        
       
        System.out.println("Стоимость договора  " + " " +сontract.getPrice()+" "+"грн");

        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Провести   сортировку обязательств в деривативе на основе   уменьшения степени   риска  нажмите   : 1 ");
            System.out.println("Найти обязательство в  деривативе , соответствующее   заданному   диапазону суммы страхового взноса нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        сontract.sortCommitment();
                    }
                    break;
                    case 2: {
                        System.out.println("Введите начальный диапазон суммы. ");
                        int r1 = Integer.parseInt(sc.next());
                        System.out.println("Введите конечный диапазон суммы. ");
                        int r2 = Integer.parseInt(sc.next());
                        сontract.findСommitment(r1, r2);
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

//суперкласс обязательство
class Commitment {
    //определяем поля
    private String name;//название
    private double price;//стоимость
    private int risk;//степень риска
    private int amountСontribution;//размер страхового взноса
    private String fullName;//фамилия стаховщика
    //конструкторы
    public Commitment() {
    }

    public Commitment(String name, double price, int risk, int amountСontribution, String fullName) {
        this.name = name;
        this.price = price;
        this.risk = risk;
        this.amountСontribution = amountСontribution;
        this.fullName = fullName;
    }
    public Commitment(String name, double price, String fullName) {
        this.name = name;
        this.price = price;
        this.fullName = fullName;
    }
   
    //определяем геттеры и сеттеры
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
     public void setRisk(int risk) {
        this.risk = risk;
    }
    public int getRisk() {
        return risk;
    }
    public void setAmountСontribution(int amountСontribution) {
        this.amountСontribution = amountСontribution;
    }
    public int getAmountСontribution() {
        return amountСontribution;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }
   
    @Override
    public String toString() {
        return "Стаховое обязательство" + " " + name + "  "+"Цена =" +" "+ price + " "
                + "Степень риска=" + " " + risk +" " + "Размер страхового взноса:" + " "
                + amountСontribution+" "+"Страховщик= "+" "+fullName;
    }
}
//классы наследники
class Voluntary extends Commitment {
   private final static String name = "Добровольное";
     Voluntary(double price, int risk, int amountСontribution, String fullName) {
        super(name,price,risk, amountСontribution, fullName);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

class Compulsory extends  Commitment {
    private final static String name = "Обязательное";
    Compulsory(double price, int risk, int amountСontribution, String fullName) {
        super(name,price,risk, amountСontribution, fullName);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class Social extends Commitment {
   private final static String name = "Социальное";
   Social(double price, int risk, int amountСontribution, String fullName) {
        super(name,price,risk, amountСontribution, fullName);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
//класс договор
class Contract{
 
    private double price;//стоимость
   
    public double getPrice() {
        return price ;
    }
   
    private ArrayList<Commitment> commitments = new ArrayList<Commitment>();
   //создаем договор
    public Contract addCommitment(Commitment commitment) {
        commitments.add(commitment);
        price   += commitment.getPrice();
        return this;
    }
//сортировка обязательств на основе уменьшения степени риска
    public void sortCommitment() {

        Collections.sort(commitments, new MyComparator());

        for (int i = 0; i < commitments.size(); i++) {
            System.out.println(commitments.get(i).toString());
        }
    }
//найти обязательство по сумме страховки
    public void findСommitment(int d1, int d2) {
        int flg = 0;
        for (int i = 0; i < commitments.size(); i++) {
            if ((commitments.get(i).getAmountСontribution()>= d1) & (commitments.get(i).getAmountСontribution() <= d2)) {
                System.out.println(commitments.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет таких обязательств");
        }
    }

}
//класс использует интерфейс компаратор
class MyComparator implements Comparator<Commitment> {
    @Override
    public int compare(Commitment commitment1, Commitment commitment2) {
        return Integer.compare(commitment2.getRisk(),commitment1.getRisk());
    }
}
