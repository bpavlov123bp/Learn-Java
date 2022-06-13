//Направете програма, която очаква от потребителя да въведе размер на триъгълник (0, 30]
// и го печата на екрана така:
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1
package Lesson15_Loops;
import java.util.Scanner;
public class PrintTriangle1 {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int side = input.nextInt();
    for(int i = side; i >= 1; i--)
    {
      for(int q = 1; q <= i; q++)
      {
        System.out.print(q + " ");
      }
      System.out.println();
    }
  }
}
