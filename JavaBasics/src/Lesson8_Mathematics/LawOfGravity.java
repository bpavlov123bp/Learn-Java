package Lesson8_Mathematics;

//Студент изпитва затруднения с изчисляването на резултата по следната формула:
// F = Gm1m2 / r * r.
// Но в неговата програма има проблем:
//public class LawOfGravity {
//  public static void main(String[] args) {
//    double G = 6.6742E-11;
//    double mass1 = 10;
//    double mass2 = 10;
//    double r = 2.3;
//    double force = G * mass1 * mass2 / r * r;
//    System.out.println(force);
//  }
//}
//Дайте правилното решение на програмата.
//
//Подсказка: май някъде трябва да се използват скоби!
public class LawOfGravity {
    public static void main(String[] args)
    {
        double G = 6.6742E-11;
        double mass1 = 10.0;
        double mass2 = 10.0;
        double r = 2.3;
        double force = (G * (mass1 * mass2)) / (r * r);
        System.out.println(force);
    }
}
