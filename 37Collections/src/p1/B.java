package p1;

import java.util.HashSet;
//For the above e.g. the default no. of rows in a table will be 16 and load ratio will be 0.75f

public class B {
	public static void main(String[] args) {
		HashSet h = new HashSet(32);
		System.out.println(h);
		
		// In the above e.g. the total no. of rows will be 32 but the load ratio by default will be 0.75f
	}
}
