import java.util.Scanner;

public class sinifGecme {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik, toplamNot = 0, toplamDers = 0;
        double ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        mat = input.nextInt();
        if ((mat >= 0) && (mat <= 100)) {
            toplamNot += mat;
            toplamDers++;
        }

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        if ((fizik >= 0) && (fizik <= 100)) {
            toplamNot += fizik;
            toplamDers++;
        }

        System.out.print("T�rk�e notunuzu giriniz : ");
        turkce = input.nextInt();
        if ((turkce >= 0) && (turkce <= 100)) {
            toplamNot += turkce;
            toplamDers++;
        }

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        if ((kimya >= 0) && (kimya <= 100)) {
            toplamNot += kimya;
            toplamDers++;
        }

        System.out.print("M�zik notunuzu giriniz : ");
        muzik = input.nextInt();
        if ((muzik >= 0) && (muzik <= 100)) {
            toplamNot += muzik;
            toplamDers++;
        }

        ortalama = toplamNot / toplamDers;

        if (ortalama >= 55) {
            System.out.println("S�n�f� ge�tiniz.");
        } else {
            System.out.println("S�n�fta kald�n�z.");
        }
        System.out.print("Ortalaman�z : " + ortalama);
    }
}