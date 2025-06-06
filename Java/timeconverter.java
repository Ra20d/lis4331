import java.util.Scanner;

public class TimeConverter {

    // Constants
    private static final int SECS_IN_MIN = 60;
    private static final int MINS_IN_HR = 60;
    private static final int HRS_IN_DAY = 24;
    private static final int DAYS_IN_WEEK = 7;
    private static final int DAYS_IN_YR = 365;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");

        // Check if the input is a valid integer
        if (scanner.hasNextInt()) {
            int seconds = scanner.nextInt();

            int minutes = seconds / SECS_IN_MIN;
            int hours = minutes / MINS_IN_HR;
            int days = hours / HRS_IN_DAY;
            int weeks = days / DAYS_IN_WEEK;
            int years = days / DAYS_IN_YR;

            // Print results using printf()
            System.out.printf("Seconds: %d%n", seconds);
            System.out.printf("Minutes: %d%n", minutes);
            System.out.printf("Hours: %d%n", hours);
            System.out.printf("Days: %d%n", days);
            System.out.printf("Weeks: %d%n", weeks);
            System.out.printf("Years: %d%n", years);
        } else {
            System.out.println("Not a valid integer input.");
        }

        scanner.close();
    }
}