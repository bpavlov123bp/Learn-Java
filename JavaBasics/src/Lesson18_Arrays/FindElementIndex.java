//Нека имаме следният масив:
//
//int[] myArray = { 1, 4, 6, 2, 10, 5 };
//
//Напишете програма, която очаква потребителят да въведе число и
// след това намира на кой индекс се намира това число в дадения масив.
//
//Ако числото не е в масива, нека програмата отпечата -1.
package Lesson18_Arrays;

import java.util.Scanner;

public class FindElementIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = {1, 4, 6, 2, 10, 5};
        int number = input.nextInt();
        int arrIndex = -1;
        for(int i = 0; i < myArray.length; i++)
        {
            if(myArray[i] == number)
            {
                arrIndex = i;
            }
        }
        System.out.println(arrIndex);
    }
}
