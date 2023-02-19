import java.util.Scanner;

public class AcmePay {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int hours = 0,
                hoursOT = 0,
                shift = 0;
        double payRate = 0,
                payReg = 0,
                payOT = 0,
                payTot = 0,
                rReduction = 0,
                reductionTot = 0,
                net = 0;
        boolean retirement = false;
        String retireOp = "";

        // Ask user for:
        // hours worked
        System.out.print("How many hours have you worked?: ");
        hours = input.nextInt();
        // what shift(1st, 2nd, 3rd)
        System.out.print("What shift(1, 2, 3)?: ");
        shift = input.nextInt();
        // if shift(2nd or 3rd):
        // elect for retirment
        if ((shift == 2) || (shift == 3)) {
            System.out.print("Would you like to elect for retirement (y or n)?: ");
            input.nextLine(); // consuming leftover newline
            retireOp = input.nextLine();
            if (retireOp.equals("y")) {
                retirement = true;
            }
        }

        // 1st shift(17), 2nd(18.50), 3rd(22)
        // assign payRate
        if (shift == 1) {
            payRate = 17;
        } else if (shift == 2) {
            payRate = 18.5;
        } else if (shift == 3) {
            payRate = 22;
        }
        // any hours more than 40 get time and a half
        if (hours > 40) {
            hoursOT = hours - 40;
            hours = 40;
        }
        // retirement takes 3% from gross income
        if (retirement == true) {
            rReduction = 0.03;
        } else {
            rReduction = 0;
        }

        // OUTPUT:
        // hours worked
        System.out.printf("Hours worked: %d\n", hours);
        // shift
        System.out.printf("Shift: %d\n", shift);
        // hourly pay rate
        System.out.printf("Hourly payrate: $%.2f\n", payRate);
        // regular pay
        payReg = hours * payRate;
        System.out.printf("Regualr pay: $%.2f\n", payReg);
        // overtime pay
        payOT = hoursOT * (payRate + (payRate / 2));
        System.out.printf("Overtime pay: $%.2f\n", payOT);
        // total of regular + OT
        payTot = payReg + payOT;
        System.out.printf("Total pay: $%.2f\n", payTot);
        // retirement reduction
        reductionTot = payTot * rReduction;
        System.out.printf("Retirement reduction: %.2f\n", reductionTot);
        // net pay after deductions
        net = payTot - reductionTot;
        System.out.printf("Net pay: $%.2f\n", net);

        input.close();
    }
}
