import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int weight;
        double height, bmi;

        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter your height in meter : ");
        height = inp.nextDouble();

        System.out.print("Please enter your weight : ");
        weight = inp.nextInt();

        bmi = weight / (height * height);

        System.out.print("Your BMI : " + bmi);

        }
    }