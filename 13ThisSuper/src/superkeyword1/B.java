package superkeyword1;

/* 
 * by using super keyword we can access static and non-static member 
 * super keyword can't be used inside static context as inheritance so super keyword can be used super to call parent constructor
 */

class B extends A {
	public static void main(String[] args) {
		B b1 = new B();
		b1.test();
	}

	public void test() { // ERROR static void test() will be error for super keyword
		System.out.println(super.j);
	}
}
