public class Candle {
    private String color;
    protected int height;
    protected double price;

    // Get method for color
    public String getColor() {
        return this.color;
    }

    // Set method for color
    public void setColor(String color) {
        this.color = color;
    }

    // Get method for heig ht
    public int getHeight() {
        return this.height;
    }

    // Set method for height
    public void setHeight(int height) {
        this.height = height;
        // Price = $2 per inch
        this.price = (height * 2.0);
    }

    // Get method for price
    public double getPrice() {
        return this.price;
    }
}
