package Lesson8_Mathematics;

//Напишете програма, която дефинира 2 double координати x и y
// и изчислява съответните им r и theta поларни координати:
//Задайте:
//
//x = 3
//y = 4
public class CartesianPolar {
    public static void main(String[] args)
    {
        double x = 3.0;
        double y = 4.0;
        double r = Math.sqrt(x * x + y * y);
        System.out.println("r     = " + r);
        double theta = Math.atan2(y, x);
        System.out.println("theta = " + theta);
    }
}
