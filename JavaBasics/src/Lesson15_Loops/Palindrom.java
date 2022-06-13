//Направете програма, която прочита дума от конзолата и проверява дали е палиндром.
//Игнорирайте малки-големи букви.
//Ако думата е палиндром, да отпечата true, в противен случай false.
//Палиндром е дума, която се чете еднакво отпред и отзад.
//Например следните думи са палиндроми: mom, radar, nikokin
package Lesson15_Loops;
import java.util.Locale;
import java.util.Scanner;
public class Palindrom {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String word = input.nextLine();
    String reverseWord = "";
    for(int i = word.length() - 1; i >= 0; i--)
    {
      reverseWord += word.charAt(i);
    }
    if(word.toLowerCase().equalsIgnoreCase(reverseWord))
    {
      System.out.println("true");
    }
    else
    {
      System.out.println("false");
    }
  }
}
