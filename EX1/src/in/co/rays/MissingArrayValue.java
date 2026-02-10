package in.co.rays;

public class MissingArrayValue {

	public static int findMissing(int[] A, int[] B) {
		int xor = 0;

		for (int num : A) {
			xor ^= num;
		}

		for (int num : B) {
			xor ^= num;
		}

		return xor;
	}

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5 };
		int[] B = { 2, 3, 1, 5 };

		System.out.println("Missing element: " + findMissing(A, B));

	}

}
