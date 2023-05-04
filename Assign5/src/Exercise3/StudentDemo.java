public class StudentDemo {
    public static void main(String[] args) throws Exception {
        int arrSize = 6;
        // Create array of six objects
        Student[] studentArr = new Student[arrSize];
        studentArr[0] = new UndergraduateStudent(111, "Lambert");
        studentArr[1] = new UndergraduateStudent(122, "Lembeck");
        studentArr[2] = new GraduateStudent(233, "Miller");
        studentArr[3] = new GraduateStudent(256, "Marmon");
        studentArr[4] = new StudentAtLarge(312, "Nichols");
        studentArr[5] = new StudentAtLarge(376, "Nussbaum");

        // Display each array object
        for (int i = 0; i < arrSize; i++) {
            displayStudent(studentArr[i]);
        }
    }

    // Display Student
    public static void displayStudent(Student obj) {
        System.out.printf("Student # %d Name: %s Tuition: %.1f per year%n",
                obj.getStudentID(), obj.getLastName(), obj.getTuition());
    }
}
