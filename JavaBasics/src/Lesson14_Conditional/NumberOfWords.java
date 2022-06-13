package Lesson14_Conditional;
//Да се отпечата “с думи” броя на думите във въведеното изречение на български език.
//Използване на String.split().length за да определите броят на думите.
//Ако са повече от 10 - просто отпечатва “твърде дълго изречение” (без кавичките)
import java.util.Scanner;
public class NumberOfWords {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();
    String[] words = sentence.split("\\s+");
    int count = words.length;
    String countInWord = "";
    switch(count)
    {
      case 1:
        countInWord = "едно";
        break;
      case 2:
        countInWord = "две";
        break;
      case 3:
        countInWord = "три";
        break;
      case 4:
        countInWord = "четири";
        break;
      case 5:
        countInWord = "пет";
        break;
      case 6:
        countInWord = "шест";
        break;
      case 7:
        countInWord = "седем";
        break;
      case 8:
        countInWord = "осем";
        break;
      case 9:
        countInWord = "девет";
        break;
      case 10:
        countInWord = "десет";
        break;
      default:
        System.out.println("твърде дълго изречение");
        break;
    }
    System.out.println(countInWord);
  }
}
