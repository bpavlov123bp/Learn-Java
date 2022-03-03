import java.util.Scanner;
public class FitnessCard {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        double amount =input.nextDouble();
        String gender = input.next();
        int age = input.nextInt();
        String sport = input.next();
        double price = 0.0;
        switch(gender)
        {
            case "m":
                switch(sport)
                {
                    case "Gym":
                        price = 42.0;
                        break;
                    case "Boxing":
                        price = 41.0;
                        break;
                    case "Yoga":
                        price = 45.0;
                        break;
                    case "Zumba":
                        price = 34.0;
                        break;
                    case "Dances":
                        price = 51.0;
                        break;
                    case "Pilates":
                        price = 39.0;
                        break;
                }
                break;
            case "f":
                switch(sport)
                {
                    case "Gym":
                        price = 35.0;
                        break;
                    case "Boxing":
                        price = 37.0;
                        break;
                    case "Yoga":
                        price = 42.0;
                        break;
                    case "Zumba":
                        price = 31.0;
                        break;
                    case "Dances":
                        price = 53.0;
                        break;
                    case "Pilates":
                        price = 37.00;
                        break;
                }
                break;
        }
        if(age <= 19)
        {
            price -= price * 0.20;
        }
        if(amount >= price)
        {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        }
        else
        {
            System.out.printf("You don't have enough money! You need $%.2f more.", price - amount);
        }
    }
}
