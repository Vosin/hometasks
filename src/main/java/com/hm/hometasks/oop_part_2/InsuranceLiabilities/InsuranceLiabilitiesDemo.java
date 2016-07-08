/*
 *11.  Страхование .  Определить   иерархию   страховых  
 *     обязательств .  Собрать   из   обязательств   дериватив . 
 *     Подсчитать   стоимость .  Провести   сортировку  
 *     обязательств   в   деривативе   на   основе   уменьшения  
 *     степени   риска .  Найти   обязательство   в   деривативе , 
 *     соответствующее   заданному   диапазону   параметров
 */
package com.hm.hometasks.oop_part_2.InsuranceLiabilities;

import java.util.Scanner;

/**
 *
 * @author OsinVladimir
 */
public class InsuranceLiabilitiesDemo {

    public void InsuranceLiabilitiesInit() {

        Contract contract = createContract();
        System.out.println("Стоимость договора  " + " " + contract.getPrice() + " " + "грн");
        consolIO(contract);

    }

    public static Contract createContract() {
        Commitment voluntary = new VoluntaryCommitment(145.25, 2, 1000, "Иванов");
        Commitment compulsory = new CompulsoryCommitment(105.35, 5, 10000, "Сидоров");
        Commitment social = new SocialCommitment(885.25, 6, 100000, "Петров");
        Commitment voluntary1 = new VoluntaryCommitment(1000.00, 3, 12500, "Яковлев");
        Commitment social1 = new SocialCommitment(325.25, 4, 50000, "Козлов");

        //создаем договор
        Contract сontract = new Contract();
        сontract.addCommitment(voluntary);
        сontract.addCommitment(compulsory);
        сontract.addCommitment(social);
        сontract.addCommitment(voluntary1);
        сontract.addCommitment(social1);
        return сontract;
    }

    public static void consolIO(Contract contract) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Провести   сортировку обязательств в деривативе на основе   уменьшения степени   риска  нажмите   : 1 ");
            System.out.println("Найти обязательство в  деривативе , соответствующее   заданному   диапазону суммы страхового взноса нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        contract.sortCommitment();
                    }
                    break;
                    case 2: {
                        findСommitmentDiapazon(contract, sc);
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

    public static void findСommitmentDiapazon(Contract contract, Scanner sc) {
        System.out.println("Введите начальный диапазон суммы. ");
        int r1 = Integer.parseInt(sc.next());
        System.out.println("Введите конечный диапазон суммы. ");
        int r2 = Integer.parseInt(sc.next());
        contract.findСommitment(r1, r2);
    }
}
