import java.util.Scanner;

public class advancedCalculator {
    static void plus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter? :");
        int counter = scan.nextInt();
        int number, result = 0;

        if (counter > 0) {
            for (int i = 1; i <= counter; i++) {
                System.out.print(i + ". number :");
                number = scan.nextInt();
                result += number;
            }
            System.out.println("Result : " + result);
        } else {
            System.out.print("You entered invalid number. Please try again.");
        }
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter? :");
        int counter = scan.nextInt();
        int number, result = 0;

        if (counter > 0) {
            for (int i = 1; i <= counter; i++) {
                System.out.print(i + ". number :");
                number = scan.nextInt();
                if (i == 1) {
                    result += number;
                } else {
                    result -= number;
                }
            }
            System.out.println("Result : " + result);
        } else {
            System.out.print("You entered invalid number. Please try again.");
        }
    }

    static void multiplication() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter? :");
        int counter = scan.nextInt();
        int number, result = 1;

        if (counter > 0) {
            for (int i = 1; i <= counter; i++) {
                System.out.print(i + ". number :");
                number = scan.nextInt();
                result *= number;

                if (number == 0) {
                    result = 0;
                    break;
                }
            }
            System.out.println("Result : " + result);
        } else {
            System.out.print("You entered invalid number. Please try again.");
        }
    }

    static void division() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter? :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        if (counter > 0) {
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You cannot divide with 0");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result : " + result);
    } else {
            System.out.print("You entered invalid number. Please try again.");
        }
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number :");
        int base = scan.nextInt();
        System.out.print("Enter the exponent :");
        int exponent = scan.nextInt();
        int result = 1;

        if (exponent > 0) {
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    } else {
            System.out.print("You entered invalid number. Please try again.");
        }
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = scan.nextInt();
        int result = 1;
        if (n > 0) {
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result : " + result);
    } else {
            System.out.print("You entered invalid number. Please try again.");
        }
    }

    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = scan.nextInt();
        int result = n % 10;
        System.out.println("Result : " + result);
    }

    static void rectangle(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1.Side length :");
        int a = scan.nextInt();
        System.out.print("Enter 2.Side length :");
        int b = scan.nextInt();
        int perimeter, area;
        if ((a > 0) && (b > 0)) {
            perimeter = (a + b) * 2;
            area = a *b ;
            System.out.println("Perimeter: " + perimeter);
            System.out.println("Area: " + area);
        }else {
            System.out.print("You entered invalid number. Please try again.");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Addition\n" + "2- Subtraction\n" + "3- Multiplication\n" + "4- Division\n" + "5- Expotential number\n" + "6- Factorial\n" + "7- Mod Calculation\n" + "8- Perimeter and Area of Rectangle\n" + "0- Exit";

        do {
            System.out.println(menu);
            System.out.print("Please enter a transaction :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid value. Please try again.");
            }
        } while (select != 0);


    }
}

