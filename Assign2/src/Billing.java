public class Billing {
    public static void main(String[] args) throws Exception {
        double bookPrc = 20.98,
                coupon = 0.1;
        int quantity = 15;

        Billing bill = new Billing();

        // test computeBill one parameter
        System.out.printf("%.2f\n", bill.computeBill(bookPrc));
        // test computeBill two parameter
        System.out.printf("%.2f\n", bill.computeBill(bookPrc, quantity));
        // test computeBill three parameter
        System.out.printf("%.2f\n", bill.computeBill(bookPrc, quantity, coupon));
    }

    // computeBill single parameter: price of one photo book ordered
    public double computeBill(double bookPrc) {
        // add 8% tax
        double result = bookPrc + (bookPrc * 0.08);
        // return total due
        return result;
    }

    // computeBill two parameters: price of photo book, quantity ordered
    public double computeBill(double bookPrc, int quantity) {
        // multiply two parameters
        double result = bookPrc * quantity;
        // add 8% tax
        result = result + (result * 0.08);
        // return total due
        return result;
    }

    // computeBill three parameters: price of photo book, quantity ordered, coupon
    // value
    public double computeBill(double bookPrc, int quantity, double coupon) {
        // multiply quantity and price of photo book
        double result = bookPrc * quantity;
        // reduce result by the coupon value
        result = result - (result * coupon);
        // add 8% tax
        result = result + (result * 0.08);
        // return total due
        return result;
    }
}
