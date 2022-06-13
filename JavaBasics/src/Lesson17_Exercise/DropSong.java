//Направете програма, която очаква потребителят да въведе някакво число.
//
//След това ако числото се дели:
//
// на 3 - отпечатва “Пльок”
// на 5 - “Пляс”
// на 7 - “Пльос”
//
//Ако не се дели на нито едно от горните, се печата въведеното число. Въвеждането е в цикъл и
//продължава докато потребителят въведе числото 0.
//
//При 0 трябва да отпечатате “Пльок Пляс Пльос” - защото 0 се дели без остатък на всички числа.
//
//Примери: 28 се дели на 1, 2, 4, 7, 14, 28 - значи печатаме “Пльос”
// 30 се дели на 1, 2, 3, 5, 6, 10, 15, 30 - печатаме “Пльок Пляс”
// 34 се дели 1, 2, 17 и 34, така че просто отпечатваме “34”
package Lesson17_Exercise;

import java.util.Scanner;

public class DropSong {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number;

        String str = "";

        String strZero = "";

        while(true)

        {
            number = input.nextInt();

            if(number == 0)
            {
                strZero += "Пльок Пляс Пльос";
                break;
            }

            if(number % 3 == 0)
            {
                str += "Пльок ";
            }

            if(number % 5 == 0)
            {
                str += "Пляс ";
            }

            if(number % 7 == 0)
            {
                str += "Пльос";
            }

            else if((number % 3 != 0) && (number % 5 != 0) && (number % 7 != 0))
            {
                str += String.valueOf(number);
            }
        }

        System.out.println(str);

        System.out.println(strZero);
    }
}
