package comm.jsp.LogicalProgramming;
import java.util.Scanner;

public class Swap2 {
		public static void swapTwoNumbers(int a,int b) {
			int temp=a;
			a=b;
			b=temp;
			
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



