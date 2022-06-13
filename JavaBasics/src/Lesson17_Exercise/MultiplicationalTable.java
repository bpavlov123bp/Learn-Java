//Вашата програма очаква от потребителя да въведе число.
// След това отпечатва таблица за умножението на това число със всички числа от 1 до 10.
//

package Lesson17_Exercise;

import java.util.Scanner;

public class MultiplicationalTable {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for(int i = 1; i <= 10; i++)
        {
            System.out.printf("%d * %d = %d\n", number, i, number * i);
        }
    }
}
