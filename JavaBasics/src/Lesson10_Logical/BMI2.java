package Lesson10_Logical;

//Направете програма BMI, с която да изчислите моя Body Mass Index.
//Аз тежа 80кг и съм висок 171см.
//Ако съм съм надвишил малко теглото и съм Overweight напишете на екрана more
// training, less eating, ако не съм - напишете you rock!
public class BMI2 {
    public static void main(String[] args)
    {
        double weight = 80.0;
        double height = 171.0;
        double heightInMeters = height / 100.0;
        double index = weight / (heightInMeters * heightInMeters);
        if(index < 25.0)
        {
            System.out.println("You rock!");
        }
        else if(index >= 25.0)
        {
            System.out.println("more training, less eating");
        }
    }
}
