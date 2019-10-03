package superkeyword;

/*
 *  for Super keyword first inheritance then super keyword 
 *  using super keyword we can access the members of parent class
 *  1. access static and non-static var of parent class
 *  2. constructor first stat
 */
class Be { // should not be public as not file on B name
	int i = 10;

	public void xyz() {
		System.out.println("xyz");
	}
}

class A extends Be {
	public static void main(String[] args) {
		A a1 = new A();
		a1.test();
	}

	public void test() {
		System.out.println(super.i); // not used in main as super can't be used in static method or context
		super.xyz();
	}
}
