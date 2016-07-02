/* 
 * 15.  Налоги .  Определить   множество   и   сумму   налоговых  
 *  выплат   физического   лица   за   год   с   учетом   доходов   с  
 *  основного   и   дополнительного   мест   работы ,  игрушки  
 *  в   комнате ,  соответствующие   заданному   диапазону  
 *  параметров .  авторских   вознаграждений ,  продажи  
 *  имущества ,  получения   в   подарок   денежных   сумм   и  
 *  имущества ,  переводов   из ­ за   границы ,  льгот   на   детей  
 *  и   материальной   помощи .  Провести   сортировку  
 *  налогов   по   сумме . 
 *  package hometasks.task5.subtask_15;
 */
package hometasks.task5.subtask_15;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



/**
 *
 * @author Osin Vladimir
 */
public class TaxesDemo {
    public static void main(String[] args) {
    
        Tax incomeMainPlaceTax = new IncomeMainPlaceTax(1000.25, "Подоходный");
        Tax incomeAdditionalPlaceTax = new IncomeAdditionalPlaceTax(425.25, "Подоходный");
        Tax royaltyTax = new RoyaltyTax(10000.25, "Косвенный");
        Tax dispositionTax = new DispositionTax(1035.25, "Косвенный");
        Tax presentTax = new PresentTax(100000.00, "Косвенный");
        Tax transferTax = new TransferTax(1000.25, "Косвенный");
        Tax allowanceTax = new AllowanceTax(528.33, "Косвенный");
        Tax materialHelpTax = new MaterialHelpTax(100.25, "Косвенный");
     
        //создаем физ лицо
       Individual individual = new Individual();
       individual.addTax(incomeMainPlaceTax);
       individual.addTax(incomeAdditionalPlaceTax);
       individual.addTax(royaltyTax);
       individual.addTax(dispositionTax);
       individual.addTax(presentTax);
       individual.addTax(transferTax);
       individual.addTax(allowanceTax);
       individual.addTax(materialHelpTax);
       System.out.println("Общий сумма налогов = "+individual.getAmount()+" "+"количество налогов за год =  "+" "+individual.getQuantity());
       System.out.println("Сортировка налогов по сумме=" );
       individual.sortTax();
     }

}
//суперкласс налог
class Tax {
    //определяем поля
    private String name;//название
    private double price;//сумма 
    private String view;//вид налога
     
    //конструкторы
    public Tax() {
    }
    public Tax(String name, double price, String view) {
        this.name = name;
        this.price = price;
        this.view = view;
    }
    public  Tax(String name, double price) {
        this.name = name;
        this.price = price;
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
     public void setView(String view) {
        this.view = view;
    }
    public String getView() {
        return view;
    }
    
    @Override
    public String toString() {
        return "Налог" + " " + name + "  "+"Сумма =" +" "+ price + " "
        +"грн."+" "+"Вид Налога=" + " " + view ;
    }
}
//классы наследники
class IncomeMainPlaceTax extends Tax {
   private final static String name = "Налог с основного места работы";
     IncomeMainPlaceTax( double price, String view){
        super(name, price, view);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

class IncomeAdditionalPlaceTax extends  Tax {
    private final static String name = "Налог с дополнительного места работы";
        IncomeAdditionalPlaceTax( double price, String view){
        super(name, price, view);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class RoyaltyTax extends Tax  {
   private final static String name = "Налог с авторского вознаграждения";
        RoyaltyTax( double price, String view){
        super(name, price, view);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class DispositionTax extends Tax {
   private final static String name = "Налог с продажи имущества";
        DispositionTax( double price, String view){
        super(name, price, view);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class PresentTax extends Tax {
   private final static String name = "Налог с получения в подарок денежных сумм и имущества";
        PresentTax( double price, String view){
        super(name, price, view);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class TransferTax extends Tax {
   private final static String name = "Налог с перевода из за границы";
        TransferTax( double price, String view){
        super(name, price, view);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class AllowanceTax extends Tax {
   private final static String name = "Налог с льготы на детей";
        AllowanceTax( double price, String view){
        super(name, price, view);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class MaterialHelpTax extends Tax {
   private final static String name = "Налог с мат. помощи";
        MaterialHelpTax( double price, String view){
        super(name, price, view);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
//класс физическое лицо
class Individual{
     
    private double amount;//сумма всех налогов 
    
    public double getAmount() {
        return amount ;
    }
    private ArrayList<Tax> taxs = new ArrayList<Tax>();
   //определяем массив налогов
    public Individual addTax(Tax tax) {
        amount += tax.getPrice();
        taxs.add(tax);
        return this;
    }
     public int getQuantity() {
        return taxs.size();
     } 
    
//сортировка налогов по сумме
    public void sortTax() {

        Collections.sort(taxs, new MyComparator());

        for (int i = 0; i < taxs.size(); i++) {
            System.out.println(taxs.get(i).toString());
        }
    }

//класс использует интерфейс компаратор
class MyComparator implements Comparator<Tax> {
    @Override
    public int compare(Tax taxs1, Tax taxs2) {
        return Double.compare(taxs1.getPrice(),taxs2.getPrice());
         
    }
}
}