package thiskeyword;

//this can be used to access non-static, static vars but you CANNOT access local vars
public class A1 {
	int i = 10;
	static int j = 20;

	public static void main(String[] args) {
		A1 a1 = new A1();
		A1 a2 = new A1();
		System.out.println(a1);
		System.out.println(a2);
		a1.test(); // this pointer points to a1 as this is currently used object
		// a2.test(); //if a2 used then this pointer points to a2 as this is currently used object
	}

	public void test() {

		System.out.println(this); // points to a1 as currently object used, so there are not multiple this
									// pointers for every object
		System.out.println(this.i);
		System.out.println(this.j); // [this] can be used to access static keyword

		this.test1(); // so can be used to called static and non-static method
		this.test2();
	}

	public static void test1() {
		// System.out.println(this); // ERROR//this keyword can't be used inside static
										// context [meaning can't be used in static method its a limitation
		// NOTE: ref can work in static and non-static context but [this] can't be in static method

	}

	public void test2() {
		System.out.println("From test2");
	}

}
