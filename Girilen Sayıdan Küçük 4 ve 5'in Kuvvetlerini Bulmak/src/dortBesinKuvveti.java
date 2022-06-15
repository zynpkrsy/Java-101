import java.util.Scanner;

public class dortBesinKuvveti {
    public static void main(String[] args) {
        int n, toplam = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        n = inp.nextInt();

        System.out.println(n + " Sayısından küçük 4'ün kuvvetleri");
        for (int i = 1; i <= n; i *= 4 ){
            System.out.println(i);

        }
        System.out.println(n + " Sayısından küçük 5'in kuvvetleri");
        for (int i = 1; i <= n; i*= 5){
            System.out.println(i);
        }
    }
}