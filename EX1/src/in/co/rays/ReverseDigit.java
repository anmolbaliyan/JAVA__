package in.co.rays;
import java.util.Scanner;

public class ReverseDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int a = sc.nextInt();
		int reversed = 0;
		while(a != 0) {
			int digit = a % 10;
			reversed = reversed * 10 + digit;
			a =a/10;
		}
		System.out.println("reversed number is "+reversed);
		sc.close();
		
	}

}
// anshul4141