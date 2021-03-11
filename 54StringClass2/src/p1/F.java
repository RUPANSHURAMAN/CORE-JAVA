package p1;

/*
 * 		=================		=================		=================		=================
 * 		|				|		|				|		|				|		|				|
 * 		|				|		|				|		|				|		|				|
 * 		|	   xyz		|		|		xyz		|		|	 	xyz		|		|		xxx		|
 * 		|				|		|				|		|				|		|				|
 * 		|				|		|				|		|				|		|				|
 * 		=================		=================		=================		=================
 * 				s1  					s2						s5					s3, s4, s6
 */
public class F {
	public static void main(String[] args) {
		// new Syntax can't be reused, e.g. s1, s2, s5
		String s1 = new String("xyz");
		String s2 = new String("xyz");
		
		//creates new objects is new String not reusable or =value are reusable e.g. s3, s4
		String s3 = "xyz";
		String s4 = "xyz";
		String s5 = new String("xyz");
		String s6 = "xyz";
		
		System.out.println(s1==s2); // false
		System.out.println(s3==s4); // true
		System.out.println(s5==s3); // false
		System.out.println(s6==s3); // true
		
	}
}
