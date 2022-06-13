//Напишете програма, която сумира елементите на масив от цели числа и отпечатва резултата на екрана.
//
//Инициализирайте масива със следните числа:
//
//    -1
//    10
//    4.5
//    15
//    3.278
package Lesson18_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] arr = {-1, 10, 4.5, 15, 3.278};
        double sum = 0.0;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
