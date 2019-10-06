package polymorphism2;

public class B extends A {
	@Override
	public void test1() {
		System.out.println("test1");
	}

	@Override
	public void test2() {
		System.out.println("test2");
	}

	public static void main(String[] args) {
		B b1 = new B();
		b1.test1();
		b1.test2();
	}
}
