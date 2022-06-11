import java.util.Scanner;

public class zodiacSign {
    public static void main(String[] args) {
        int month, day;
        String sign = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Your birth month : ");
        month = input.nextInt();

        System.out.print("Your birth day : ");
        day = input.nextInt();

        if ((month == 1) && (day >= 1) && (day <= 31)) {
            if (day < 22) {
                sign = "Capricorn" ;
            } else {
                sign = "Aquarius";
            }
        } else if ((month == 2) && (day >= 1) && (day <= 29)) {
            if (day < 20) {
                sign = "Aquarius";
            } else {
                sign = "Pisces";
            }
        } else if ((month == 3) && (day >= 1) && (day <= 31)) {
            if (day < 21) {
                sign = "Pisces";
            } else {
                sign = "Aries";
            }
        } else if ((month == 4) && (day >= 1) && (day <= 30)) {
            if (day < 21) {
                sign = "Aries";
            } else {
                sign = "Taurus";
            }
        } else if ((month == 5) && (day >= 1) && (day <= 31)) {
            if (day < 22) {
                sign = "Taurus";
            } else {
                sign = "Gemini";
            }
        } else if ((month == 6) && (day >= 1) && (day <= 30)) {
            if (day < 23) {
                sign= "Gemini";
            } else {
                sign = "Cancer";
            }
        } else if ((month == 7) && (day >= 1) && (day <= 31)) {
            if (day < 23) {
                sign = "Cancer";
            } else {
                sign = "Leo";
            }
        } else if ((month == 8) && (day >= 1) && (day <= 31)) {
            if (day < 23) {
                sign = "Leo";
            } else {
                sign = "Virgo";
            }
        } else if ((month == 9) && (day >= 1) && (day <= 30)) {
            if (day < 23) {
                sign = "Virgo";
            } else {
                sign = "Libra";
            }
        } else if ((month == 10) && (day >= 1) && (day <= 31)) {
            if (day < 23) {
                sign = "Lİbra";
            } else {
                sign = "Scorpio";
            }
        } else if ((month == 11) && (day >= 1) && (day <= 30)) {
            if (day < 22) {
                sign = "Scorpio";
            } else {
                sign = "Sagittarius";
            }
        } else if ((month == 12) && (day >= 1) && (day <= 31)) {
            if (day < 22) {
                sign = "Sagittarius";
            } else {
                sign= "Capricorn";
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.print("Invalid date!");
        } else {
            System.out.print("Your zodiac sign is : " + sign);
        }

    }
}