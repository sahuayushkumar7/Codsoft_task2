import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        // Taking marks input
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();

            // Validate marks
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Please enter between 0 and 100.");
                i--; // re-enter marks for the same subject
                continue;
            }
            totalMarks += marks[i];
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Grade calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 75) {
            grade = 'B';
        } else if (averagePercentage >= 60) {
            grade = 'C';
        } else if (averagePercentage >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}