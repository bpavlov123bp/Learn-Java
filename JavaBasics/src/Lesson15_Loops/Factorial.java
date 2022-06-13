//Направете програма Factorial, която изчислява факториел на положително число въведено от конзолата.
//Потребителят може да въведе невалидно число (нула или отрицателно). Искайте да въведе число,
// докато не въведе положително.
//Ако не си спомняте от математиката:
//    Факториел на 3 = 3 * 2 * 1
//    Факториел на 50 = 50 * 49 * 48 … * 2 * 1
package Lesson15_Loops;
import java.util.Scanner;
public class Factorial {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    long factorial = 1;
    while(number <= 0)
    {
        number = input.nextInt();
    }
    do {
      factorial *= number;
      number--;
    }while(number > 0);
    System.out.println(factorial);
  }
}
