package Set02;

import java.util.Scanner;

public class DecryptingGrade {

	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		
		char grade = 'D';
		
		System.out.println("Encrypted Grade: "+ grade);
		
		System.out.println("Decrypted Grade: "+((char)(grade+8)));

	}

}
