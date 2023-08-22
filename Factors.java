package comm.jsp.LogicalProgramming;
import java.util.Scanner;
public class Factors {
	public static void factorsN(int a) {
		for(int i=1;i<=a;i++) {
			if (a%i==0) {
				System.out.print(i+ " ");
			}
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		factorsN(a);
	}
	
	

}
