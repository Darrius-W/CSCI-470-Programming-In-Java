
/*
 * Write an application that inputs three integers from the user and displays the sum,
 * average, product, smallest and largest of the numbers. Use the techniques shown in
 * Comparison.java [Note: The calculation of the average in this exercise should result
 * in an integer representation of the average. So, if the sum of the values is 7,
 * the average should be 2, not 2.3333....]
 * 
 *          ?Should values for average be rounded up?
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
        int sum = ex4.getSum(num1, num2, num3);
        System.out.printf("\nThe sum is: %d", sum);
        // Print average
        System.out.printf("\nThe average is: %d", ex4.getAvg(sum));
        // Print smallest
        System.out.printf("\nThe smallest integer is: %d", ex4.getMin(num1, num2, num3));
        // print largest
        System.out.printf("\nThe largest integer is: %d", ex4.getMax(num1, num2, num3));

        input.close();
    }

    // Sum method
    public int getSum(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;
    }

    // Average method
    public int getAvg(int sum) {
        int result = sum / 3;
        return result;
    }

    // Smallest integer method
    public int getMin(int num1, int num2, int num3) {
        if (num1 >= num2) {
            if (num2 >= num3) {
                return num3;
            }

            else {
                return num2;
            }
        } else // if (num2 >= num1)
        {
            if (num1 >= num3) {
                return num3;
            }

            else {
                return num1;
            }
        }
    }

    // Largest integer method
    public int getMax(int num1, int num2, int num3) {
        if (num1 >= num2) {
            if (num1 >= num3) {
                return num1;
            } else {
                return num3;
            }
        } else // if (num2 >= num1)
        {
            if (num2 >= num3) {
                return num2;
            } else {
                return num3;
            }
        }
    }
}
