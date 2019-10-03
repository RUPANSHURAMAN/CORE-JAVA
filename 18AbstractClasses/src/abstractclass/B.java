package abstractclass;

//we can never create object of abstract class but then abstract class CAN consists of main()
abstract public class B {

	public static void main(String[] args) {
		// B b1 = new B(); //ERROR as abstract class can't be instantiated
		// b1.test();
	}

	public void test() {
		System.out.println("test");
	}
}
