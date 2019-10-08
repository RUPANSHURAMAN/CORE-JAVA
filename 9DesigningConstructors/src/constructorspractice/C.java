package constructorspractice;
// MEDIOCRE
public class C {
	C() {
		System.out.println("C");
	}

	public static void main(String[] args) {
		C c1 = new C();
		c1.test();
		System.out.println("main");
	}

	public void test() {
		System.out.println("from test");
	}
}
