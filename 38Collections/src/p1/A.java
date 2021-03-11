package p1;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * TreeSet (only homo data implicitly): 
 * 	* Contains unique eles only like HashSet
 * 	* maintains ascending order
 */
public class A {
	public static void main(String[] args) throws InterruptedException {
		TreeSet s = new TreeSet(new Comparator() {

			public int compare(Object arg0, Object arg1) {
				return ((Integer)arg0).compareTo((Integer)arg1);
			}
		});
		s.add(Integer.valueOf(5));
		s.add(Integer.valueOf(50));
		//s.add(Double.valueOf(50.2));//Exception as by default only allows homo data
		s.add(Integer.valueOf(50)); // No EXCEPTION as it removes copy of ele
		s.add(Integer.valueOf(15));
		s.remove(Integer.valueOf(0));//No EXCEPTION OR ERROR as no ele there
		System.out.println(s);//[5, 15, 50]
		
		//s.add("test"); // EXCEPTION NOt ERROR: throws ClassNotException when hetero data try to store
		
		
		//Sorting of string
		s = new TreeSet();
		s.add("xyz");
		s.add("test1");
		s.add("rama");
		System.out.println(s); //[rama, test1, xyz]
		
		// ALL in one e.g.
		s = new TreeSet();
		s.add("xyz");
		s.add("test1");
		s.add("rama");
		System.out.println(s.size());//3
		System.out.println(s.contains("test1")); // true
		
		System.out.println(s.ceiling("m"));//Returns the least element in this set greater than or equal to the given element, or null if there is no such element.
						//O/P rama
		
		System.out.println(s.descendingSet());//[xyz, test1, rama]
		
		System.out.println(s.first()); //rama
		
		System.out.println(s.floor("test"));//rama
			//Returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
		
		System.out.println(s.headSet("test")); //[rama]
		//Returns a view of the portion of this set whose elements are less than (or equal to, if inclusive is true) toElement.
		System.out.println(s.headSet("test1", true)); //2nd arg inclusive //[rama, test1]
		
		System.out.println(s.higher("test")); //test1
		
		System.out.println(s.last()); //xyz
		
		System.out.println(s.lower("test1")); //rama
		
		System.out.println(s.subSet("rama", "test1"));//[rama]
			//Returns a view of the portion of this set whose elements range from fromElement to toElement.
		System.out.println(s.subSet("rama",true, "test1", true)); //[rama, test1]
		
		System.out.println(s.tailSet("test1"));//[test1, xyz]
			//Returns a view of the portion of this set whose elements are greater than or equal to fromElement.
		System.out.println(s.tailSet("test1", true)); //[test1, xyz]
		
		System.out.println(s); //[rama, test1, xyz]
		System.out.println(s.pollFirst());//rama
		System.out.println(s); //[test1, xyz]
		System.out.println(s.pollLast()); //xyz
		System.out.println(s); //[test1]
	}
}
