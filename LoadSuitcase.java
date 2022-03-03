import java.util.Scanner;
public class LoadSuitcase {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double volume = input.nextDouble();
        String command = input.next();
        double currentVolume = 0.0;
        int count = 0;
        while (!command.equalsIgnoreCase("end"))
        {
            currentVolume = input.nextDouble();
            if((count + 1) % 3 == 0)
            {
                currentVolume *= 1.1;
            }
            if(volume < currentVolume)
            {
                System.out.println("No more space!");
                break;
            }
            volume -= currentVolume;
            command = input.next();
            count++;
        }
        if(command.equalsIgnoreCase("end"))
        {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", count);
    }
}
