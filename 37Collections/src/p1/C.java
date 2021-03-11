package p1;

import java.util.HashSet;
import java.util.Iterator;

public class C {
public static void main(String[] args) {
	HashSet h = new HashSet(30, 0.90f);
	h.add(Integer.valueOf(10));
	h.add(Double.valueOf(10.3));
	h.add(Integer.valueOf(100));
	h.add(Integer.valueOf(1010));
	h.contains(Integer.valueOf(1010));
	System.out.println(h);
	
	// In the above e.g no of rows is 30 and load ratio is 0.90f(27 filled the 32->64)
	
	// SIZE of no. of eles not hashtable size
	System.out.println(h.size()); //4
	
	// REMOVE not works as not index based
	//h.remove(1); // ERROR: NOt works as insertion order is not maintained
	
	// REMOVE works by DATA item
	h.remove(Double.valueOf(10.3));
	
	// REMOVEALL
	h.removeAll(h);
	System.out.println(h.size()); // 0
	System.out.println(h); // []
	
	// CONTAINS
	System.out.println(h.contains(Double.valueOf(10.3))); //false as removed
	
	// Note: Collection should not be applied on SET as SET has already has got a seperate technique to sort
	
	h.add(Integer.valueOf(45));
	h.add(Integer.valueOf(87));
	h.add(Integer.valueOf(25));
	h = (HashSet) h.clone();
	System.out.println(h);
	
	Iterator iterator = h.iterator();
	while (iterator.hasNext()) {
		Object object = (Object) iterator.next();
		System.out.println(object);
	}
}
}
