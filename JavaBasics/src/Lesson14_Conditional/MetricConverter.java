package Lesson14_Conditional;
//Нека напишем програма, която конвертира между 8 метрични единици: m, mm, cm, mi, in, km, ft, yd.
//Ето таблицата за конвертиране на 1 meter (m):
//    1000 millimeters (mm)
//    100 centimeters (cm)
//    0.000621371192 miles (mi)
//    39.3700787 inches (in)
//    0.001 kilometers (km)
//    3.2808399 feet (ft)
//    1.0936133 yards (yd)
//Програмата трябва да очаква от потребителя да въведе следните данни:
//    дължината, която трябва да се конвертира
//    нейната метрична единица
//    към коя метрична единица да се конвертира
import java.util.Scanner;
public class MetricConverter {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    double metric = Double.parseDouble(input.nextLine());
    String inputMetric = input.nextLine();
    String outputMetric = input.nextLine();
    double result = 0.0;
    switch(inputMetric)
    {
      case "mm":
        metric = metric / 1000.0;
        break;
      case "cm":
        metric = metric / 100.0;
        break;
      case "mi":
        metric = metric / 0.000621371192;
        break;
      case "in":
        metric = metric / 39.3700787;
        break;
      case "km":
        metric = metric / 0.001;
        break;
      case "ft":
        metric = metric / 3.2808399;
        break;
      case "yd":
        metric = metric / 1.0936133;
        break;
      default:
        System.out.println("error");
        break;
    }
    switch (outputMetric)
    {
      case "mm":
        metric = metric * 1000.0;
        break;
      case "cm":
        metric = metric * 100.0;
        break;
      case "mi":
        metric = metric * 0.000621371192;
        break;
      case "in":
        metric = metric * 39.3700787;
        break;
      case "km":
        metric = metric * 0.001;
        break;
      case "ft":
        metric = metric * 3.2808399;
        break;
      case "yd":
        metric = metric * 1.0936133;
        break;
      default:
        System.out.println("error");
        break;
    }
    System.out.printf("%.5f", metric);
  }
}