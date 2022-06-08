package Set04;

import java.util.Scanner;

public class TaxCalculation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Your Salary: ");
		int sal = s.nextInt();
		
		double a = 0.05;
		double b = 0.2;
		double c = 0.3;
		
		
		if(250000 <= sal && sal <= 500000) {
			System.out.println("Tax will be: "+((sal)*a));
		}
		else if(500000 < sal && sal <= 1000000) {
			System.out.println("Tax will be: "+((sal)*b));
		}
		else if(sal>1000000) {
			System.out.println("Tax will be: "+((sal)*c));
		}
		else {
			System.out.println("Your Salary is less than 2.5 lakh.");
		}

	}

}
