package superkeyword;

/*
 *  1. for Super keyword first inheritance then super keyword 
 *  2. using super keyword we can access static and non-static var of parent class in method(), any also
 *  3. super can't be used in static context like this keyword
 *  4. super can be used to call parent class contructor() but be first stat and ONLY in constructor() not 
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
