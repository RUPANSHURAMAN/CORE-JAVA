package arrayList;

import java.util.ArrayList;
import java.util.Collections;

// [Collections](class) in java is a class that helps us to perform sorting searching,
			//etc on [Collection](interface)
// Collection is used with collections(collections not used individually).

public class B {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(5);
		a.add(100);
		Collections.sort(a);
		System.out.println(a);
	}
}
