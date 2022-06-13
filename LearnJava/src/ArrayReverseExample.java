import java.util.Arrays;

//Ще обърнем елементите на масива, като използваме помощен масив, като
//запазим елементите на първия, но в обратен ред
public class ArrayReverseExample {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5};

        //взимане размера на масива
        int length = array.length;

        //деклариране на нов масив
        int[] reversed = new int[length];

        //инициализиране на елементите на новия масив
        for(int index = 0; index < length; index++)
        {
            reversed[length - index - 1] = array[index];
        }

        //отпечатване на новия масив
        System.out.println(Arrays.toString(reversed));
    }
}
