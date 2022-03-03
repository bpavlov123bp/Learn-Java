import java.util.Scanner;
public class FamallyTrip {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double budget = input.nextDouble();
        int countNights = input.nextInt();
        double priceNights = input.nextDouble();
        int percent = input.nextInt();
        if(countNights > 7)
        {
            priceNights -= priceNights * 0.05;
        }
        double totalPrice = countNights * priceNights;
        double percentExpenses = percent / 100.0;
        double total = totalPrice + (budget * percentExpenses);
        if(total <= budget)
        {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", (budget - total));
        }
        else
        {
            System.out.printf("%.2f leva needed.", (total - budget));
        }
    }
}
