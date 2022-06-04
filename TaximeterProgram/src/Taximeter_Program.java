import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     int distanceKm, openingPrice ;

     double perKm, totalPrice;

        openingPrice= 10;

        Scanner inp = new Scanner(System.in);

        System.out.print("Distance in Km : ");
        distanceKm = inp.nextInt();

        totalPrice = (distanceKm < 5) ? (20) : (distanceKm * perKm + openingPrice);

        System.out.print("Total Price : " + totalPrice + " TL");

        }
    }