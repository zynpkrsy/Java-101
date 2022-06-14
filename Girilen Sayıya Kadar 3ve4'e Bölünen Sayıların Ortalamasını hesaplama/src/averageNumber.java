import java.util.Scanner;

public class averageNumbers {
    public static void main(String[] args) {
        int k, toplam = 0, sayiAdedi = 0;
        double ortalama;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        k = inp.nextInt();

        for (int i = 1; i <= k; i++) {
            if ((i%3 == 0) || (i%4 == 0)) {
                toplam += i;
                sayiAdedi++;
                System.out.println(i);
            }
        }

        ortalama = toplam / sayiAdedi;
        System.out.print("3 ve 4'e tam bölünen sayıların ortalaması : " + ortalama);
    }
}

