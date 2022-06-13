package Lesson10_Logical;

//Напишете програма, в която дефинирате 2 int променливи - month & day.
//Програмата трябва да отпечатва true, ако денят е между 20-ти март (включително) и 20-ти юни (включително)
// и false, в противен случай.
//Нека:
//month = 5
//day = 1
public class SpringSeason {
    public static void main(String[] args)
    {
        int month = 4;
        int day = 31;
        switch(month)
        {
            case 1:
            case 2:
                System.out.println("false");
                break;
            case 3:
                if (day >= 20) {
                    System.out.println("true");
                }
                else {
                    System.out.println("false");
                }
                break;
            case 4:
            case 5:
                System.out.println("true");
                break;
            case 6:
                if (day <= 20) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("false");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
