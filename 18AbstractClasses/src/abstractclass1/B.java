package abstractclass1;

public class B extends A{

	//abstract method or incomplete method must be completed to inherit
	public void test() {
		System.out.println("test");
	}
	
	public static void main(String[] args) {
		B b1 = new B();
		b1.test();
		b1.xyz();
	}
}
