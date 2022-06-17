import java.util.Scanner;

public class haneToplama {
    public static void main(String[] args){

        int a, toplam = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        a = inp.nextInt();

        while (a != 0) {
            toplam += a % 10;
            a = a / 10;
        }
        System.out.print("Sayının Basamaklarının Toplamı : " + toplam);
    }
}

