package Lesson8_Mathematics;

//Напишете програма, която изчислява разстоянието от точка (x,y) до (0,0) :
//Изберете следните стойности за x и y:
//x = 8.3
//y = 14.5
public class Distance {
    public static void main(String[] args)
    {
        double x = 8.3;
        double y = 14.5;
        double distance = Math.sqrt(x * x + y * y);
        System.out.println(distance);
    }
}
