import java.util.Scanner;

public class recursiveUslu {
    static int result = 1;
    static int exp(int a, int b){
        if (a == 0){
            return 1;
        }

        result *= b;
        exp(a-1,b);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.println("Enter the number: ");
        a = input.nextInt();
        System.out.println("Enter the expotent: ");
        b = input.nextInt();

        System.out.println(exp(a,b));
}
