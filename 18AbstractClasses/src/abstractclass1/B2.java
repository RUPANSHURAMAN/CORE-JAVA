package abstractclass1;

public class B2 extends A2{

	//abstract method or incomplete method must be completed to inherit
	public void test() {
		System.out.println("test");
	}
	
	public static void main(String[] args) {
		B2 b1 = new B2();
		b1.test();
		b1.xyz();
	}
}
