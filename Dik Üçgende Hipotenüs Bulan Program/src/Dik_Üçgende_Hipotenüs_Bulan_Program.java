import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b;
        double c, alan;


        Scanner inp = new Scanner(System.in);

        System.out.print("a Kenar?n?n Ölçüsünü Giriniz : ");
        a = inp.nextInt();

        System.out.print("b Kenar?n?n Ölçüsünü Giriniz : ");
        b = inp.nextInt();

        c = Math.sqrt((a * a) + (b * b)) ;
        System.out.println("c Kenar?n?n Ölçüsü : " + c);

        alan = a * b / 2 ;
        System.out.print("Üçgenin Alan? : " + alan);


        }
    }