/*
* Assignment 2 - BloodData.java
* Darrius White
* CSCI 470
*/

package BloodData;

public class BloodData {
    public static void main(String[] args) throws Exception {
    }

    private String bloodT;
    private char rhFactor;

    // default constructor
    public BloodData() {
        // sets blood type to O
        this.setBloodType("O");
        // sets Rh factor to +
        this.setRhFactor('+');
    }

    // overloaded constructor: requires values for both fields
    public BloodData(String bloodT, char rhFactor) {
        this.bloodT = bloodT;
        this.rhFactor = rhFactor;
    }

    // set method: Blood type
    public void setBloodType(String bloodT) {
        this.bloodT = bloodT;
    }

    // get method: Blood type
    public String getBloodType() {
        return this.bloodT;
    }

    // set method: Rh factor
    public void setRhFactor(char rhFactor) {
        this.rhFactor = rhFactor;
    }

    // get method: Rh facotr
    public char getRhFactor() {
        return this.rhFactor;
    }
}