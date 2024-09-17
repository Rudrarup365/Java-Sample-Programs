package JavaPackage;
import java.util.Calendar;

public class CalendarCreate {

	public static void main(String[] args) {
        // Set the year and month you want to display the calendar for
        int year = 2024;
        int month = 9;  // September (0-based, 0 = January, 11 = December)

        // Create a calendar instance and set it to the first day of the given month and year
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1); // Since CalendarCreate months are 0-based
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        // Get the day of the week of the first day of the month
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Get the number of days in the month
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Print the calendar
        System.out.println("     " + calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, java.util.Locale.ENGLISH) + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Print leading spaces for the first week
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("   ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);
            
            // Move to the next line after Saturday
            if ((day + firstDayOfWeek - 1) % 7 == 0) {
                System.out.println();
            }
        }
    }

}
