import BloodData.BloodData;

public class TestBloodData {
    public static void main(String[] args) throws Exception {
        BloodData bData = new BloodData();
        BloodData bData2 = new BloodData("B", '-');

        // Get default constructor values
        System.out.println(bData.getBloodType());
        System.out.println(bData.getRhFactor());

        // Set new values
        bData.setBloodType("AB");
        bData.setRhFactor('-');

        // Get new values
        System.out.println(bData.getBloodType());
        System.out.println(bData.getRhFactor());

        // Get values using overloaded constructor
        System.out.println(bData2.getBloodType());
        System.out.println(bData2.getRhFactor());

    }
}