import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kdvsizF, kdv, kdvliF;

        Scanner inp = new Scanner(System.in);

        System.out.print("KDV'siz Fiyat : ");
        kdvsizF = inp.nextDouble();

        kdv = (kdvsizF <= 1000) ? (kdvsizF * 0.18) : (kdvsizF * 0.08) ;

        System.out.println("KDV : " + kdv);

        kdvliF = kdvsizF + kdv;

        System.out.print("KDV'li Fiyat : " + kdvliF);

        }
    }