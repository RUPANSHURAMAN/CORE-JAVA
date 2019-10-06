package polymorphism;

public class B extends A {
	int i = 20;

	@Override
	public void test() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B b1 = new B();
		b1.test();

		A a1 = new A();
		a1.test();

		System.out.println(b1.i); // var can't be overrided
	}
}
