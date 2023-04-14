import java.util.Scanner;

public class CarCareChoice2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String userOption;
        String userOptionShort;
        String[] shopOptions = { "oil change", "tire rotation", "battery check", "brakes" };
        String[] shopOptionsShort = { "oil", "tir", "bat", "bra" };

        // Display menu for Cody's Car Care Shop
        System.out.println("Cody's Care Care Shop");
        System.out.println("-----------------------------");
        System.out.println("What can we do for you today?");
        System.out.println("- Oil Change");
        System.out.println("- Tire Rotation");
        System.out.println("- Battery Check");
        System.out.println("- Brakes");

        // Request user string input
        System.out.print("\nOption: ");
        userOption = input.nextLine();
        userOption = userOption.toLowerCase();

        // Collect shortened userOption to account for spelling mistakes
        userOptionShort = userOption.substring(0, 3);

        // Switch statement to check options against user input
        switch (userOptionShort) {
            // Option: Oil change
            case "oil":
                // Display price $25
                System.out.printf("%s is $25%n", shopOptions[0]);
                break;

            // Option: Tire rotation
            case "tir":
                // Display price $22
                System.out.printf("%s is $22%n", shopOptions[1]);
                break;

            // Option: Battery check
            case "bat":
                // Display price $15
                System.out.printf("%s is $15%n", shopOptions[2]);
                break;

            // Option: Brakes
            case "bra":
                // Display price $5
                System.out.printf("%s are $5%n", shopOptions[3]);
                break;

            // Default Option: Error
            default:
                // Display Error Output
                System.out.println("***ERROR: INVALID OPTION***");
                break;
        }

        input.close();
    }
}
