import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b;
        double c, alan;


        Scanner inp = new Scanner(System.in);

        System.out.print("a Kenarının Ölçüsünü Giriniz : ");
        a = inp.nextInt();

        System.out.print("b Kenarının Ölçüsünü Giriniz : ");
        b = inp.nextInt();

        c = Math.sqrt((a * a) + (b * b)) ;
        System.out.println("c Kenarının Ölçüsü : " + c);

        alan = a * b / 2 ;
        System.out.print("Üçgenin Alanı : " + alan);


        }
    }
