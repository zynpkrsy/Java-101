import java.util.Scanner;

public class zodiacSign {
    public static void main(String[] args) {
        int month, day;

        Scanner input = new Scanner(System.in);

        System.out.print("Your birth month : ");
        month = input.nextInt();

        System.out.print("Your birth day : ");
        day = input.nextInt();

        if ((month == 1) && (day >= 1) && (day <= 31)) {
            if (day < 22) {
                System.out.print("Your zodiac sign is Capricorn");
            } else {
                System.out.print("Your zodiac sign is Aquarius");
            }
        } else if ((month == 2) && (day >= 1) && (day <= 29)) {
            if (day < 20) {
                System.out.print("Your zodiac sign is Aquarius");
            } else {
                System.out.print("Your zodiac sign is Pisces");
            }
        } else if ((month == 3) && (day >= 1) && (day <= 31)) {
            if (day < 21) {
                System.out.print("Your zodiac sign is Pisces");
            } else {
                System.out.print("Your zodiac sign is Aries");
            }
        } else if ((month == 4) && (day >= 1) && (day <= 30)) {
            if (day < 21) {
                System.out.print("Your zodiac sign is Aries");
            } else {
                System.out.print("Your zodiac sign is Taurus");
            }
        } else if ((month == 5) && (day >= 1) && (day <= 31)) {
            if (day < 22) {
                System.out.print("Your zodiac sign is Taurus");
            } else {
                System.out.print("Your zodiac sign is Gemini");
            }
        } else if ((month == 6) && (day >= 1) && (day <= 30)) {
            if (day < 23) {
                System.out.print("Your zodiac sign is Gemini");
            } else {
                System.out.print("Your zodiac sign is Cancer");
            }
        } else if ((month == 7) && (day >= 1) && (day <= 31)) {
            if (day < 23) {
                System.out.print("Your zodiac sign is Cancer");
            } else {
                System.out.print("Your zodiac sign is Leo");
            }
        } else if ((month == 8) && (day >= 1) && (day <= 31)) {
            if (day < 23) {
                System.out.print("Your zodiac sign is Leo");
            } else {
                System.out.print("Your zodiac sign is Virgo");
            }
        } else if ((month == 9) && (day >= 1) && (day <= 30)) {
            if (day < 23) {
                System.out.print("Your zodiac sign is Virgo");
            } else {
                System.out.print("Your zodiac sign is Libra");
            }
        } else if ((month == 10) && (day >= 1) && (day <= 31)) {
            if (day < 23) {
                System.out.print("Your zodiac sign is Libra");
            } else {
                System.out.print("Your zodiac sign is Scorpio");
            }
        } else if ((month == 11) && (day >= 1) && (day <= 30)) {
            if (day < 22) {
                System.out.print("Your zodiac sign is Scorpio");
            } else {
                System.out.print("Your zodiac sign is Sagittarius");
            }
        } else if ((month == 12) && (day >= 1) && (day <= 31)) {
            if (day < 22) {
                System.out.print("Your zodiac sign is Sagittarius");
            } else {
                System.out.print("Your zodiac sign is Capricorn");
            }
        } else {
            System.out.print("Invalid date!");
        }

    }
}