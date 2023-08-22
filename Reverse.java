package comm.jsp.LogicalProgramming;
import java.util.Scanner;

public class Reverse {
	public static void reverseN(int n) {
		int rev = 0;
		while(n>0) {
			int lastdigit = (n%10);
			rev = rev*10+lastdigit;
			n=n/10;
		}
		System.out.println(rev);
	}
	public static void main(String args[]) {
	reverseN(12345);
	
	
	
	}

}
