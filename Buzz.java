package comm.jsp.LogicalProgramming;

public class Buzz {
	public static void buzzNumber(int n) {
		int ld=n%10;
		if(ld==7) {
			System.out.println("Buzz Number");
		}else if(n%7==0) {
			System.out.println("Buzz Number");
		}else {
			System.out.println("Not a Buzz Number");
		}
		
	}
	
	public static void main(String[] args) {
		buzzNumber(58);
	}
}