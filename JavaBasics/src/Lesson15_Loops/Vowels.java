//Направете програма Vowels, която прочита изречение (на английски) от конзолата
// и отпечатва колко гласни има в него.
//Дължината на String можете да вземете чрез метода String.length(),
//например: "hello world".length(). А за да вземете първият символ от стринга,
//ползвайте "hello world".charAt(0)
package Lesson15_Loops;
import java.util.Locale;
import java.util.Scanner;
public class Vowels {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String sentence = input.nextLine().toLowerCase();
    int count = 0;
    for(int i = 0; i < sentence.length(); i++)
    {
      char ch = sentence.charAt(i);
      if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y')
      {
        count++;
      }
    }
    System.out.println(count);
  }
}
