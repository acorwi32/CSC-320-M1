import java.util.Scanner;
import java.util.ArrayList;

public class WeeklyTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Store days and temperatures
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temps = new ArrayList<>();

        // Days of the week
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        // Temperatures for each day
        temps.add(85.0); // Monday
        temps.add(90.0); // Tuesday
        temps.add(95.0); // Wednesday
        temps.add(88.0); // Thursday
        temps.add(91.0); // Friday
        temps.add(97.0); // Saturday
        temps.add(100.0); // Sunday

        String selectedDay;
        while (true) {
            // Prompt user to input day or entire week
            System.out.print("Type a day of the week (ex. Monday) or type \"week\" to see all");
            selectedDay = input.nextLine();

            if (selectedDay.equalsIgnoreCase("week")) {
                double total = 0;

                System.out.println("\nWeekly Temperatures: ");
                for (int i = 0; i < days.size(); i++) {
                    System.out.println(days.get(i) + ": " + temps.get(i) + "°");
                    total += temps.get(i);
                }

                double avg = total / days.size();
                System.out.printf("Weekly Temperatures: %.2f\n", avg);
                break; //exit loop
            }

            boolean found = false;

            for (int i = 0; i < days.size(); i++) {
                if (days.get(i).equalsIgnoreCase(selectedDay)) {
                    System.out.println(days.get(i) + "'s temperature: " + temps.get(i) + "°");
                    found = true;
                    break;
                }
            }

            if (found) {
                break; //valid day
            } else {
                System.out.println("Invalid day. Please enter a valid day or type \"week\" to see all");

            }
        }

        input.close();
    }
}