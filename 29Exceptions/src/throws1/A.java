package throws1;
/* throws: throws keyword is always written down in front of a method. 
 * we cannot use this in front of a class or var.
 * throws keyword throws exception to the calling stat of the method 
 */

//REFER G.java and userdefinedexception4 Bank.java
public class A {

	public static void test() throws Exception{
		int i = 10/0;
	}
}
