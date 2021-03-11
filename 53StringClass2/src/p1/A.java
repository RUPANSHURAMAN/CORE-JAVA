package p1;

/*
 * Q. Print a given string in reverse manner w/o using built-in method reverse()?
 * A. given below
 */
public class A {
public static void main(String[] args) {
	String s1 = "testing";
	System.out.println(reverseMethod(s1));
}

public static String reverseMethod(String s1){
	int size = s1.length();
	String reverse = "";
	
	for(int i=size-1; i>=0; i--){
		reverse = reverse+s1.charAt(i);
	}
	
	return reverse;
}
}
