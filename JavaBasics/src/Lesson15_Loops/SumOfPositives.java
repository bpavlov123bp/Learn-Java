//Напишете програма, която събира въведените от потребителя числа, докато въведе 0
// или отрицателно число.
//Нека всеки път преди потребителят въведе число, да се отпечатва подканващ стринг
// "Въведете положително число: ". Потребителят трябва да може да въведе числото на същият ред, а не на следващ.
//Отпечатайте :
//    Сумата с точност до вторият знак след десетичната запетая.
//    Кое е най-голямото въведено число
//    Кое е най-малкото въведено число
//Помислете кой цикъл е най-добре да използвате? while, do-while или for?
package Lesson15_Loops;
import java.util.Scanner;
public class SumOfPositives {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    double number;
    double maxNumber = Double.MIN_VALUE;
    double minNumber = Double.MAX_VALUE;
    double sum = 0.0;
    while(true)
    {
      System.out.print("Въведете положително число: ");
      number = input.nextDouble();
      if(number <= 0)
      {
        break;
      }
      sum += number;
      if(number > maxNumber)
      {
        maxNumber = number;
      }
      if(number < minNumber)
      {
        minNumber = number;
      }
    }
    System.out.printf("%.2f\n", sum);
    System.out.println(maxNumber);
    System.out.println(minNumber);
  }
}
