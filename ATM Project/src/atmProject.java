import java.util.Scanner;

public class atmProject {
    public static void main(String[] args) {
        String userName, password, answer;
        Scanner input = new Scanner(System.in);
        int trial = 3;
        int balance = 1500;
        int select;
        int price;
        while (trial > 0) {
            System.out.print("Username :");
            userName = input.nextLine();
            System.out.print("Password :");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Hello, Welcome to the Kodluyoruz Bank!");
                do {
                    System.out.println("1-Deposit\n" +
                            "2-Withdraw\n" +
                            "3-Balance Inquiry\n" +
                            "4-Exit");
                    System.out.print("Please select a transaction : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Enter amount : ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Enter amount : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient balance.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Balance : " + balance);
                            break;
                        case 4:
                            System.out.println("See you next time.");
                            break;
                    }
                } while (select != 4);
                break;
            } else {
                trial--;
                System.out.println("Invalid username or password. Try again.");
                if (trial == 0) {
                    System.out.println("Your account is blocked. Please contact with the bank.");
                } else {
                    System.out.println("Remaining trials : " + trial);
                }
            }
        }
    }
}