package inheritance.examples.tour_example;

import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TourPackage tour;
        String[] dest = new String[3];

        System.out.println("Enter Tour Code: ");
        int code = sc.nextInt();
        System.out.println("Enter Tour Name: ");
        String name = sc.next();
        System.out.println("Enter days:");
        double days = sc.nextDouble();
        System.out.println("Enter Price:");
        double price = sc.nextDouble();
        System.out.println("Enter destinations:");
        // As there are 3 destinations in a tour
        for(int i = 0; i < 3; i++){
            System.out.println("Enter Destination:");
            dest[i] = sc.next();
        }
        System.out.println("Enter no.of Persons:");
        int persons = sc.nextInt();
        tour = new TourPackage(persons, code, name, dest, days, price);
        tour.findTotal();

    }
}
