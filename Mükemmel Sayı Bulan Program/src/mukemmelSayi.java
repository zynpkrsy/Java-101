import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number, multiplier = 1, total = 0;

        System.out.print("Sayı giriniz: ");
        number = input.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                multiplier = i;
                total += multiplier;
            }
        }
        if (number == total) {
            System.out.print(number + " bir mükemmel sayıdır.");
        } else {
            System.out.print(number + " bir mükemmel sayı değildir.");
        }
    }
}
