package in.co.rays;
import java.util.Scanner;

public class Diamond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int d = sc.nextInt();

        for (int i = 1; i <= d; i++) {
            for (int j = i; j < d; j++) {
                System.out.print(" ");
            }
           
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

       
        for (int i = d - 1; i >= 1; i--) {
            for (int j = d; j > i; j--) {
                System.out.print(" ");
            }
      
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }

}
