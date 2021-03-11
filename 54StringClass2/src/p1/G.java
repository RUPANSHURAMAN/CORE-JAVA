package p1;

/*
 * 		=========		=========		=========		=========
 * 		|		|		|		|		|		|		|		|
 * 		|	A	|		|	A	|		|	B	|		|	A	|
 * 		|		|		|		|		|		|		|		|
 * 		=========		=========		=========		=========
 * 		 s1, s3				s2				s4				s5
 */
public class G {
public static void main(String[] args) {
	String s1 = "A"; //search and then create
	String s2 = new String("A"); //create
	String s3 = "A";// search and reuse
	String s4 = "B";// search and create new one
	String s5 = new String("A"); // create
	
	System.out.println(s1==s2); //false
	System.out.println(s1==s3);//true
	System.out.println(s1.equals(s2));//true
	System.out.println(s4==s1); //false
	
	
	/*
	 * String class is immutable class.
	 * 
	 * IMMUTABLE
	 * 									  ===
	 * e.g. String s1 = "A";--------XX--->|A|	GarbageCollected()
	 * 									  ===
	 * 	  					  ===
	 * s1 = "B";--------XX--->|B|	GarbageCollected()
	 * 						  ===
	 * 
	 * 						  ===
	 * s1 = "C";------------->|C|	GC()
	 * 						  ===
	 */
	
}
}
