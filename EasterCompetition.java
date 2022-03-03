import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        String maxName = "";

        for (int i = 1; i <= count; i++) {
            String name = scanner.nextLine();
            String input = scanner.nextLine();
            int result = 0;
            while (!input.equals("Stop")) {
                int grade = Integer.parseInt(input);
                result += grade;
                input = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", name, result);

            if (result > max) {
                max = result;
                maxName = name;
                System.out.printf("%s is the new number 1!%n", name);
            }

        }
        System.out.printf("%s won competition with %d points!", maxName, max);

    }
}