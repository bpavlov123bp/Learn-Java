import java.util.Scanner;
import java.math.*;
public class PoolDay {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int countPeople = input.nextInt();
        double tax = input.nextDouble();
        double priceShezlong = input.nextDouble();
        double priceUmbrella = input.nextDouble();
        double totalTax = tax * countPeople;
        double totalShezlong = Math.ceil(countPeople * 0.75) * priceShezlong;
        double totalUmbrella = Math.ceil(countPeople * 0.50) * priceUmbrella;
        double total = totalTax + totalShezlong + totalUmbrella;
        System.out.printf("%.2f lv.", total);
    }
}
