
/*
 * Carly's Catering provides meals for parties and special events. 
 * Write a program that prompts the user for the number of guests attending
 * an event and then computes the total price, which is $35 per person.
 * Display the company motto (“Carly’s makes the food that makes it a party.”)
 * with a border and then display the number of guests, price per guest,
 * and total price. Also display a message that indicates true or false depending
 * on whether the job is classified as a large event—an event with 50 or more guests.
 * Save the file as CarlysEventPrice.java
 */
import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {
        // Scanner input object
        Scanner input = new Scanner(System.in);
        // CarlysEventPrice object
        CarlysEventPrice cep = new CarlysEventPrice();

        // Request number of attending guests
        System.out.println("How many guests are attending this event?: ");
        int guests = input.nextInt();
        // Calculate Total price of event
        int prcPerGuest = 35;
        int priceOfEvent = cep.totalPrice(prcPerGuest, guests);

        // Display motto + border
        System.out.println("\n-----------------------------------------------");
        System.out.println("\n| Carly’s makes the food that makes it a party. |");
        System.out.println("\n-----------------------------------------------\n");
        // Display number of guests
        System.out.printf("Attending guests: %d", guests);
        // Display price per guest
        System.out.printf("Price per guest: $%d", prcPerGuest);
        // Display total price
        // Display if large event aka 50+ guests(True or False)

        input.close();
    }

    public int totalPrice(int prcPerGuest, int guests) {
        int total = prcPerGuest * guests;
        return total;
    }
}
