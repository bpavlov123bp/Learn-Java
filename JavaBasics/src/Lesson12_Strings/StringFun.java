package Lesson12_Strings;

public class StringFun {
  public static void main(String[] args)
  {
    String s;
    s = "The result is " + 5;
    System.out.println(s);
    int age = 3;
    s = "Току що пораснах! Станах на " + age + 1;
    System.out.println(s);
    String names = String.join(", ", "Peter", "Paul", "Mary");
    System.out.println(names);
    s = "А съм";
    s = s.concat(" ");
    s = s.concat("програмист");
    System.out.println(s);
    StringBuilder builder = new StringBuilder();
    builder.append("Тук са ").append(10).append(" студента");
    s = builder.toString();
    System.out.println(s);
  }
}
