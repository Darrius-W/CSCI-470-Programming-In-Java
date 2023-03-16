import java.util.Scanner;

public class QuizScoreStatistics {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double[] tempScores = new double[100];
        double[] finalScores;
        double score;
        int i = 0;

        // User enters any number of student quiz score until 99 entered
        while (true) {
            // Promt user to enter student score
            System.out.print("Enter student score(1-10): ");
            score = input.nextDouble();

            if (score == 99) { // Exit entry
                break;
            } else if ((score >= 1) && (score <= 10)) { // Valid entry
                tempScores[i] = score;
                i++;
            } else { // Invalid entry
                System.out.println("***ERROR: INVALID INPUT***");
                continue;
            }
        }

        // Assign temp scores to final scores
        finalScores = new double[i];
        for (int idx = 0; idx < i; idx++) {
            finalScores[idx] = tempScores[idx];
        }

        // Print total scores
        System.out.printf("%nTotal # of Student Scores: %d%n", i);
        // Print highest score
        System.out.printf("Highest score: %.2f%n", highScore(finalScores, i));
        // Print lowest score
        System.out.printf("Lowest score: %.2f%n", lowScore(finalScores, i));
        // Print average score
        System.out.printf("Average score: %.2f%n", avgScore(finalScores, i));

        input.close();
    }

    // highest score method
    public static double highScore(double scores[], int size) {
        double highScore = scores[0];

        for (int i = 1; i < size; i++) {
            if (highScore < scores[i]) {
                highScore = scores[i];
            }
        }
        return highScore;
    }

    // Lowest score method
    public static double lowScore(double scores[], int size) {
        double lowScore = scores[0];

        for (int i = 1; i < size; i++) {
            if (lowScore > scores[i]) {
                lowScore = scores[i];
            }
        }
        return lowScore;
    }

    // Average method
    public static double avgScore(double scores[], int size) {
        double avg = 0;

        for (int i = 0; i < size; i++) {
            avg += scores[i];
        }
        return (avg / size);
    }
}