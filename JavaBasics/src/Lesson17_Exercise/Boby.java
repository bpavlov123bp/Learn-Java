//Боби е тийнейджър и има “изобилен” речник:
//
//    Ако го попиташ нещо, отговаря с “Добре.”
//    Ако му се развикаш (Нетикет: ТОВА Е ВИКАНЕ - т.е. ако сме написали всичко с главни букви, значи му викаме), той отговаря със “Споко бе, ман!”
//    Ако му извикаш въпрос, следва “Спокоооо, знам к’во правя!”
//    Ако просто го посочиш или го гледаш лошо, без да му говориш, той отговаря с “Хубаво деее”
//    На всичко останало, което му говориш, той кима мъдро и продумва тихо “Ахъ.”.
//
//Направете програма, в която потребителят може да “говори” с Боби, въвеждайки изречение от конзолата в безкраен цикъл. В зависимост от въведеното изречение, програмата трябва да отпечата отговора на Боби.
//
//Ако въведете точка програмата спира изпълнението си.
//
//Ето примерен разговор:
//
//    Здрасти!
//
//    Ахъ.
//
//    Какво е това Ахъ?
//
//    Добре.
//
//    ЧУ ЛИ МЕ?
//
//    Спокоооо, знам к’во правя!
//
//    ТИ НЕ СИ ДОБРЕ!
//
//    Споко бе, ман!
//
//    Хубаво деее

package Lesson17_Exercise;

import java.util.Scanner;

public class Boby {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String command = "";
        String answer = "";
        while(true)
        {
            command = input.nextLine();
            if(command.equals("."))
            {
                break;
            }
            if(command.isBlank())
            {
                answer = "Хубаво деее";
            }
            else if(command.equals(command.toUpperCase()))
            {
                if(command.charAt(command.length() - 1) == '?')
                {
                    answer = "Спокоооо, знам к'во правя!";
                }
                else
                {
                    answer = "Споко бе, ман!";
                }
            }
            else if(command.charAt(command.length() - 1) == '?')
            {
                answer = "Добре.";
            }
            else
            {
                answer = "Ахъ.";
            }
            System.out.println(answer);
        }
    }
}
