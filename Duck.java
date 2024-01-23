package comm.jsp.LogicalProgramming;

import java.util.Scanner;

public class Duck{
	public boolean duckNumber(int num) {
		while(num>0) {
			int ld=num%10;
			if(ld==0) {
				return true;
			}
			num = num/10;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		Duck duck = new Duck();
		if(duck.duckNumber(n)) {
			System.out.println("It is a Duck Number");
		}else {
			System.out.println("It is not a Duck Number");
		}
		
		
	}
}