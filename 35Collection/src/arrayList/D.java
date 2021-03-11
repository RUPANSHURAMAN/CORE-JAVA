package arrayList;

import java.util.ArrayList;
import java.util.Collections;

// To perform a search in a collection make sure that the data is sorted

public class D {
public static void main(String[] args) {
	ArrayList a = new ArrayList();
	a.add(5);
	a.add(20);
	a.add(100);
	a.add(200);
	a.add(1000);
	int index = Collections.binarySearch(a, 20);
	System.out.println(index);
	
	
	// If not sorted then wrong O/P and Sometimes ERROR of IndexOutOfBounds (NOW -1 in JDK8)
	ArrayList b = new ArrayList();
	b.add(1000);
	b.add(100);
	b.add(5);
	b.add(20);
	index = Collections.binarySearch(b, 20);
	System.out.println(index);
	
}
}
