package in.co.rays;
import java.lang.StringBuffer;

public class StringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Vijay");
		sb.append(" Dinanath Chauhan");
		
		System.out.println("Length : " + sb.length();
		System.out.println("'Capacity : " + sb.capacity();
		System.out.println("Char at : " + sb.charAt(1));
		System.out.println('Index Of : " + sb.indexOf("Dinanath"));
		System.out.println('Replace : " + sb.replace(0, 5, "Jay ");
		System.out.println("Reverse : " + sb.reverse();
	}

}
