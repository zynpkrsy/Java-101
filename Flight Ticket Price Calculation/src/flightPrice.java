import java.util.Scanner;

public class flightPrice {
    public static void main(String[] args) {
        int age, distance, flightType;
        double perKm, totalPrice, normalPrice, discountPrice, ageDiscount = 0, typeDiscount, under12age, btw12_24age, over65age, roundTrip ;
        perKm = 0.10;
        under12age = 0.5;
        btw12_24age = 0.1;
        over65age = 0.3;
        roundTrip = 0.2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter flight distance in km : ");
        distance = input.nextInt();

        while (distance < 0) {
            System.out.print("You entered invalid value! Please try again : ");
            distance = input.nextInt();
        }

        System.out.print("Enter your age : ");
        age = input.nextInt();

        while (age < 0) {
            System.out.print("You entered invalid value! Please try again : ");
            age = input.nextInt();
        }

        System.out.print("Enter the flight type (1 => One Way , 2 => Round Trip ) : ");
        flightType = input.nextInt();

        while (!(flightType ==1 || flightType == 2)) {
            System.out.print("You entered invalid value! Please try again : ");
            flightType = input.nextInt();
        }

        normalPrice = distance * perKm;

        if (age < 12) {
            ageDiscount = normalPrice * under12age;
        } else if ((age >12) && (age < 24)) {
            ageDiscount = normalPrice * btw12_24age;
        } else if (age >= 65) {
            ageDiscount = normalPrice * over65age;
        } else {
            ageDiscount = 0;
        }
        discountPrice = normalPrice - ageDiscount;

        switch (flightType) {
            case 1:
                totalPrice = discountPrice;
                System.out.print("Total Price :" + totalPrice + " TRY");
                break;
            case 2:
                typeDiscount = discountPrice * roundTrip;
                totalPrice = (discountPrice - typeDiscount) * 2;
                System.out.print("Total Price :" + totalPrice + " TRY");
                break;
        }
    }
}
