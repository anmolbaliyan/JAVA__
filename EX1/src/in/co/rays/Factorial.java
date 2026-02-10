package in.co.rays;

public class Factorial {
	public static void main(String[] args) {
		//int n = 1;
		int f = 10;
		
		for (int i = f; i > 0; i--) {
			f = f * i;
		}
		System.out.println("Factorial of F: " + f );
	}

}
