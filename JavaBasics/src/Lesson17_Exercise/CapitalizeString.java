//Направете програма, която очаква потребителят да въведе едно цяло изречение.
//
//Нека вашата програма прочете изречението и след това, ако започва с малка буква да я смени на голяма. Нека
//
// добави точка, ако изречението не завършва със символ за край на изречението -
//
// точка, удивителна или въпросителна.
package Lesson17_Exercise;

import java.util.Scanner;

public class CapitalizeString {
    public static void main(String[] args)

    {
        Scanner input = new Scanner(System.in);

        String sentence = input.nextLine();
        String fistLetter = sentence.substring(0, 1);
        fistLetter = fistLetter.toUpperCase();
        String remainingLetter = sentence.substring(1, sentence.length());
        sentence = fistLetter + remainingLetter;
        boolean isHavePoint = sentence.endsWith(".");
        boolean isHaveQuatationMark = sentence.endsWith("?");
        boolean isHaveUdivitelen = sentence.endsWith("!");
        if((isHavePoint == true) || (isHaveQuatationMark == true) || (isHaveUdivitelen == true))
        {
            System.out.println(sentence);
        }
        else
        {
            System.out.println(sentence + ".");
        }
    }
}
