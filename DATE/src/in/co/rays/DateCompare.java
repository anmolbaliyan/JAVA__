package in.co.rays;
import java.time.LocalDate;

public class DateCompare {
	public static void main(String[] args) {
		
		if (args.length < 2 ) {
			
			System.out.println("Please provide start date and end day");
			return;
		}
		String start = args[0];
		String end = args[1];
		
		LocalDate sd = LocalDate.parse(start);
		LocalDate ed = LocalDate.parse(end);
		
		if (ed.isBefore(sd)) {
			System.out.println("ERROR: end date is less than start date ");
		}
		else {
			System.out.println("Dates are Correct");
		}
	}

}
