//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class WeeklyTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for weekly income
        System.out.print("Enter your weekly income: $");
        double income = scanner.nextDouble();
        double taxRate;
        double taxWithheld;

        // Determine tax rate based on income
        if (income < 500) {
            taxRate = 0.10;
        } else if (income < 1500) {
            taxRate = 0.15;
        } else if (income < 2500) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }

        // Calculate tax withheld
        taxWithheld = income * taxRate;

        // Display result
        System.out.printf("Your weekly tax withholding is: $%.2f%n", taxWithheld);
    }
}
