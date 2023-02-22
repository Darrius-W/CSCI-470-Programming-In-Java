import BloodData.BloodData;

public class TestBloodData {
    public static void main(String[] args) throws Exception {
        BloodData bData = new BloodData();
        BloodData bData2 = new BloodData("B", '-');

        // Get default constructor values
        System.out.printf("%s%c\n", bData.getBloodType(), bData.getRhFactor());

        // Set new values
        bData.setBloodType("AB");
        bData.setRhFactor('-');

        // Get new values
        System.out.printf("%s%c\n", bData.getBloodType(), bData.getRhFactor());

        // Get values using overloaded constructor
        System.out.printf("%s%c\n", bData2.getBloodType(), bData2.getRhFactor());
    }
}