//Направете програма, която очаква от потребителя да въведе число.
// След това проверява дали числото е просто и отпечатва true, ако е, false, ако не е.
//
//Простото число може да се дели само на 1 и на себе си.
//
// Ако се дели на което и да е друго цяло число, тогава не е просто.
//
//Подсказка: ако имате числото 77, тогава то определено няма как да се дели на числото 38 (= 77 / 2) или по-голямо.
package Lesson17_Exercise;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //използваме стойността на евентуалния делител на числото number. В началото я инициализираме с 2.
        int devider = 2;

        //maxDevider е максималния възможен делител, който е равен на корен квадратен от числото number
        int maxDevider = (int)Math.sqrt(number);

        boolean isPrime = true;

        //при преминаване през цикъл, ако се окаже, че числото има делител, стойността на isPrime = false
        while(isPrime && (devider <= maxDevider))
        {
            if(number % devider == 0)
            {
                isPrime = false;
            }
            devider++;
        }

        System.out.println(isPrime);
    }
}
