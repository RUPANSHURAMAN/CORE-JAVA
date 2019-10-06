package polymorphism1;
//overriding static methods it's not possible as not inherited at first place
public class B extends A {

	@Override
	public void test1() {
		System.out.println("test1");
	}

	public static void main(String[] args) {
		B b1 = new B();
		b1.test1();
		b1.test2();
	}
}
