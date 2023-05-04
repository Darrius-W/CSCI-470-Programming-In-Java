public abstract class Student {
    private int studentID;
    private String lastName;
    protected double annualTuition;

    // Student constructor
    public Student(int studentID, String lastName) {
        setStudentID(studentID);
        setLastName(lastName);
    }

    // Set method for studentID
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    // Get method for studentID
    public int getStudentID() {
        return this.studentID;
    }

    // Set method for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Get method for lastName
    public String getLastName() {
        return this.lastName;
    }

    // Set method for annualTuition : abstract
    abstract void setTuition();

    // Get method for annualTuition
    public double getTuition() {
        return this.annualTuition;
    }
}