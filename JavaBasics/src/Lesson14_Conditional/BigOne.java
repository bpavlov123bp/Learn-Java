package Lesson14_Conditional;
//Напишете програма, която прочита 2 числа със запетая от конзолата и печата кое е по-голямото.
//
//Отпечатаният резултат трябва да съдържа само числото без никакви допълнителни пояснения.
//
//Например: “резултатът е 10” e невалидно.
import java.util.Scanner;
public class BigOne {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    double number1 = input.nextDouble();
    double number2 = input.nextDouble();
    double max = -1000000000.0;
    if(number1 > max)
    {
      max = number1;
    }
    if(number2 > max)
    {
      max = number2;
    }
    System.out.println(max);
  }
}
