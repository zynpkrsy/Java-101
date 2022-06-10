import java.util.Scanner;

public class userEntry {
    public static void main(String[] args) {

       String userName, password, answer, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Your Username : ");
        userName = input.nextLine();

        System.out.print("Your Password : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("You are logged in");
        } else if (userName.equals("patika") && !password.equals("java123")) {
            System.out.println("Your information is incorrect");
            System.out.print("Do you want to reset your password? (yes/no) : ");
            answer = input.nextLine();
            if (answer.equals("yes")) {
                System.out.print("Enter new password : ");
                newPassword = input.nextLine();
                while (newPassword.equals("java123") || newPassword.equals(password)) {
                    System.out.print("Password cannot be created. Enter a different password : ");
                    newPassword = input.nextLine();
                }
                System.out.println("New password created");

            } else if (answer.equals("no")) {
                System.out.print("Please refresh the page to try again");
              }
        } else {
            System.out.println("Your information is incorrect. Refresh the page to try again.");
        }

    }
}
