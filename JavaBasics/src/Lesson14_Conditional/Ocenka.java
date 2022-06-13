package Lesson14_Conditional;
import java.util.Scanner;
import java.math.BigInteger;
public class Ocenka {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    /* int grade = input.nextInt();
    if(grade < 2 || grade > 6)
    {
      System.out.println("The grade is incorrect.");
    }
    else
    {
      System.out.println("The grade is correct!");
    }*/
    /*int chooseNumber = input.nextInt();
    switch(chooseNumber)
    {
      case 1:
        System.out.println("validate");
      case 2:
        System.out.println("compile");
      case 3:
        System.out.println("test");
      case 4:
        System.out.println("package");
      case 5:
        System.out.println("verify");
      case 6:
        System.out.println("install");
      case 7:
        System.out.println("deploy");
        break;
      default:
        System.out.println("error");
        break;

    }*/
    BigInteger number = new BigInteger("8");
    if(number.remainder(BigInteger.TWO) == BigInteger.ZERO)
    {
      System.out.println("The number is Even.");
    }
    else
    {
      System.out.println("The number is odd.");
    }
  }
}
