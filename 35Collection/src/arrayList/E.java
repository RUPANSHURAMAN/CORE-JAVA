package arrayList;

import java.util.ArrayList;

// CONTAINS: If ele present returns true else false
public class E {
public static void main(String[] args) {
	ArrayList a = new ArrayList();
	a.add(5);
	a.add(20);
	a.add(100);
	a.add(200);
	a.add(1000);
	System.out.println(a.contains(20)); //true
	System.out.println(a.contains(198)); //false
}
}
