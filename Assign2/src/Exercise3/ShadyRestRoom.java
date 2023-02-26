/*
* Assignment 2 - ShadyRestRoom.java
* Darrius White
* CSCI 470
*/

import java.util.Scanner;

public class ShadyRestRoom {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int option;
        int price = 0;
        String str = "";

        // Display menu
        System.out.println("Hello, Welcome to the ShadyRestRoom!");
        System.out.println("-----------------------------------------");
        System.out.println("Please select one of the following rooms:");
        System.out.println("1. Queen bed");
        System.out.println("2. King bed");
        System.out.println("3. King bed and a pullout couch");
        System.out.println("-----------------------------------------");

        // Ask user for input:
        System.out.print("Option: ");
        option = input.nextInt();

        // Switch cases for user option
        switch (option) {
            case 1:
                str = "a Queen bed";
                price = 125;
                break;

            case 2:
                str = "a King bed";
                price = 139;
                break;

            case 3:
                str = "a suite with king bed and a pullout couch";
                price = 165;
                break;

            default:
                price = 0;
                System.out.printf("\nERROR: Invalid Input: $%d.", price);
                System.exit(-1);

        }
        // Echo input, price, and bed
        System.out.printf("\nYou entered %d: $%d for %s.", option, price, str);

        input.close();
    }
}
