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

    // Get Invoice Number
    public int getInvoiceNum() {
        return this.invoiceNum;
    }

    // Set Amount of Sale
    public void setAmountSale(int amtSale) {
        this.amtSale = amtSale;
        this.amtSalesTax = (amtSale * 0.05);
    }

    // Get Amount Sale
    public int getAmountSale() {
        return this.amtSale;
    }

    // Get Sales Tax
    public double getSalesTax() {
        return this.amtSalesTax;
    }

    // Display purchase details
    public void purchaseDetails() {
        System.out.printf("%nInvoice #: %d%nAmount of Sale: $%d%nSales Tax: $%.2f%n",
                getInvoiceNum(), getAmountSale(), getSalesTax());
    }
}
