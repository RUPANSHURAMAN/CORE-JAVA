package p1;

import java.util.HashSet;

/*
 * 2. SET:
 * 	* It's an interface
 * 	* Does not maintain any insertion order
 * 	* Can't contain dup value
 * 		
 * 		2.1 HashSet
 * 			* Uses hash table internally
 *  		* Will contain only unique eles
 *   		* Does not maintain insertion order
 *   
 *   ELES to insert: 20, 73, 31, 62, 84, 96 mod 10
 *   							TABLE
 * 					++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * 					|		|		|		|		|		|		|		| 		     |
 * 					|	20	|	31	|	62	|	73	|	84	|	X	|	96	| 		X	 |
 * 					|		|		|		|		|		|		|		| 		     |
 * 					++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * 			HASH TABLE	0		1		2		3		4		5		6		7	 
 *   
 *   
 *   
 *   
 */
public class A {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(Integer.valueOf(10));
		//h.get(); ERROR as no get method there
		h.add(Double.valueOf(10.3));
		h.add(Integer.valueOf(100));
		h.add(Integer.valueOf(1010));
		
		System.out.println(h); //Order not maintained
		
	}
}
