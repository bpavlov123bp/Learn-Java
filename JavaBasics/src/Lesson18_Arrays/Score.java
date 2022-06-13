//Напишете програма, която подканва потребителя да въведе брой на състезателите
// и след това да въведе техния резултат в секунди и се записват в масив.
//
//Отпечатва:
//
//    Всички резултати
//    Най-бързия
//    Най-бавния
//    Средно аритметично (avg)
//    Стандартно отклонение (standard deviation). За помощ:
//        сд1 = сумата от всички ( (елемент - avg) на квадрат)
//        сд = корен квадратен ( сд1 / броя на елементите)
//
//Изкараният резултат трябва да е подобен на този в даденият пример!
package Lesson18_Arrays;

import java.util.Scanner;

public class Score {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Моля въведете брой на играчите: ");
        int countPlayers = input.nextInt();
        double[] scores = new double[countPlayers];

        for(int i = 0; i < countPlayers; i++)
        {
            System.out.print("Въведете резултат №" + i + ": ");
            scores[i] = input.nextDouble();
        }

        double sum = 0.0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double average = 0.0;

        for(int q = 0; q < scores.length; q++)
        {
            sum += scores[q];
            if(scores[q] > max)
            {
                max = scores[q];
            }
            if(scores[q] < min)
            {
                min = scores[q];
            }
            average = sum / countPlayers;
        }

        double standardDeviation1 = 0.0;
        double standardDeviation = 0.0;

        for(double stdDev : scores)
        {
            standardDeviation1 += Math.pow(stdDev - average, 2);
            standardDeviation = Math.sqrt(standardDeviation1 / countPlayers);
        }

        System.out.printf("Min\t\t= %.3f\n", min);
        System.out.printf("Max\t\t= %.3f\n", max);
        System.out.printf("Average\t= %.3f\n", average);
        System.out.printf("StdDev\t= %.3f\n", standardDeviation);
    }
}
