import java.util.Scanner;

public class recursiveAsal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:  ");
        int number = input.nextInt();
        asal(number, 2);
    }

    static void asal(int number, int i) {
        if (i == number) {
            System.out.print(number + " asal sayıdır.");
            return;
        } else if (number % i == 0) {
            System.out.print(number + " asal sayı değildir.");
            return;
        }

        asal(number, i + 1);

    }
}
