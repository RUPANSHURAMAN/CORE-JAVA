package abstractclasss;

public class C extends B implements A{

	public void test() {
		System.out.println("From Test");
	}

	public void test1() {
		System.out.println("From Test1");
	}
	
	public static void main(String[] args) {
		C c = new C();
		c.test();
		c.test1();
	}

}
