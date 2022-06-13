//Нека имаме следният масив:
//
//int[] myArray = { 1, 10, 15 };
//
//Напишете програма, която очаква потребителя да въведе 3 числа, които съхранявате в масив.
//
//Сверете дали елементите на въведения масив е същият,
// като myArray и ако е, отпечатайте “true”, в противен случай - “false”.
package Lesson18_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEquals {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] myArray = {1, 10, 15};
        int[] arr = new int[3];
        boolean isEquals = false;

        for(int i = 0; i < 3; i++)
        {
            arr[i] = input.nextInt();
        }

        Arrays.sort(myArray);
        Arrays.sort(arr);

        if(Arrays.equals(myArray, arr))
        {
            isEquals = true;
        }

        System.out.println(isEquals);
    }
}
