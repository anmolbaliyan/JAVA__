package in.co.rays;

public class PrimeNumber {
	public static void main(String[] args) {
		int i = 7;
		if (i % 2 != 0) {
			System.out.println("number is prime: "+ i);
		}
		else {
			System.out.println("the number is not prime: "+ i);
		}
	}

}

/*public class PrimeNumber {
	public static void main(String[] args) {

		int no = 7;
		int count = 0;

		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				count++;
			}
		}

		if (count > 0) {
			System.out.println(no + " is not prime no");
		} else {
			System.out.println(no + " is prime no");
		}

	}
}*/