import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b;
        double c, alan;


        Scanner inp = new Scanner(System.in);

        System.out.print("a Kenar?n?n �l��s�n� Giriniz : ");
        a = inp.nextInt();

        System.out.print("b Kenar?n?n �l��s�n� Giriniz : ");
        b = inp.nextInt();

        c = Math.sqrt((a * a) + (b * b)) ;
        System.out.println("c Kenar?n?n �l��s� : " + c);

        alan = a * b / 2 ;
        System.out.print("��genin Alan? : " + alan);


        }
    }