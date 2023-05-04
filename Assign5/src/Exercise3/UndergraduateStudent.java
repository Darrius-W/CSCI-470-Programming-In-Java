public class UndergraduateStudent extends Student {
    public void setTuition() {
        this.annualTuition = 4000.0;
    }

    public UndergraduateStudent(int studentID, String lastName) {
        super(studentID, lastName);
        setTuition();
    }
}
