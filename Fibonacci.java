package comm.jsp.LogicalProgramming;

import java.util.Scanner;

public class Fibonacci {
	public void isFibonacci(int n) {
		int a = 0;
		int b = 1;
		for (int i = 1; i <= n; i++) {
			System.out.println(a);
			int c = a + b;
			a=b;
			b=c;
		
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of series:");
		int n = sc.nextInt();
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.isFibonacci(n);

	}

}
