package Lesson12_Strings;

public class SubStringFun {
  public static void main(String[] args)
  {
    String text = "Това си е едно цяло изречение!";
    System.out.println(text.split(" ").length);
    String greeting = "Hello, World!";
    String location = greeting.substring(7, 12);
    System.out.println(location);

  }
}
