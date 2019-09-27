package classes;

public class B {
	static int i;	// = 5;
	static B b = new B(); //static reference var outside methods but inside class
	// using static keyword and have global access

	public static void main(String[] args) {
		System.out.println(B.i);
		int m;
//		static int n; ERROR as static can't be declared inside method as it can't be local
		B b = new B();
		int num = 128;
		byte num1 = (byte) num;
		System.out.println(num + "  " + num1);
		System.out.println(b.i);
//		System.out.println(m); ERROR as local var needs to be initialized before use
		b.test();
	}

	public void test() {
		System.out.println(i);// or B.i by compiler
	}
}
