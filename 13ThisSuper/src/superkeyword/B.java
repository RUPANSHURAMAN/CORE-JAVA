package superkeyword;

/*
 *  for Super keyword first inheritance then super keyword 
 *  1. using super keyword we can access static and non-static var of parent class in method(), any also
 *  2. super can't be used in static context like this keyword
 *  3. super can be used to call parent class contructor() but be first stat and ONLY in constructor() not 
 *  		method(), auto-placed by compiler if parent has no-args constructor as first stat in child constructor
 */

class B extends A {
	public static void main(String[] args) {
		B a1 = new B();
		a1.test();
	}

	public void test() {
		System.out.println(super.i); // not used in main as super can't be used in static method or context
		super.xyz();
	}
}
