package arrayList;

import java.util.ArrayList;

/*
 * 1. List: 
 * 	* It's an interface
 * 	* Maintains insertion order
 * 	* Allows duplicate data
 * 
 * 		1.1 ArrayList
 * 			* It can contain duplicate items
 *  		* It maintains insertion order
 *   		* Allows random access of data*
 *    		* Internally implemented as dynamic arrays*
 */

public class A {
	public static void main(String[] args) {
		ArrayList a = new ArrayList(); //WARNING about type safety as using JDK1.7 check in this project
		a.add("Pankaj"); // JDK 1.8 doesn't support hetero
		a.add(Double.valueOf(10.3));
		a.add(String.valueOf(10));
		System.out.println(a);
		
		System.out.println(a.get(1)); // Random access
		
		System.out.println(a.size());// Finding out size of collection
	}
}
