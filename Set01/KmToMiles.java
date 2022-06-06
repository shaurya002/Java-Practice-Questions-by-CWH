package Set01;
import java.util.Scanner;

public class KmToMiles {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Distance into Km");
		int a = s.nextInt();
		
		System.out.println("Distance in miles: "+(a*0.621));
	}

}
