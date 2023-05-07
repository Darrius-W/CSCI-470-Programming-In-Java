public class ScentedCandle extends Candle {
    private String scent;

    // Get method for scent
    public String getScent() {
        return this.scent;
    }

    // Set method for scent
    public void setScent(String scent) {
        this.scent = scent;
    }

    // Overridden setHeight: price = $3 per inch
    @Override
    public void setHeight(int height) {
        this.height = height;
        this.price = (height * 3.0);
    }
}
