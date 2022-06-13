//Проверка дали един масив е симетричен:
//Един масив е симетричен, ако първия елемент е равен на последния;
//втория елемент е равен на препоследни и т.н

import java.util.Scanner;
public class SymetricArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Задавене дължина на масива
        int n = input.nextInt();
        int[] array = new int[n];

        //въвеждане от клавиатурата елементите на масива
        for(int i = 0; i < n; i++)
        {
            array[i] = input.nextInt();
        }

        boolean isSymmetric =  true;

        //за да проверим дали масива е симетричен, обхождаме го само до средата
        for(int i = 0; i < (array.length + 1) / 2; i++)
        {

            //ако на определена итерция елементите не съвпадат променливата isSymmetric = false
            if(array[i] != array[n - i - 1])
            {
                isSymmetric = false;
            }
        }

        System.out.printf("Symmetric? %b%n", isSymmetric);
    }
}
