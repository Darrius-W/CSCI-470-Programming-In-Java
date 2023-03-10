
/*
 * Assignment 1 - CarlysEventPrice.java
 * Darrius White
 * CSCI 470
 */
import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {

        // Variables
        boolean isLargeEvent = false;
        int guests, priceOfEvent = 0;
        int prcPerGuest = 35;

        // Scanner input object
        Scanner input = new Scanner(System.in);
        // CarlysEventPrice object
        CarlysEventPrice cep = new CarlysEventPrice();

        // Request number of attending guests
        System.out.print("How many guests are attending this event?: ");
        guests = input.nextInt();
        // Calculate Total price of event
        prcPerGuest = 35;
        priceOfEvent = cep.totalPrice(prcPerGuest, guests);

        // Display motto + border
        System.out.println("\n|-----------------------------------------------|");
        System.out.println("|\t\t\t\t\t\t|");
        System.out.println("| Carly's makes the food that makes it a party. |");
        System.out.println("|\t\t\t\t\t\t|");
        System.out.println("|-----------------------------------------------|");

        // Display number of guests
        System.out.printf("  Attending guests: %d", guests);
        // Display price per guest
        System.out.printf("\n  Price per guest: $%d", prcPerGuest);
        // Display total price
        System.out.printf("\n  Total price of event: $%d", priceOfEvent);

        // Display if large event aka 50+ guests(True or False)
        if (guests >= 50) {
            isLargeEvent = true;
        }
        System.out.printf("\n  Large event: %b", isLargeEvent);

        input.close();
    }

    public int totalPrice(int prcPerGuest, int guests) {
        int total = prcPerGuest * guests;
        return total;
    }
}