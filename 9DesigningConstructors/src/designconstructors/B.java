package designconstructors;

public class B {
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println("main");
	}

	B() {
		System.out.println("B");
		return; // CORRECT as constructor return type is void
	}
}
