package Lesson12_Strings;

public class NumberConvertFun {
  public static void main(String[] args)
  {
    int iNumber = 15;
    double dNumber = 888723.32;
    String s = String.valueOf(dNumber);
    System.out.println(s);
    s = Integer.toString(iNumber, 16);
    System.out.println(s);
    long lNumber = Long.parseLong("131313131313");
    System.out.println(lNumber + 1);
    int x = Integer.decode("0xFF");
    System.out.println(x);
  }
}
