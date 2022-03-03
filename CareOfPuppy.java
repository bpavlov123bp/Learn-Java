import java.io.PrintStream;
import java.util.Scanner;
public class CareOfPuppy {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int foodInKilograms = input.nextInt();
        int foodInGrams = foodInKilograms * 1000;
        int allFood = 0;
        String command = input.nextLine();
        while(true)
        {
            command = input.nextLine();
            if(command.equalsIgnoreCase("adopted"))
            {
                break;
            }
            allFood += Integer.parseInt(command);
        }
        if(allFood <= foodInGrams)
        {
            System.out.println("Food is enough! Leftovers: " + (foodInGrams - allFood) + " grams.");
        }
        else
        {
            System.out.println("Food is not enough. You need " + (allFood - foodInGrams) + " grams more.");
        }
    }
}
