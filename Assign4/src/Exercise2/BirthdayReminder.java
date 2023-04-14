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

            friendIndex = searchFriend(friends, searchFriend, count);// Check if friend exists

            if (friendIndex != -1) { // Friend Exists
                System.out.printf("Friend: %s%nBirthday:%s%n",
                        friends[friendIndex][0], friends[friendIndex][1]);
            }

            else { // Friend Doesn't Exist
                System.out.println("No existing friend with that name.");
                continue;
            }
        }

        input.close();
    }

    static int searchFriend(String friendsArr[][], String friend, int count) {
        for (int i = 0; i < count; i++) {
            if (friendsArr[i][0].equals(friend)) {
                return i;
            }
        }
        return -1;
    }
}
