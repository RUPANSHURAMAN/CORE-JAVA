
public class B3 extends A3 {
	@Override
	public void test1() {
		System.out.println("test1");
	}

	@Override
	public void test2() {
		System.out.println("test2");
	}

	public static void main(String[] args) {
		B3 b1 = new B3();
		b1.test1();
		b1.test2();
	}
}
