import java.util.Scanner;

public class GradeStatistic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        int numberOfGrades = 10;

        System.out.print("Enter " + numberOfGrades + " grades (0-100): ");

        for (int i = 1; i <= numberOfGrades; i++) {
            double grade = -1;

            // Check if input is valid
            while (grade < 0) {
                System.out.print("Grade " + i + ": ");
                if (input.hasNextDouble()) {
                    grade = input.nextDouble();
                    if (grade < 0) {
                        System.out.println("Invalid grade. Grade cannot be negative.");
                    }
                } else {
                    System.out.println("Invalid grade. Please enter a numbber");
                    input.next(); // clears invalid input
                }
            }

            sum += grade;
            if (grade > max) max = grade;
            if (grade < min) min = grade;
        }
        double average = sum / numberOfGrades;

        System.out.printf("Average grade: %.2f\n" , average);
        System.out.printf("Maximum grade: %.2f\n" , max);
        System.out.printf("Minimum grade: %.2f\n" , min);

        input.close();

    }
}
