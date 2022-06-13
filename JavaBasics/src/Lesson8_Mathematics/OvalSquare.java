package Lesson8_Mathematics;

//Направете програма, която изчислява лице на окръжност.
//Дефинирайте променлива r със стойност 10.3. Какъв ще бъде типът на променливата?
//А сега дефинирайте променлива area - тя ще съдържа резултата.
//Нека присвоим на area лицето на окръжността с дадения по-горе радиус.
//Отпечатайте променливата area на екрана със System.out.println().
public class OvalSquare {
    public static void main(String[] args)
    {
        double r = 10.3;
        double area = Math.PI * r * r;
        System.out.println(area);
    }
}
