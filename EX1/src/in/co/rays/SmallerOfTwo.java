package in.co.rays;
import java.util.Scanner;

public class SmallerOfTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("first number is");
		int a = sc.nextInt();
		System.out.print("second number is");
		int b = sc.nextInt();;
		System.out.println(a < b ? a : b);
		sc.close();
	}
	

}