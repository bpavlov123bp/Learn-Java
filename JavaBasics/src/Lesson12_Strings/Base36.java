package Lesson12_Strings;
//Говорихме, че има различни бройни системи. Има двоична, осмична, десетична шестнадесетична… и.т.н.
//    Една доста интересна бройна система е 36-тичната. Защо? Защото съдържа всички цифри от 0 до 9, така и всички букви от английската азбука - A до Z.
//    Сега задачата ви е да направите програма, която показва как изглеждат числата в различните бройни системи.
//    Затова трябва да отпечатате числото 0x7DEDEDE1 в:
//    1. Двоичен формат (с представка 0b отпред)
//    2. Осмичен формат (с представка 0 отпред)
//    3. Десетичен формат
//    4. Шестнадесетичен формат (с представка 0x и ако има букви в числото, те да са малки)
//    5. 36-тично, като всички букви са главни.
public class Base36 {
  public static void main(String[] args)
  {
    String number = "0x7DEDEDE1";
    int numberInDecimal = Integer.decode("0x7DEDEDE1");
    number = Integer.toString(numberInDecimal, 2);
    System.out.println("0b" + number);
    number = Integer.toString(numberInDecimal, 8);
    System.out.println("0" + number);
    number = Integer.toString(numberInDecimal, 10);
    System.out.println(number);
    number = Integer.toString(numberInDecimal, 16).toLowerCase();
    System.out.println("0x" + number);
    number = Integer.toString(numberInDecimal, 36).toUpperCase();
    System.out.println(number);
  }
}
