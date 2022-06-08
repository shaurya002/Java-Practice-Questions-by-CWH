package Set03;

public class DetectingDoubleOrTrippleSpacesInStatement {

	public static void main(String[] args) {
		
		String str = "I am trying to find  double and   triple spaces in this paragraph";
        System.out.println(str.indexOf("  ")); //Index of Double Spaces 
        System.out.println(str.indexOf("   ")); //Index of Triple Spaces

	}

}
