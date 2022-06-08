package Set04;

import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Mark of Sub1");
		int s1 =s.nextInt();
		
		System.out.println("Enter the Mark of Sub2");
		int s2 =s.nextInt();
		
		System.out.println("Enter the Mark of Sub3");
		int s3 =s.nextInt();
		
		if((s3>33 && s1> 33 && s2>33) && (((s1+s2+s3)/3)>40)){
			System.out.println("You are Pass.");
		}
		else {
			System.out.println("You are fail.");
		}
		
		

	}

}
