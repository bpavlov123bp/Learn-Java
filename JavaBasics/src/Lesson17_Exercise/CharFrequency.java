//Направете програма, която очаква от потребителяt да въведе:
//
//Изречение
//Символ
//
//Нека вашата програма изчисли колко пъти въведения символ се среща в изреченито и да го отпечата на екрана.
//
//Метода str.charAt(i) връща символа от даденият стринг на позиция i.

package Lesson17_Exercise;

import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();

        char character  = input.next().charAt(0);

        int countCharacter = 0;

        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) == character)
            {
                countCharacter++;
            }
        }

        System.out.println(countCharacter);
    }
}
