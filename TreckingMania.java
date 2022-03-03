import java.util.Scanner;
public class TreckingMania {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int groups = input.nextInt();
        int allPeople = 0;
        double percentMusala = 0.0;
        int peopleMusala = 0;
        double percentMonblan = 0.0;
        int peopleMonblan = 0;
        double percentKilimanjaro = 0.0;
        int peopleKilomanjaro = 0;
        double percentK2 = 0.0;
        int peopleK2 = 0;
        double percentEverest = 0.0;
        int peopleEverest = 0;
        for(int i = 1; i <= groups; i++)
        {
            int people = input.nextInt();
            allPeople += people;
            if(people <= 5)
            {
                peopleMusala += people;
            }
            else if(people >= 6 && people <= 12)
            {
                peopleMonblan += people;
            }
            else if(people >= 13 && people <= 25)
            {
                peopleKilomanjaro += people;
            }
            else if(people >= 26 && people <= 40)
            {
                peopleK2 += people;
            }
            else if(people >= 41)
            {
                peopleEverest += people;
            }
        }
        percentMusala = (peopleMusala * 100.0) / allPeople;
        percentMonblan = (peopleMonblan* 100.0) / allPeople;
        percentKilimanjaro = (peopleKilomanjaro * 100.0) / allPeople;
        percentK2 = (peopleK2 * 100.0) / allPeople;
        percentEverest = (peopleEverest * 100.0) / allPeople;
        System.out.printf("%.2f%%\n", percentMusala);
        System.out.printf("%.2f%%\n", percentMonblan);
        System.out.printf("%.2f%%\n", percentKilimanjaro);
        System.out.printf("%.2f%%\n", percentK2);
        System.out.printf("%.2f%%", percentEverest);
    }
}
