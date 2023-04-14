import java.util.Scanner;

public class MorgansBonuses {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double[][] bonuses = new double[7][5];
        int weeksWorked;
        int reviews;

        // Storing bonus values
        bonuses[0][0] = 5.00;
        bonuses[0][1] = 9.00;
        bonuses[0][2] = 16.00;
        bonuses[0][3] = 22.00;
        bonuses[0][4] = 30.00;

        bonuses[1][0] = 10.00;
        bonuses[1][1] = 12.00;
        bonuses[1][2] = 18.00;
        bonuses[1][3] = 24.00;
        bonuses[1][4] = 36.00;

        bonuses[2][0] = 20.00;
        bonuses[2][1] = 25.00;
        bonuses[2][2] = 32.00;
        bonuses[2][3] = 42.00;
        bonuses[2][4] = 53.00;

        bonuses[3][0] = 32.00;
        bonuses[3][1] = 38.00;
        bonuses[3][2] = 45.00;
        bonuses[3][3] = 55.00;
        bonuses[3][4] = 68.00;

        bonuses[4][0] = 46.00;
        bonuses[4][1] = 54.00;
        bonuses[4][2] = 65.00;
        bonuses[4][3] = 77.00;
        bonuses[4][4] = 90.00;

        bonuses[5][0] = 60.00;
        bonuses[5][1] = 72.00;
        bonuses[5][2] = 84.00;
        bonuses[5][3] = 96.00;
        bonuses[5][4] = 120.00;

        bonuses[6][0] = 85.00;
        bonuses[6][1] = 100.00;
        bonuses[6][2] = 120.00;
        bonuses[6][3] = 140.00;
        bonuses[6][4] = 175.00;

        // Prompt user for full weeks worked
        System.out.print("Enter number of full weeks worked: ");
        weeksWorked = input.nextInt();

        // Prompt user for number of positive reviews
        System.out.print("Enter number of positive reviews: ");
        reviews = input.nextInt();

        // Display user input
        System.out.printf("\nWeeks worked: %d%nReviews: %d%n", weeksWorked, reviews);

        // Check if values surpass boundaries
        if (weeksWorked > 6) {
            weeksWorked = 6;
        }
        if (reviews > 4) {
            reviews = 4;
        }

        // Display appropriate bonus
        System.out.printf("Bonus: %.2f", bonuses[weeksWorked][reviews]);

        input.close();
    }
}