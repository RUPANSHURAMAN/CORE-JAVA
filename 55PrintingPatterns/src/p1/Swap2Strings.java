package p1;

public class Swap2Strings {
public static void main(String[] args) {
	
	String xString = "Rupanshu";
	String yString = "Raman";
	xString = xString + yString;
	yString = xString.substring(0, xString.length()-yString.length());
	xString = xString.substring(yString.length(), xString.length());
	
	System.out.println(xString + " " + yString);
}
}
