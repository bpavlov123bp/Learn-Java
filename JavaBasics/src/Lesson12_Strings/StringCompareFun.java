package Lesson12_Strings;

public class StringCompareFun {
  public static void main(String[] args)
  {
    String greeting = "Hello,World!";
    String location = greeting.substring(7, 12);
    System.out.println("World".equals(location));
    System.out.println("world".equalsIgnoreCase(location));
    System.out.println("Ivan".compareTo("Andrej"));
    System.out.println("Ivan".compareTo("Ivelin"));
    System.out.println("Ivan".compareTo("Ivan"));
  }
}
