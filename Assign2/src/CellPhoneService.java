import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int mMin, mText, mGB, price = 0;
        char plan = '\0';

        // Ask for maximum monthly values for:
        // talk minutes used,
        System.out.printf("What is your monthly talk minutes used?: ");
        mMin = input.nextInt();
        // text messages sent,
        System.out.printf("What is your monthly text messages sent?: ");
        mText = input.nextInt();
        // and gigabytes of data used.
        System.out.printf("What is your monthly GBs of data used?: ");
        mGB = input.nextInt();

        // Recommend best plan for customer needs.

        // Plan A: Customer needs fewer than 500 minutes of talk and no text or data,
        // $49 monthly
        // Plan B: Fewer than 500 mins of talk and any text, $55 monthly.
        if ((mMin < 500) & (mGB == 0)) {
            if (mText == 0) {
                plan = 'A';
                price = 49;
            } else if (mText > 0) {
                plan = 'B';
                price = 55;
            }
        }
        // Plan C: 500 or more mins of talk and no data, up to 100 texts, $61 monthly
        // or
        // Plan D: 100 texts or more at $70 monthly
        else if ((mMin >= 500) & (mGB == 0)) {
            if (mText <= 100) {
                plan = 'C';
                price = 61;
            } else if (mText > 100) {
                plan = 'D';
                price = 70;
            }
        }
        // Plan E: If customer needs any data, for up to 3 gbs at $79 monthly
        // or
        // Plan F: For 3 gbs or more at $87 monthly
        else if (mGB > 0) {
            if (mGB <= 3) {
                plan = 'E';
                price = 79;
            } else if (mGB > 3) {
                plan = 'F';
                price = 87;
            }
        } else {
            System.out.println("Invalid\n");
            System.exit(-1);
        }
        System.out.printf("\nOur recommended plan for you is plan %c for $%d a month.", plan, price);

        input.close();
    }
}
