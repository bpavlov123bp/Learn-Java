//Направете програма, която очаква от потребителя да въведе размер на триъгълник (0, 30]
// и го печата на екрана така:
//# # # # # #
//  # # # # #
//    # # # #
//      # # #
//        # #
//          #
package Lesson15_Loops;
import java.util.Scanner;
public class PrintTriangle2 {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int side = input.nextInt();
    for(int i = side; i > 0; i--)
    {
      for(int j = 2 * (side - i); j > 0; j--)
      {
          System.out.print(" ");
      }
      for(int p = 0; p < i; p++)
      {
        System.out.print("# ");
      }
      System.out.println();
    }
  }
}

