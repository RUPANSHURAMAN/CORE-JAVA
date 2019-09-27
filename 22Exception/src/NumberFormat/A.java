package NumberFormat;
// NumberFormatException: An invalid conversion of a string into number leads to numberFormatException.
public class A {

	public static void main(String[] args) {
		String s = "test";
		int i = Integer.parseInt(s); //NFE as test is not int
		System.out.println(i);	
	}
	
}
