package comm.jsp.LogicalProgramming;
import java.util.Scanner;

public class Factorial {
	public static void factNum(int n) {
		int fact=1;
		while(n>0) {
			fact=fact*n;
			n--;
		}
		System.out.println(fact);
	}
	

public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	int n = sc.nextInt();
	factNum(n);

}
}
