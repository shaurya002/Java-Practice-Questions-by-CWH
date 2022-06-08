package Set04;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the Year: ");
		int year = s.nextInt();
		
		if(year%4 == 0) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Its Not a Leap Year");
		}

	}

}
