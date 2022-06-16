import java.util.Scanner;

public class usluSayi {
    public static void main(String[] args){
        int n, k;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kuvveti Alınacak Sayı : ");
        n = inp.nextInt();

        System.out.print("Kaçıncı Kuvvet : ");
        k = inp.nextInt();

        int total = 1;

        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.print("Cevap : " + total);

    }
}
