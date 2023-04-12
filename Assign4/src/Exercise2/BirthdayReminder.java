
/*
 * Write an application that allows a user to enter the names and birthdates
 * of up to 10 friends. Continue to prompt the user for names and birthdates
 * until the user enters the sentinel value ZZZ for a name or has entered 10 names,
 * whichever comes first. When the user is finished entering names, produce a
 * count of how many names were entered, and then display the names. In a loop,
 * continuously ask the user to type one of the names and display the corresponding
 * birthdate or an error message if the name has not been previously entered. The
 * loop continues until the user enters ZZZ for a name. Save the application as
 * BirthdayReminder.java.
 */
import java.util.Scanner;
import java.util.Arrays;

public class BirthdayReminder {
    public static void main(String[] args) throws Exception {
        // Declare multiDimensional array to hold Name : Birthday
        String[][] friends = new String[10][2];
        String name;
        String bDay;
        String searchFriend;
        int count = 0;
        int friendIndex;
        Scanner input = new Scanner(System.in);

        // In Loop, Prompt user to enter Name and Birthday until 'ZZZ' Enter or MAX 10
        while (count <= 9) {
            // Prompt Name input
            System.out.print("Enter friend name: ");
            name = input.nextLine();

            // Check if 'ZZZ'
            if (name.equals("ZZZ")) {
                break;
            }

            // Prompt Bday input
            System.out.print("Enter friend birthday(Ex:\"12/20/2000\"): ");
            bDay = input.nextLine();

            // Store input Name and Bday
            friends[count][0] = name;
            friends[count][1] = bDay;

            // Inc count
            count++;
        }
        // Display how many names were entered followed by all the names
        System.out.printf("%nCurrent Friend Count: %d%nFriend List%n-----------%n", count);
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + friends[i][0]);
        }
        // In Loop, ask user to type one of the names and display corresponding Bday
        // (Until 'ZZZ')
        while (true) {
            System.out.print("\nEnter a friends name(\"ZZZ\" to exit): ");
            searchFriend = input.nextLine();

            if (searchFriend.equals("ZZZ")) { // User End Loop
                break;
            }

            if (/*Binary Search*/) { // Friend Exists
                System.out.printf("%nFriend: %d%nBirthday:%d",
                        friends[friendIndex][0], friends[friendIndex][1]);
            }

            else { // Friend Doesn't Exist
                System.out.println("No existing friend with that name.");
                continue;
            }
        }

        input.close();
    }
}
