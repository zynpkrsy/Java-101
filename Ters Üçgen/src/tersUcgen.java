import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz :");
        int n = klavye.nextInt();

        for (int x = n; x >= 0; x--) {
            for (int y = (n - x); y >= 0; y--) {
                System.out.print(" ");
            }
            for (int z = (2 * x - 1); z > 0; z--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
