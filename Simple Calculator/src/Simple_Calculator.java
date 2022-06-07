import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        n1 = input.nextInt();

        System.out.print("Enter Second Number : ");
        n2 = input.nextInt();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.print("Your Selection : ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.print("Addition : " + (n1 + n2));
                break;
            case 2:
                System.out.print("Subtraction : " + (n1 - n2));
                break;
            case 3:
                System.out.print("Multiplication : " + (n1 * n2));
                break;
            case 4:
                switch (n2){
                    case 0:
                        System.out.println("Number can't be divided with 0");
                        break;
                    default: System.out.println("Result : "+ (n1 / n2));
                }
                break;
            default:
                System.out.print("Enter a valid number");

            }

        }
    }