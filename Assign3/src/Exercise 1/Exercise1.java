import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) throws Exception {
        int[] tempNums = new int[100];
        int[] userNums;
        int num;
        int count = 0;
        Scanner input = new Scanner(System.in);

        // Loop to collect user input
        while (true) {
            // Collect user input
            System.out.print("Enter an integer(-99 to stop): ");
            num = input.nextInt();

            // Assign user num to int arr
            if (num == -99) {
                tempNums[count] = num;
                break;
            } else {
                tempNums[count] = num;
                count++;
            }
        }

        userNums = new int[count + 1];
        // Adjusting arr size
        for (int i = 0; i <= count; i++) {
            userNums[i] = tempNums[i];
        }

        // Get lowest number
        System.out.printf("Min: %d%n", getMin(userNums));
        // Get highest number
        System.out.printf("Max: %d", getMax(userNums));

        input.close();
    }

    // Minimum number
    public static int getMin(int[] userArr) {
        int lowestNum = userArr[0]; // assign initial lowest num

        for (int num : userArr) {
            if (num == -99) { // skip -99
                continue;
            }
            if (num < lowestNum) {
                lowestNum = num; // assign new lowest num
            }
        }
        return lowestNum;
    }

    // Maximum number
    public static int getMax(int[] userArr) {
        int maxNum = userArr[0]; // assign initial lowest num

        for (int num : userArr) {
            if (num > maxNum) {
                maxNum = num; // assign new lowest num
            }
        }
        return maxNum;
    }
}
