import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int armutKg, elmaKg, domatesKg, muzKg, patlicanKg;
        double armutBirim = 2.14, elmaBirim = 3.67, domatesBirim = 1.11, muzBirim = 0.95, patlicanBirim = 5.00, toplamTutar;

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut Ka� Kg? : ");
        armutKg = inp.nextInt();

        System.out.print("Elma Ka� Kg? : ");
        elmaKg = inp.nextInt();

        System.out.print("Domates Ka� Kg? : ");
        domatesKg = inp.nextInt();

        System.out.print("Muz Ka� Kg? : ");
        muzKg = inp.nextInt();

        System.out.print("Patl�can Ka� Kg? : ");
        patlicanKg = inp.nextInt();

        toplamTutar = (armutKg * armutBirim) + (elmaKg * elmaBirim) + (domatesKg * domatesBirim) + (muzKg * muzBirim) + (patlicanKg * patlicanBirim);

        System.out.print("Toplam Tutar : " + toplamTutar + " TL");
        }
    }