package in.co.rays;
import java.util.Date; 

public class TestDate {
	public static void main(String[] args) throws InterruptedException {
		Date d = new Date();
		System.out.println(d);
		
		System.out.println("-------------------");
		
		while (true) {
			Date d1 = new Date();
			Thread.sleep(1000);
			System.out.println(d1);
		}
	}

}
