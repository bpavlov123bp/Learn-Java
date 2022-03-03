import java.util.Scanner;
import java.math.*;
public class FoodForPets {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int days = input.nextInt();
        double food = input.nextDouble();
        int totalEatenFood = 0;
        int totalFoodDog = 0;
        int totalFoodCat = 0;
        double eatenFoodPercent = 0.0;
        double eatenDogPercent = 0.0;
        double eatenCatPercent = 0;
        double biscuit = 0.0;
        for(int i = 1; i <= days; i++)
        {
            int foodDog = input.nextInt();
            int foodCat = input.nextInt();
            totalFoodDog += foodDog;
            totalFoodCat += foodCat;
            if(i % 3 == 0)
            {
                double currentBiscuit = (foodDog + foodCat) * 0.10;
                biscuit += currentBiscuit;
            }
        }
        totalEatenFood = totalFoodCat + totalFoodDog;
        eatenFoodPercent = (totalEatenFood * 100.0) / food;
        eatenDogPercent = (totalFoodDog * 100.0) / totalEatenFood;
        eatenCatPercent = (totalFoodCat * 100.0) / totalEatenFood;
        System.out.println("Total eaten biscuits: " +  Math.round(biscuit) + "gr.");
        System.out.printf("%.2f%% of the food has been eaten.\n", eatenFoodPercent);
        System.out.printf("%.2f%% eaten from the dog.\n", eatenDogPercent);
        System.out.printf("%.2f%% eaten from the cat.\n", eatenCatPercent);

    }
}
