package Lesson8_Mathematics;

//Напишете програма SumOfSines, в която дефинирате променлива t (в градуси) и изчислява резултата от:
//sin(2t) + sin(3t)
//Използвайте функцията Math.sin().
//Внимание, в условието има уловка! Прочетете внимателно документацията на Math.sin()!
//Изберете t = 20 градуса.
//Отпечатайте решението на екрана с помощта на System.out.println()
public class SumOfSines {
  public static void main(String[] args)
  {
      double t = 20.0;
      double tInRadians = Math.toRadians(t);
      double d = Math.sin(2 * tInRadians) + Math.sin(3 * tInRadians);
      System.out.println(d);
  }
}
