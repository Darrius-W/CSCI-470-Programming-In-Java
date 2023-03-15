package Apartment;

public class Apartment {
    private int aptNum = 0;
    private int aptBedrooms = 0;
    private double aptBaths = 0;
    private int aptRent = 0;

    public static void main(String[] args) throws Exception {
    }

    // Constructor - Accepts values for each field
    public Apartment(int aptNum, int aptBedrooms, double aptBaths, int aptRent) {
        this.aptNum = aptNum;
        this.aptBedrooms = aptBedrooms;
        this.aptBaths = aptBaths;
        this.aptRent = aptRent;
    }

    // Get Apartment Number
    public int getAptNum() {
        return this.aptNum;
    }

    // Get Apartment Bedrooms
    public int getAptBedrooms() {
        return this.aptBedrooms;
    }

    // Get Apartment Baths
    public double getAptBaths() {
        return this.aptBaths;
    }

    // Get Rent
    public int getRent() {
        return this.aptRent;
    }

    // Compare listings to user requirements
    public boolean compareApt(int minBedrooms, double minBaths, int maxRent) {
        // Check if apartment matches with user requirements
        if (minBedrooms <= this.getAptBedrooms() &&
                minBaths <= this.getAptBaths() &&
                maxRent >= this.getRent()) {

            return true; // Listing matches user requirements
        }
        return false; // Listing does not match user requirements
    }

    // Display full apartment details
    public void displayApt() {
        System.out.printf("Apartment #%d:%n Bedrooms: %d%n Baths: %.1f%n Rent: $%d%n%n",
                this.getAptNum(), this.getAptBedrooms(), this.getAptBaths(), this.getRent());
    }
}
