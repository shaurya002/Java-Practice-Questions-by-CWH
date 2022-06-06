package Set01;
import java.util.Scanner;

public class SumOfThreeNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int a = s.nextInt();
		
		System.out.println("Enter Second Number");
		int b = s.nextInt();
		
		System.out.println("Enter Third Number");
		int c = s.nextInt();
		
		System.out.println("Sum of Three Numbers are: "+(a+b+c));
		
	}

}
