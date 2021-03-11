package p1;

/*
 * String:
 *  ==: Compares memory addresses of String object.
 *  
 *  .EQUALS(): Compares values in String
 */
public class C {
public static void main(String[] args) {//         |======|
	String s1 = new String("xyz");// ------------> |  xyz | <-s1
								//				   |======|
	
												//  |======|
	String s2 = new String("xyz"); //------------>  | xyz  | <-s2
											  //    |======|
	System.out.println(s1==s2); // false
	System.out.println(s1.equals(s2)); // true //OR .contentEquals(String)
	
}
}
