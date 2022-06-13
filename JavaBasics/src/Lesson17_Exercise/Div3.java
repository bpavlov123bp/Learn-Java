//Изпишете не екрана на конзолата числата от 1 до 40 включително, които се делят без остатък на 3.
//Нека всяко число, делящо се на 3, е отпечатано на отделен ред.
//Използвайте оператора %.
package Lesson17_Exercise;
import java.util.Scanner;
public class Div3 {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    for(int i = 1; i <= 40; i++)
    {
      if(i % 3 == 0)
      {
        System.out.println(i);
      }
    }
  }
}
