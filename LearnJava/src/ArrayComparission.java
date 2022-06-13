//Да се напише програма, която чете два масива от конзолата и проверява дали са еднакви

import java.util.Scanner;
public class ArrayComparission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputArrayOne = input.nextLine();
        String inputArrayTwo = input.nextLine();
        String[] inputOne = inputArrayOne.split(" ");
        String[] inputTwo = inputArrayTwo.split(" ");
        int [] arr1 = new int[inputOne.length];
        for(int i = 0; i < inputOne.length; i++)
        {
            arr1[i] = Integer.parseInt(inputOne[i]);
        }
        int[] arr2 = new int[inputTwo.length];
        for(int i = 0; i < inputTwo.length; i++)
        {
            arr2[i] = Integer.parseInt(inputTwo[i]);
        }
        int counterEqualElements = 0;
        boolean isEquals = true;
        if(arr1.length != arr2.length)
        {
            isEquals = false;
        }
        else
        {
            for(int i = 0; i < arr1.length; i++)
            {
                if(arr1[i] == arr2[i])
                {
                    counterEqualElements++;
                }
            }
            if(counterEqualElements == arr1.length)
            {
                isEquals = true;
            }
            else
            {
                isEquals = false;
            }
        }
        System.out.println(isEquals);
    }
}
