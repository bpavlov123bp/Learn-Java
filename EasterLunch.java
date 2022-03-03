import java.util.Scanner;
public class EasterLunch {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int countCakes = input.nextInt();
        int countBoxEggs = input.nextInt();
        int kiloCookies = input.nextInt();
        double priceCakes = countCakes * 3.20;
        double priceBoxEggs = countBoxEggs * 4.35;
        double priceCookies = kiloCookies * 5.40;
        double colorEggs = (countBoxEggs * 12) * 0.15;
        double total = priceCakes + priceBoxEggs + priceCookies + colorEggs;
        System.out.printf("%.2f", total);
    }
}
