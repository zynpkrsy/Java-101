import java.util.Scanner;

public class chineseZodiac {
    public static void main(String[] args) {
        int birthYear;
        String sign = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Your birth year : ");
        birthYear = input.nextInt();

        switch (birthYear%12) {
            case 0:
                sign = "Monkey";
                break;
            case 1:
                sign = "Rooster";
                break;
            case 2:
                sign = "Dog";
                break;
            case 3:
                sign = "Pig";
                break;
            case 4:
                sign = "Mouse";
                break;
            case 5:
                sign = "Ox";
                break;
            case 6:
                sign = "Tiger";
                break;
            case 7:
                sign = "Rabbit";
                break;
            case 8:
                sign = "Dragon";
                break;
            case 9:
                sign = "Snake";
                break;
            case 10:
                sign = "Horse";
                break;
            case 11:
                sign = "Sheep";
                break;
        }

        System.out.print("Your Chinese zodiac sign is : " + sign);
    }
}
