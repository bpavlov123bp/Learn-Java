//Направете програма, която очаква от потребителя да въведе изречение.
//
//След въвеждане на изречението,
// вашата програма трябва да премахне всички празни символи и табулация
// от изречението и да го отпечата на екрана.

package Lesson17_Exercise;

import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String word = sentence.replaceAll("\\s+", "");
        System.out.println(word);
    }
}
