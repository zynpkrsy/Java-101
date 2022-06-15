import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args){
        int n, r, kombinasyon, nFaktoryel, rFaktoryel, n_rFaktoryel;

        Scanner inp = new Scanner(System.in);
        System.out.print("Eleman Sayısı : ");
        n = inp.nextInt();

        System.out.print("Alt Küme Eleman Sayısı : ");
        r = inp.nextInt();

        nFaktoryel = 1;
        rFaktoryel = 1;
        n_rFaktoryel = 1;


        if (n > r) {
            for (int i = 1; i <= n; i++) {
                nFaktoryel = nFaktoryel * i;
            }
            for (int x = 1; x <=r; x++) {
                rFaktoryel = rFaktoryel * x;
            }
            for (int y = 1; y <= (n-r); y++) {
                n_rFaktoryel = n_rFaktoryel * y;
            }
            kombinasyon = nFaktoryel / rFaktoryel * n_rFaktoryel;

            System.out.print("Kombinasyon : " + kombinasyon);
        } else {
            System.out.print("Hatalı değer girdiniz. Lütfen tekrar deneyin.");
        }




    }

}
