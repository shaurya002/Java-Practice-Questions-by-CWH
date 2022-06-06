package Set01;
import java.util.Scanner;

public class CGPAcalculation {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Grade Points of First Subject");
		int a = s.nextInt();
		
		System.out.println("Enter Grade Points of Second Subject");
		int b = s.nextInt();
		
		System.out.println("Enter Grade Points of Third Subject");
		int c = s.nextInt();
		
		System.out.println("CGPA: "+((a+b+c)/3));
		
		
	}
	
}
