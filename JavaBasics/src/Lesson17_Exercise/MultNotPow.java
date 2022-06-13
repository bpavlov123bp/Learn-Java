//Сметнете x^y , като използвате умножение в цикъл, вместо съответната операция от Math класа.
//
//Потребителят трябва да въведе 2 int числа, а вие да отпечатате резултата от повдигането на степен.
//
//Първото въведено число е x, a второто - y.

package Lesson17_Exercise;

import java.util.Scanner;

public class MultNotPow {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int powNumber = input.nextInt();

        long result = 1;
        for(int i = 0; i < powNumber; i++)
        {
            result *= number1;
        }
        System.out.println(result);
    }
}
