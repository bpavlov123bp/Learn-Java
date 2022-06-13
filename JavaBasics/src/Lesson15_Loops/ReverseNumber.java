//Направете програма, която печата цифрите на въведено от конзолата цяло число в обратен ред.
//Ако числото е отрицателно - просто игнорирайте знака.
//Подсказка: Нека имаме числото 456.
//    Ако вземем остатъка от делене на числото 456 на 10, ще получим 6
//    Ако вземем остатъка от делене на числото 45 на 10, ще получим 5
//    Ако вземем остатъка от делене на числото 4 на 10, ще получим 4
//
//Ако отпечатваме с print, вместо print всяка цифра, която отпечатваме, ще е на същият ред.
package Lesson15_Loops;
import java.util.Scanner;
public class ReverseNumber {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    int reversedNumber = 0;
    if(number < 0)
    {
      number = Math.abs(number);
    }
    while(number != 0)
    {
      int remainder = number % 10;
      reversedNumber = reversedNumber * 10 + remainder;
      number = number / 10;
    }
    System.out.print(reversedNumber);
  }
}
