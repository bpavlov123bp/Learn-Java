package Lesson_Variables;
//Дефинирайте променлива със стойност 10 000 000 000 000 000 000.
// Изведете променливата на екрана със System.out.println().
import java.math.BigInteger;
public class TypeOf10Big {
  public static void main(String[] args)
  {
    BigInteger digit = new BigInteger("10000000000000000000");
    System.out.println(digit);
  }
}
