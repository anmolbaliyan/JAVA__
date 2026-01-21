package in.co.rays;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormating {
	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("Default Date Format" + d);
		
		String s = sdf.format(d);
	
		System.out.println("new format of Date " + s);
		
		System.out.println("------------------------");
		
		String dob = "2003-03-09";
		
		System.out.println("string dob " + dob);
		
		Date date = sdf.parse(dob);
		
		System.out.println("default format " + date );
		
	}

}
