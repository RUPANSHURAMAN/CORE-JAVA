package arrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class F {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		initializeArrayList(a);

		// REMOVE: If you want to remove an ele, you can remove it by giving index number.
		a.remove(1); // If 1 in ArrayList a then 1 will not be removed but ele
						// at index 1 will be removed
		a.remove(Integer.valueOf(1)); // To remove ele by value use
										// a.remove(Integer.valueOf(1)); as
										// Object type

		System.out.println(a);

		// CLEAR: While remove(), removes one ele, clear() removes all OF THE ELEMS.
		// (MEM alloc + eles are gone)
		initializeArrayList(a);
		a.clear();

		System.out.println(a); // []
		System.out.println(a.size()); // 0

		// REMOVEALL(): Mem alloc not gone but ele clear
		// Note: clear() will remove all ele's and mem alloc of all eles,
		// whereas removeAll() will remove only ALL ELEMS but not mem alloc
		initializeArrayList(a);
		a.removeAll(a);

		// But output of clear() and removeAll is same
		System.out.println(a); // []
		System.out.println(a.size()); // 0

		// CONTAINSALL(): will help us to compare the data of collection
		// (partially or all of other collection)
		initializeArrayList(a);
		ArrayList c = new ArrayList();
		c.add(20);
		c.add(1);
		System.out.println(a.containsAll(c)); // true

		c.clear();
		c.add(20);
		c.add(5);
		System.out.println(a.containsAll(c)); // false

		// To avoid storing hetero data we can do the following:
		ArrayList<Integer> b = new ArrayList<>();
		b.add(0);
		b.add(100);
		// a.add("Pankaj"); //ERROR as String Object is stored and Integer type
		// is added to arrayList
		initializeArrayList(a);
		
		//Clone
		a = (ArrayList) a.clone(); //returns OBject not object array
		System.out.println(a); //1, 100, 20, 200
		
		a.ensureCapacity(5); // min capacity 5 is maintained
		
		System.out.println(a.equals(c));//false
		
		System.out.println(a.indexOf(100));//1
		System.out.println(a.indexOf(0));//-1
		
		System.out.println(a.isEmpty()); //false
		
		a.lastIndexOf(20);
		//a.firstIndexOf(20);//ERROR no such method as for first indexOf can be used 
		
		ListIterator j = a.listIterator();
		j.hasPrevious();
		
		a.retainAll(b);
		System.out.println(a); // O/P: 100 //retains or keeps only those elements which are common
		
		a.set(0, 200);
		System.out.println(a);//200
	}

	private static void initializeArrayList(ArrayList a) {
		a.clear();

		a.add(1);
		a.add(100);
		a.add(20);
		a.add(200);
	}
}
