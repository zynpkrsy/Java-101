import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // This program calculates the perimeter and area of a circle (or a part of circle) by asking the radius and central angle to the customer.

        int r, centralAngle;

        double pi = 3.14, area, perimeter;

        Scanner inp = new Scanner(System.in);

        System.out.print("Radius : ");
        r = inp.nextInt();

        perimeter = 2 * pi * r;

        System.out.println("Perimeter : " + perimeter);

        System.out.print("Central Angle : ");
        centralAngle = inp.nextInt();

        area = pi * r * r * centralAngle / 360;


        System.out.print("Area : " + area);


        }
    }