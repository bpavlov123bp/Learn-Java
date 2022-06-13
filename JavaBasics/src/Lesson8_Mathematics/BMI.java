package Lesson8_Mathematics;

//Направете програма BMI, с която да изчислите моя Body Mass Index.
//
//Аз тежа 80кг и съм висок 171см.
//
//Отпечатайте моя BMI на екрана с помощта на System.out.println().
//
//Има ли надежда за мен или съм твърде дебел?
public class BMI {
    public static void main(String[] args)
    {
        double weight = 80.0;
        double height = 171.0;
        double heightInMeters = height / 100.0;
        double index = weight / (heightInMeters * heightInMeters);
        System.out.println(index);
    }
}
