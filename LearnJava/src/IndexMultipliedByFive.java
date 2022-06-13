//Да се напише програм, която създава масив с 20 елемента от целочислен тип
//и инициализира всеки от елементите със стойност равна на елемента умножен по 5

public class IndexMultipliedByFive {
    public static void main(String[] args) {
        int[] array = new int[20];
        for(int i =0; i < 20; i++)
        {
            array[i] = i * 5;
        }
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
