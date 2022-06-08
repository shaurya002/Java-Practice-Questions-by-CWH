package Set03;

import java.util.Scanner;

public class ReplacingSpaceWithUnderscores {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Statement: ");
		String str = s.nextLine();
		
		System.out.println("Replaced New Statement: "+(str.replace(' ', '_')));

	}

}
