package p1;

public class D {
public static void main(String[] args) {
	String s1 = new String("Hello");
	String s2 = new String("hello");
	
	System.out.println(s1==s2); //false
	System.out.println(s1.equals(s2)); //false
}
}
