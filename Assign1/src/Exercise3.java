
/*
 * Prompt:
 * -----------------------------------------------------------------------------
 * Write an application that asks the user to enter two integers,
 * obtains them from the user and prints their sum, product,
 * difference and quotient (division). Use the techniques shown in Addition.java
 * (i.e. Scanner, nextInt and printf)
 */
import java.util.Scanner;

public class Exercise3 {
    // Main
    public static void main(String[] args) {
        // Variables
        int num1, num2 = 0;

        // Scanner input
        Scanner input = new Scanner(System.in);
        // Exercise3 object
        Exercise3 ex3 = new Exercise3();

        // Collect Integer 1
        System.out.print("Enter 1st integer: ");
        num1 = input.nextInt();

        // Collect Integer 2
        System.out.print("Enter 2nd integer: ");
        num2 = input.nextInt();

        // Print Sum
        System.out.printf("\nThe sum is: %d", ex3.getSum(num1, num2));
        // Print Product
        System.out.printf("\nThe product is: %d", ex3.getProduct(num1, num2));
        // Print Difference
        System.out.printf("\nThe difference is: %d", ex3.getDiff(num1, num2));
        // Print Quotient
        System.out.printf("\nThe quotient is: %d", ex3.getQuotient(num1, num2));

        input.close();
    }

    // Sum method
    public int getSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    // Product method
    public int getProduct(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    // Difference method
    public int getDiff(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    // Quotient method
    public int getQuotient(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }
}