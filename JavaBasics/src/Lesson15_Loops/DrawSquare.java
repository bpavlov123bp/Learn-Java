//Направете програма, която очаква от потребителя да въведе размер на квадрат (0, 30]
// и го печата на екрана така:
//# # # #
//# # # #
//# # # #
//# # # #
package Lesson15_Loops;
import java.util.Scanner;
public class DrawSquare {
  public static void main(String[] args)
  {
    Scanner input= new Scanner(System.in);
    int size = input.nextInt();
    for(int i = 1; i <= size; i++)
    {
      for(int q = 1; q <= size; q++)
      {
        System.out.print("# ");
      }
      System.out.println();
    }
  }
}
