package exetndsimplements;

//* always we use extends first and then implements
public class C extends B implements A {
	public void test1() {
		System.out.println("From test1");
	}

	public static void main(String[] args) {
		C c1 = new C();
		c1.test1();
		c1.test2();
	}

}
