package Set02;

import java.util.Scanner;

public class WritingExpression {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Enter the Value of v");
		int v = sc.nextInt();
		
		System.out.println("Enter the Value of u");
		int u = sc.nextInt();
		
		System.out.println("Enter the Value of a");
		int a = sc.nextInt();
		
		System.out.println("Enter the Value of s");
		int s = sc.nextInt();
		
		int frmla = ((v*v) - (u*u));
		
		System.out.println("(v^2 - u^2)/2as: "+ (frmla/(2*a*s)));

	}

}
