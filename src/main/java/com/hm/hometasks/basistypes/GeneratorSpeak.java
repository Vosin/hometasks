/*
 * Реализовать приложение, выполняющее функцию “генератора казенных речей” 
 * http://alamor.kvintone.ru/work/ii/speech.htm​
 *  Для реализации использовать циклические 
 *  конструкции, массивы. На основании набора фраз приложение должно генерировать 
 *  речь, состоящую из указанного кол­ва предложений, но не менее 10, каждое 
 *  предложение компонуется из набора строк, взятого последовательно из 1, 2, 3, 4 
 *  массива строк случайным образом. 
 */
package com.hm.hometasks.basistypes;

import java.util.Random;

/**
 *
 * @author Osin Vladimir
 */
public class GeneratorSpeak {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(strDim1() + " " + strDim2() + " " + strDim3() + " " + strDim4() + ".");
        }
    }

public static String strDim1() {
        Random random = new Random();
        String[] arr = new String[10];
        arr[0] = "Дорогие друзья!";
        arr[1] = "с другой стороны";
        arr[2] = "равным образом";
        arr[3] = "Не следует, однако, забывать о том, что";
        arr[4] = "Таким образом, ";
        arr[5] = "Повседневная практика показывает, что ";
        arr[6] = "Значимость этих проблем настолько очевидна, что ";
        arr[7] = "Разнообразный и богатый опыт ";
        arr[8] = "Задача организации, в особенности же";
        arr[9] = "Соображения высшего порядка, а также";
        int result = random.nextInt(9);
        return arr[result];
    }

public static String strDim2() {
        Random random = new Random();
        String[] arr = new String[10];
        arr[0] = "реализация намеченных плановых заданий ";
        arr[1] = "рамки и место обучения кадров ";
        arr[2] = "постоянный количественный рост и сфера нашей активности\n" + "сложившаяся структура организации";
        arr[3] = "новая модель";
        arr[4] = "организационной деятельности ";
        arr[5] = "дальнейшее развитие различных форм деятельности  ";
        arr[6] = "постоянное информационно-пропагандистское обеспечение нашей деятельности  ";
        arr[7] = "укрепления и развития структуры ";
        arr[8] = "консультация с широким активом";
        arr[9] = "начало повседневной работы по формированию позиции ";
        int result = random.nextInt(9);
        return arr[result];
    }

public static String strDim3() {
        Random random = new Random();
        String[] arr = new String[10];
        arr[0] = "играет важную роль в формировании";
        arr[1] = "требуют от нас анализа";
        arr[2] = "требуют определения и уточнения ";
        arr[3] = "способствует подготовке и реализации ";
        arr[4] = "обеспечивает широкому кругу специалистов участие в формировании ";
        arr[5] = "позволяет выполнить";
        arr[6] = "важнейшие задания по разработке ";
        arr[7] = "в значительной степени обуславливает создание";
        arr[8] = "представляет собой интересный эксперимент проверки";
        arr[9] = "влечет за собой процесс внедрения и модернизации ";
        int result = random.nextInt(9);
        return arr[result];
    }

public static String strDim4() {
        Random random = new Random();
        String[] arr = new String[10];
        arr[0] = "существующих финансовых и административных условий";
        arr[1] = "дальнейших направлений развитая";
        arr[2] = "системы массового участия";
        arr[3] = "позиций, занимаемых участниками в отношении поставленных задач ";
        arr[4] = "новых предложений";
        arr[5] = "направлений прогрессивного развития";
        arr[6] = "системы обучения кадров\n" + "соответствующей насущным потребностям ";
        arr[7] = "соответствующих условий активизации";
        arr[8] = "модели развития";
        arr[9] = "форм воздействия";
        int result = random.nextInt(9);
        return arr[result];
    }
}
