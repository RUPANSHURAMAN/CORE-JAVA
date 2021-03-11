package p11;

/*
 * We cannot create main method inside local inner class as main() is static
 * BUT
 * We can create main() inside static inner class but then it will execute when we call it
 */
public class A {
	static class B{
		int j = 10;
		public static void main(String[] args) {
			int i = 100;
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.j);
		B.main(null); // as default args = null class
	}
}
