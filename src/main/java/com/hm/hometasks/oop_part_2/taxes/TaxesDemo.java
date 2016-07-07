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
package com.hm.hometasks.oop_part_2.taxes;

import java.util.Scanner;



/**
 *
 * @author Osin Vladimir
 */
public class TaxesDemo {
    public  void TaxesInit() {
       Individual individual = createIndividual();
       System.out.println("Общий сумма налогов = "+individual.getAmount()+" "+"количество налогов за год =  "+" "+individual.getQuantity());
       consolIO(individual);
     }
    public static Individual createIndividual(){
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
       return individual;

}
    public static void consolIO(Individual individual){
       Scanner sc = new Scanner(System.in);
       boolean end = false;
       while (!end) {      
       System.out.println("Сортировка налогов по сумме=" );
       individual.sortTax(); 
       System.out.println("Желаете продолжить: 1 -Да,0-Нет ");
            int contunue = Integer.parseInt(sc.next());
            if(contunue==1){
                end = false;
            }else{
                end = true;
         }
       }
    }
}





