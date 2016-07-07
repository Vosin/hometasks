/*
 * 18.  Кредиты .  Сформировать   набор   предложений  
 *  клиенту   по   целевым   кредитам   различных   банков   для  
 *  оптимального   выбора .  Учитывать   возможность  
 *  досрочного   погашения   кредита   и / или   увеличения  
 *  кредитной   линии .  Реализовать   выбор   и   поиск кредита 
 */
package com.hm.hometasks.oop_part_2.credit;

import java.util.Scanner;

/**
 *
 * @author Osin vladimir
 */
public class CreditDemo {
    public void CreditInit() {
    
     PropositionCredit propositionCredit = creatPropositionCredit();
     System.out.println(" Список всех кредитных предложений различных банков ");
     propositionCredit.printCredit();
     consolIO(propositionCredit);
    
    }
    public static PropositionCredit creatPropositionCredit(){
     Credit payCar   = new PayCarCredit(500000.00,"Аваль","Да");
     Credit payCar1  = new PayCarCredit(50000.00,"Южный","Да");
     Credit payFlat  = new PayFlatCredit(1500000.00,"Аваль","Нет");
     Credit payFlat1 = new PayFlatCredit(255000.00,"Южный","Нет");
     Credit repair   = new RepairCredit(10000.00,"Приват","Нет");
     Credit repair1  = new RepairCredit(255000.00,"Южный","Нет");
     
     PropositionCredit propositionCredit = new PropositionCredit();
     propositionCredit.addCredit(payCar);
     propositionCredit.addCredit(payCar1);
     propositionCredit.addCredit(payFlat);
     propositionCredit.addCredit(payFlat1);
     propositionCredit.addCredit(repair);
     propositionCredit.addCredit(repair1);
     return propositionCredit ;
    }
    public static void consolIO(PropositionCredit propositionCredit){
     Scanner sc = new Scanner(System.in);
     boolean end = false;
     while (!end) {
            System.out.println("Для кредита выберите ");
            System.out.println("Кредит  на машину : 1 ");
            System.out.println("Кредит  на квартиру : 2 ");
            System.out.println("Кредит  на ремонт : 3 ");
     try {
            int result = Integer.parseInt(sc.next());
            propositionCredit.findCreditName(result);
     }catch (Exception e) {
                end = true;
            }System.out.println("Желаете продолжить: 1 -Да,0-Нет ");
            int contunue = Integer.parseInt(sc.next());
            if(contunue==1){
                end = false;
            }else{
                end = true;
            }
     
    }
    }
}
