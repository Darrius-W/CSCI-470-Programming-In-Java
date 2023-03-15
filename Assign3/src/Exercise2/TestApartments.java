import Apartment.Apartment;
import java.util.Scanner;

public class TestApartments {
    public static void main(String[] args) throws Exception {
        Apartment apt1 = new Apartment(101, 2, 1, 725);
        Apartment apt2 = new Apartment(102, 2, 1.5, 775);
        Apartment apt3 = new Apartment(103, 3, 2, 870);
        Apartment apt4 = new Apartment(104, 3, 2.5, 960);
        Apartment apt5 = new Apartment(105, 3, 3, 1100);

        Scanner input = new Scanner(System.in);

        // Ask user for minimum bedrooms
        System.out.print("Enter minimum bedrooms: ");
        int minBedrooms = input.nextInt();
        // Ask user for minimum baths
        System.out.print("Eneter minimum baths: ");
        double minBaths = input.nextDouble();
        // Ask user for maximum rent
        System.out.print("Enter maximum rent: ");
        int maxRent = input.nextInt();

        // Compare user values with current apartments
        System.out.printf("%nListings:%n---------------%n");
        // Apt1 comparison
        if (apt1.compareApt(minBedrooms, minBaths, maxRent)) {
            apt1.displayApt();
        }

        // Apt2 comparison
        if (apt2.compareApt(minBedrooms, minBaths, maxRent)) {
            apt2.displayApt();
        }

        // Apt3 comparison
        if (apt3.compareApt(minBedrooms, minBaths, maxRent)) {
            apt3.displayApt();
        }

        // Apt4 comparison
        if (apt4.compareApt(minBedrooms, minBaths, maxRent)) {
            apt4.displayApt();
        }

        // Apt5 comparison
        if (apt5.compareApt(minBedrooms, minBaths, maxRent)) {
            apt5.displayApt();
        }
    }
}