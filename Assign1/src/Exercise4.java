
/*
 * Write an application that inputs three integers from the user and displays the sum,
 * average, product, smallest and largest of the numbers. Use the techniques shown in
 * Comparison.java [Note: The calculation of the average in this exercise should result
 * in an integer representation of the average. So, if the sum of the values is 7,
 * the average should be 2, not 2.3333....]
 */
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        // Scanner input
        Scanner input = new Scanner(System.in);
        // Exercise 4 Object
        Exercise4 ex4 = new Exercise4();

        // 1st input integer
        System.out.println("Enter 1st integer: ");
        int num1 = input.nextInt();

        // 2nd input integer
        System.out.println("Enter 2nd integer: ");
        int num2 = input.nextInt();

        // 3rd input integer
        System.out.println("Enter 3rd integer: ");
        int num3 = input.nextInt();

        // Print sum
        System.out.printf("\nThe sum is: %d", ex4.getSum(num1, num2, num3));
        // Print average
        // Print smallest
        // print largest

        input.close();
    }

    // Sum method
    public int getSum(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;
    }
    // Average method
    // Smallest integer method
    // Largest integer method
}
