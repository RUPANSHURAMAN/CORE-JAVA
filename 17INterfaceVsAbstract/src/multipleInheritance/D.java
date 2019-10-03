package multipleInheritance;

public class D implements C {
	public void test1() {
		System.out.println("test1");
	}

	public void test2() {
		System.out.println("test2");
	}

	public void test3() {
		System.out.println("test3");
	}

	public static void main(String[] args) {
		D d = new D();
		d.test1();
		d.test2();
		d.test3();
	}
}

//Question: Can we use extends and implements together in the same class??