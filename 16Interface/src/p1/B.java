package p1;

// we inherit the member of interface which is incomplete and then we override it with a complete method in subclass from test

/*public class B implements A{

}*/ //ERROR as B doesn't implement 

public class B implements A {
	public void test() {
		System.out.println("From test");

	}

	public void xyz() {
		System.out.println("From xyz");
	}

	public static void main(String[] args) {
		A a = new B(); // interface ref can be used to store implementing class mem addr but can't access members of class
		a.test();
		// a.xyz(); // ERROR as not in parent interface so not accessable
		
		B b = new B();
		b.test();
		b.xyz();
	}
}