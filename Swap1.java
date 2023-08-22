package comm.jsp.LogicalProgramming;
import java.util.Scanner;
public class Swap1 {
	public static void swapTwoNumbers(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a is "+a+" "+"b is "+b);
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a =scan.nextInt();
		System.out.println("Enter value of b");
		int b =scan.nextInt();
		swapTwoNumbers(a,b);
		
		
	}

}
