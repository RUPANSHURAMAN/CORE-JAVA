//overrring static methods it's not possible
public class B1 extends A1{

	@Override
	public void test1() {
		System.out.println("test1");
	}
	
	public static void main(String[] args) {
		B1 b1 = new B1();
		b1.test1();
		b1.test2();
	}
}
