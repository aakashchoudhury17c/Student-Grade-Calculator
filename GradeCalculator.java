
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        for (int i = 1; i <= 5; i++) {
            double marks;

            while (true) {
                System.out.print("Enter marks for subject " + i
                        + " (0-100): ");

                if (!sc.hasNextDouble()) {
                    System.out.println("Please enter a valid number.");
                    sc.next();
                    continue;
                }

                marks = sc.nextDouble();

                if (marks >= 0 && marks <= 100) {
                    break;
                }
            
                System.out.println("Marks must be between 0 and 100.");
            }
        
            total += marks;
        }
        
        double percentage = total / 5;
        String grade;

        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 75) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\nTotal Marks: " + total + "/500");
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
