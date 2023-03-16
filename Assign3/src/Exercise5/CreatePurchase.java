import Purchase.Purchase;
import java.util.Scanner;

public class CreatePurchase {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Purchase newPurchase = new Purchase();
        int invoiceNum;
        int amtSale;

        // Promt user for purchase details
        // Promt for Invoice number
        while (true) {
            System.out.print("Enter Invoice #(1000-8000): ");
            invoiceNum = input.nextInt();
            if (!((invoiceNum >= 1000) && (invoiceNum <= 8000))) { // Check if valid
                System.out.println("***ERROR: INVALID INPUT****");
                continue;
            } else {
                newPurchase.setInvoiceNum(invoiceNum);
                break;
            }
        }
        // Promt for Sales amount
        while (true) {
            System.out.print("Enter Sales Amount(non-negative): ");
            amtSale = input.nextInt();
            if (amtSale < 0) {
                System.out.println("***ERROR: INVALID INPUT****");
                continue;
            } else {
                newPurchase.setAmountSale(amtSale);
                break;
            }
        }
        newPurchase.purchaseDetails();

        input.close();
    }
}
