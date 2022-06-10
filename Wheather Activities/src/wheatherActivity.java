import java.util.Scanner;

public class wheatherActivity {
    public static void main(String[] args) {
        //This program suggests different activities for different wheather conditions.

        int temperature;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature : ");
        temperature = input.nextInt();

        if (temperature < 5) {
            System.out.println("You can go to ski.");
        }
        if ((temperature >= 5) && (temperature <= 15)) {
            System.out.println("You can go to cinema.");
        }
        if ((temperature >= 15) && (temperature <= 25)) {
            System.out.println("You can go to picnic.");
        }
        if (temperature > 25) {
            System.out.println("You can go to swimming.");
        }
    }
}