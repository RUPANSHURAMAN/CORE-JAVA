package finalkeyword;

public class C {

	public static void main(String[] args) {
		C c1 = new C();
		c1.test(10);
	}
	
	public void test(final int i) {
		//i = 30; ERROR as final var can't be changed
		System.out.println(i);
	}
}
