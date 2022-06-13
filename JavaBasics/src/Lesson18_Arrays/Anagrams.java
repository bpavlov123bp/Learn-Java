//Направeте програма, която прочита две думи от конзолата и отпечатва true, ако те са анаграми и
// false, ако не са. Абстрахирайте се от големината на буквите.
//
// Анаграми са Java и Vaaj например. И двата стринга са съставени от едни и същи букви,
// които са в разбъркан ред.
//
//Подсказка: String.toCharArray() методът ще ви помогне да конвертирате стринга в масив от char елементи.
// За да може да сравните дали са еднакви, ще се наложи да ги подредите по един и същ ред.
//
//Не забравяйте един от най-добрите приятели на програмиста - не кучето, а класът Arrays.
// Той може да ви е от изключителна полза.
package Lesson18_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        boolean isAnagrams = true;
        if(str1.length() != str2.length())
        {
            isAnagrams = false;
        }
        char[] chr1 = str1.toCharArray();
        char[] chr2 = str2.toCharArray();
        Arrays.sort(chr1);
        Arrays.sort(chr2);
        if(Arrays.equals(chr1, chr2))
        {
            isAnagrams = true;
        }
        System.out.println(isAnagrams);
    }
}
