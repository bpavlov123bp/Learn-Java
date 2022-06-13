//Напишете програма, която намира максимална редицаот последователни еднакви елементи
//пример: {2, 1, 1, 2, 3, 3, 2, 2, 2, 1} -> {2, 2, 2}

import java.util.Scanner;
public class LongestSeqOfEqualElements {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //създавамеедна променлива от тип стринг за числата които ще въвеждаме
        String n = input.nextLine();

        //създаваме масив от стрингове, който ще пази числата, които сме въвели в една линия,
        // разделени със спейс
        String[] numbers = n.split("\\s+");

        //създаваме масив от интове, който е дължина масива от стрингов
        int[] nums = new int[numbers.length];

        //с for цикъл прехвърляме числата въведени с масива от тип Strng в масива от тип Int
        for(int i = 0; i < numbers.length; i++)
        {
            nums[i] = Integer.parseInt(numbers[i]);
        }
        //въвеждаме променлива counter, която я инициализирамем с 1
        int counter = 1;
        int theMost = 0;
        int element = 0;

        //а цикъл for обхождаме елементите на масива от интове nums
        for (int i = 0 ; i < nums.length - 1; i++)
        {
            if (nums[i] == nums[i + 1])
            {
                counter++;
            }
            else
            {
                counter = 1;
            }
            if (counter > theMost)
            {
                theMost = counter;
                element = nums[i];
            }
        }
        for (int j = 1; j <= theMost; j++)
        {
            System.out.print(element + " ");;
        }
    }
}
