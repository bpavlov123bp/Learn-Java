package Lesson14_Conditional;
import java.util.Scanner;
public class BinaryDigitCount {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int digit = input.nextInt();
    int bitwiseDigit = input.nextInt();
    int counter = 0;
    while(digit != 0)
    {
      int bitwiseNumber = digit % 2;
      if(bitwiseNumber == bitwiseDigit)
      {
        counter++;
      }
      digit = digit / 2;
    }
    System.out.println(counter);
  }
}
