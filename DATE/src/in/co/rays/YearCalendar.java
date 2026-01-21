package in.co.rays;

import java.util.Calendar;

public class YearCalendar {
	public static void main(String[] args) {

		int year = 2026;

		Calendar c = Calendar.getInstance();

		String[] months = { "January", "Februrary", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		
		for (int month = 0; month < months.length; month++) {
			
		
            c.set(year, month, 1);

            System.out.println("\n---------------- " + months[month] + " " + year + " ----------------");
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            // Find first day of month
            int firstDay = c.get(Calendar.DAY_OF_WEEK);

           
            for (int i = Calendar.SUNDAY; i < firstDay; i++) {
                System.out.print("    ");
            }

            // Number of days in month
            int maxDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);

            // Print dates
            for (int day = 1; day <= maxDay; day++) {
                System.out.printf("%3d ", day);

                if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                    System.out.println();
                }

                c.add(Calendar.DAY_OF_MONTH, 1);
            }

            System.out.println();
		}

	}

}
