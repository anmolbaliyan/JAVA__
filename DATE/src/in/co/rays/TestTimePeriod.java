package in.co.rays;
import java.time.LocalDate;
import java.time.Period;

public class TestTimePeriod {
	public static void main(String[] args) {
		
		LocalDate td = LocalDate.now();
		System.out.println("today's date " + td);
		
		LocalDate dob = LocalDate.of(2003, 03, 9);
		System.out.println("DOB  " + dob);
		
		Period p = Period.between(td, dob);
		System.out.println(p.getYears() + "Years" + p.getMonths() + "Months" + p.getDays() + "Days");
	}

}
