package comm.jsp.LogicalProgramming;
import java.util.Scanner;

public class Strong {
public static boolean isStrong(int n) {
	int sum=0; int temp=n;
	while (n>0) {
		int lastdigit=(n%10);
		int fact=1;
		while( lastdigit>0) {
			fact=fact*lastdigit;
			lastdigit--;
		}
		sum=sum+fact;
		n=n/10;
	}
	if(sum == temp) {
		return true;
	}
	else {
		return false;
	}
	
}

public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	int n = sc.nextInt();
	System.out.println(isStrong(n));
}
}
