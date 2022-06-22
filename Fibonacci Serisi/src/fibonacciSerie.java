import java.util.Scanner;

public class fibonacciSerie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = input.nextInt();

        int x = 0;
        int y = 1;
        int z;

        System.out.print(x + " ");
        System.out.print(y + " ");


        for (int i = 3; i <= n; i++) {
            z = x + y;
            System.out.print(z + " ");
            x = y;
            y = z;

        }


    }
}
