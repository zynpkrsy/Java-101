import java.util.Scanner;

public class yildizElmas {
    public static void main(String[] args){
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int x = n; x >= 0; x--) {
            for (int y = (n-x); y >= 0; y--) {
                System.out.print(" ");
            }
            for (int z = (2 * x - 1); z > 0; z--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
