package Set02;

import java.util.Scanner;

public class ComparingNumber {

	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		
		int GivenNumber = 10;
		
		System.out.println("Enter the Nummber You want to compare");
		
		int EnteredNumber = s.nextInt();
		
		if(GivenNumber > EnteredNumber){
			System.out.println("Given Number is Greater!!");
		}
		else {
			System.out.println("Entered Number is Greater!!");
		}

	}

}
