import java.util.Scanner;
public class EasterDecoration {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int customers = input.nextInt();
        double basket = 1.50;
        double wreath = 3.80;
        double chocolateBunny = 7.0;
        double total = 0.0;
        double averageMoney = 0.0;
        double curentClientSum = 0.0;
        int count = 0;
        for(int i = 0; i < customers; i++)
        {
            String command = input.nextLine();
            while(!command.equalsIgnoreCase("Finish"))
            {
                if(command.equalsIgnoreCase("basket"))
                {
                    count++;
                    curentClientSum += basket;
                }
                else if(command.equalsIgnoreCase("wreath"))
                {
                    count++;
                    curentClientSum += wreath;
                }
                else if(command.equalsIgnoreCase("chocolate bunny"))
                {
                    count++;
                    curentClientSum += chocolateBunny;
                }
                command = input.nextLine();

            }
            if(count % 2 == 0)
            {
                curentClientSum *= 0.80;
            }
            System.out.printf("You purchased %d items for %.2f leva.\n", count, curentClientSum);
            total += curentClientSum;
            count = 0;
            curentClientSum = 0.0;
        }
        averageMoney = total / customers;
        System.out.printf("Average bill per client is: %.2f leva.", averageMoney);
    }
}
