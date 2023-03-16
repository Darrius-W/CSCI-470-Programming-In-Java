package Purchase;

public class Purchase {
    private int invoiceNum;
    private int amtSale;
    private double amtSalesTax;

    public static void main(String[] args) throws Exception {
    }

    // Set Invoice Number
    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    // Set Amount of Sale
    public void setAmountSale(int amtSale) {
        this.amtSale = amtSale;
        this.amtSalesTax = (amtSale * 0.05);
    }

    // Display purchase details
    public void purchaseDetails() {
        System.out.printf("%nInvoice #: %d%nAmount of Sale: $%d%nSales Tax: $%.2f%n",
                this.invoiceNum, this.amtSale, this.amtSalesTax);
    }
}
