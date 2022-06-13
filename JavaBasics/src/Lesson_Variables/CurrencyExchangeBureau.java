package Lesson_Variables;

//Имате поръчка да направите софтуер, който обслужва чейндж бюро на летището.
// Бюрото работи само с левове, долари и евро.
// Дефинирайте еднозначно какви променливи можете да имате и от какъв тип ще бъдат.
public class CurrencyExchangeBureau {
  public static void main(String[] args)
  {
    double levaQuantity = 20.5;
    double euroQuantity = 12.5;
    double dollarQuantity = 30.7;
    System.out.printf("You have %.2f leva.\n", levaQuantity);
    System.out.printf("You have %.2f euro.\n", euroQuantity);
    System.out.printf("You have %.2f dollars.\n", dollarQuantity);
  }
}
