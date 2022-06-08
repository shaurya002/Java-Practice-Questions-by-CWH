package Set03;

import java.util.Scanner;

public class ToLowerCase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = s.nextLine();
		
		System.out.println("String in Lower Case: "+(str.toLowerCase()));
	}

}
