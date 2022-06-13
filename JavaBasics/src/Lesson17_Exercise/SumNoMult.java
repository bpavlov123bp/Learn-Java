//Пресметнете х*y като използвате операцията събиране в цикъл, а не умножение.
//
//Потребителят трябва да въведе 2 int числа, а вие да отпечатате резултата от умножението.
//
//Първото въведено число е x, a второто - y.

package Lesson17_Exercise;

import java.util.Scanner;

public class SumNoMult {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int product = 0;

        for(int i = 1; i <= number2; i++)
        {
            product += number1;
        }

        System.out.println(product);
    }
}
