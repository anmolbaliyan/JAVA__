package in.co.rays;

public class SwapNumber {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 0;
		
		System.out.println("a =" + a);
		System.out.println("b =" + b);
		
		System.out.println("----------------");
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("a =" + a);
		System.out.println("b =" + b);
	}

}
