import java.util.Scanner;

public class TimesAndInstructors {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String course;
        String[][] courses = { { "CIS101", "Mon 9 am", "Farrell" },
                { "CIS210", "Mon 11 am", "Patel" },
                { "MKT100", "Tues 8:30 am", "Wong" },
                { "ACC150", "Tues 6 pm", "Deitrich" },
                { "CIS101", "Fri 1 pm", "Lenno" } };

        while (true) {
            // Prompt user for course name
            System.out.print("Enter a course name(\"ZZZ\" to exit): ");
            course = input.nextLine();

            // Exit loop
            if (course.equals("ZZZ")) {
                break;
            }

            // Display course details
            System.out.println("------------------------------------------");
            System.out.println("|  Course  |     Time     |  Instructor  |");
            System.out.println("|----------|--------------|--------------|");

            // If course doesn't exist display error message
            if (!(findCourse(courses, course))) {
                System.out.println("***ERROR: COURSE DOES NOT EXIST***");
            }
        }

        input.close();
    }

    // Function to search through courses
    public static boolean findCourse(String courses[][], String course) {
        boolean isCourse = false;
        // Search for course
        for (int i = 0; i < 5; i++) {
            if (courses[i][0].equals(course)) {
                // Display all found courses
                System.out.printf("  %s     %s        %s\n",
                        courses[i][0], courses[i][1], courses[i][2]);
                isCourse = true;
            }
        }
        System.out.println("------------------------------------------");
        return isCourse;
    }
}
