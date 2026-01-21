package in.co.rays;
import java.util.Calendar;
import java.util.Date;

public class Maintainance {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		for (int i = 1; i <= 12; i++) {
			
			c.add(Calendar.DATE, 30);
			
			Date nm = c.getTime();
			System.out.println("Next Maintainance " + nm);
		}
	}

}
