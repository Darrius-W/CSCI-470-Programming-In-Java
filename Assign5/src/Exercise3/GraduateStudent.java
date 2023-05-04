public class GraduateStudent extends Student {
    public void setTuition() {
        this.annualTuition = 6000.0;
    }

    public GraduateStudent(int studentID, String lastName) {
        super(studentID, lastName);
        setTuition();
    }
}