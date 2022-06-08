package Set04;

import java.util.Scanner;

public class FullNameOfGivenSite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your website name: ");
        String website = sc.nextLine();
        if(website.endsWith(".com")){
            System.out.println("Its Commercial website!");
        }
        else if(website.endsWith(".org")){
            System.out.println("Its Organisational website!!");
        }
        else if(website.endsWith(".in")){
            System.out.println("Its an Indian website!!!");
        }

	}

}
