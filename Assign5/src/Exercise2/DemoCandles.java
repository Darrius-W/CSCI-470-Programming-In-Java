public class DemoCandles {
    public static void main(String[] args) throws Exception {
        // Declare both scented and unscented candle objects
        Candle candle1 = new Candle();
        ScentedCandle candle2 = new ScentedCandle();

        // Set candle values
        candle1.setColor("pink");
        candle1.setHeight(6);

        candle2.setHeight(6);
        candle2.setColor("white");
        candle2.setScent("gardenia");

        // Disply candles details
        System.out.printf("The %d inch %s candle costs $%.1f%n",
                candle1.getHeight(), candle1.getColor(), candle1.getPrice());

        System.out.printf("The %d inch %s %s candle costs $%.1f%n",
                candle2.getHeight(), candle2.getScent(), candle2.getColor(), candle2.getPrice());
    }
}
