package in.co.rays;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number term ");
		int a = sc.nextInt();
		int first = 0, second = 1;
		
		System.out.print("Fibonaci Series is: ");
		for (int i = 1;i<=a;i++) {
			System.out.print(first + " ");
			
			int next = first + second;
			first = second;
			second = next;
		}
		sc.close();
	}

}
