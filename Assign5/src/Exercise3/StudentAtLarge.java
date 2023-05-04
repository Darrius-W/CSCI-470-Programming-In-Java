public class StudentAtLarge extends Student {
    public void setTuition() {
        this.annualTuition = 2000.0;
    }

    public StudentAtLarge(int studentID, String lastName) {
        super(studentID, lastName);
        setTuition();
    }
}
