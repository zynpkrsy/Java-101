import java.util.Scanner;

public class harmonikSayi {
    public static void main(String[] args){
        int n;
        double toplam = 0.00;

        Scanner inp = new Scanner(System.in);

        System.out.print("n Sayısını Giriniz : ");
        n = inp.nextInt();

        for (double i = 1; i <= n; i++){
            toplam += (1.0 / i);
        }
        System.out.print("Harmonik Toplam : " + toplam);

    }
}
