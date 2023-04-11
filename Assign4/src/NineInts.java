public class NineInts {
    public static void main(String[] args) throws Exception {
        // Create Integer Array
        int[] myArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // Display array values from first to last
        System.out.print("First to Last: ");
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i]);

            // Add space if not last value displayed
            if (i != 8) {
                System.out.print(" ");
            }
        }

        // Display array values from last to first
        System.out.print("\nLast to First: ");
        for (int j = (myArr.length - 1); j >= 0; j--) {
            System.out.print(myArr[j]);

            // Add space if not last value in displayed
            if (j != 0) {
                System.out.print(" ");
            }
        }

    }
}
