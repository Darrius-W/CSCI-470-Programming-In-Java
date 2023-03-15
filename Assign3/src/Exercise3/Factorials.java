public class Factorials {
    public static void main(String[] args) throws Exception {
        // Base factorials
        for (int base = 1; base <= 10; base++) {
            // Print base
            System.out.printf("%2d: ", base);

            // Factorials of base number
            int product = 0;
            for (int num = 1; num <= base; num++) {
                // Display all factorial numbers
                System.out.print(num);
                if (num != base) {
                    System.out.print("*");
                }

                // Factorial calculations
                if (num == 1) {
                    product = num;
                    continue;
                }
                product *= num;
            }
            System.out.printf(" = %d%n", product);
        }
    }
}