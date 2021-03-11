package arrayList;

import java.util.ArrayList;
import java.util.Collections;

// A collection can be sorted only when there is homo data stored in it. or else we will get exception
public class C {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(5);
		a.add(100);
		a.add("Pankaj");
		Collections.sort(a); // EXCEPTION of ClassCastException on compareTo
	}
}
