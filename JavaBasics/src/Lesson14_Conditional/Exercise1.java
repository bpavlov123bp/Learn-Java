package Lesson14_Conditional;
import java.util.Scanner;
public class Exercise1 {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    if(number == 0)
    {
      System.out.println("The number is zero.");
    }
    else if(number < 0)
    {
      System.out.println("The number is negative.");
    }
    else if(number > 0)
    {
      System.out.println("The number is positive.");
    }
  }
}
