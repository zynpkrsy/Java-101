import java.util.Scanner;

public class palindromSayi {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (reverseNumber == number) {
            System.out.println(number + " bir palindrom sayıdır.");
            return true;

        } else {
            System.out.println(number + " bir palindrom sayı değildir.");
            return false;
        }
    }

    public static void main(String[] args) {


        isPalindrom(247);

    }
}

