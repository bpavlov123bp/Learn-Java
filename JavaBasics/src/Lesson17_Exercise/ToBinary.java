//Нека потребителят въведе цяло положително число.
//
//Тогава, използвайки цикъл, преобразувайте числото в двоичен вид и го разпечатайте на екрана,

// започвайки отзад напред.
//
//Например: числото 10 в двоичен вид е 1010. Вие обаче трябва да отпечатате 0101.

package Lesson17_Exercise;

import java.util.Scanner;

public class ToBinary {
    public static void main(String[] args) {
        {
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();

            //превръщане на десетично число в двоично
            String numberToBinary = Integer.toBinaryString(number);

            //съсздаване на масив от чарове да пази всеки елемент от двоичното число
            char[] chr = numberToBinary.toCharArray();

            //нова променлива, която ще пази двоичното число в обратен ред
            String reversed = "";

            //цикъл с който ще обходим всички елементи на масива от чарове на двоичното число
            for(int i = chr.length - 1; i >= 0; i--)
            {
                //на всяка итерация ще добавяме към числото на обратно по един чар.
                reversed += chr[i];
            }
            System.out.println(reversed);
        }
    }
}
