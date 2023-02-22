import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int mMin;
        int mText;
        int mGB;
        int price = 0;
        char plan = '\0';

        // Ask for maximum monthly values for:
        // talk minutes used,
        System.out.printf("What is your max monthly talk minutes used?: ");
        mMin = input.nextInt();
        // text messages sent,
        System.out.printf("What is your max monthly text messages sent?: ");
        mText = input.nextInt();
        // and gigabytes of data used.
        System.out.printf("What is your max monthly GBs of data used?: ");
        mGB = input.nextInt();

        // Recommend best plan for customer needs.

        // Plan A: Fewer than 500 minutes of talk and no text or data: $49 monthly
        if ((mMin < 500) & (mGB == 0)) {
            if (mText == 0) {
                plan = 'A';
                price = 49;
            }
            // Plan B: Fewer than 500 mins of talk and any text: $55 monthly
            else if (mText > 0) {
                plan = 'B';
                price = 55;
            }
        }
        // Plan C: 500 or more mins of talk and no data, up to 100 texts: $61 monthly
        else if ((mMin >= 500) & (mGB == 0)) {
            if (mText < 100) {
                plan = 'C';
                price = 61;
            }
            // Plan D: 100 texts or more: $70 monthly
            else if (mText >= 100) {
                plan = 'D';
                price = 70;
            }
        }
        // Plan E: Need any data up to 3 gbs: $79 monthly
        else if (mGB > 0) {
            if (mGB < 3) {
                plan = 'E';
                price = 79;
            }
            // Plan F: For 3 gbs or more at $87 monthly
            else if (mGB >= 3) {
                plan = 'F';
                price = 87;
            }
        }
        // FailSafe
        else {
            System.out.println("Invalid\n");
            System.exit(-1);
        }
        System.out.printf("\nRecommended plan: Plan %c for $%d a month.", plan, price);

        input.close();
    }
}
