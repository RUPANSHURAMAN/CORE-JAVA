package p4;
/*
 * Q. Creating an object of local inner class can we access members of outer class?
 * A. No. e.g. below
 */
public class A {
	int j = 20;
	static int k;
	class B{
		int i = 10;
//		static int k = 20;//ERROR
		final static int k = 20;
		/*static void test(){
			
		}*/
	}
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = a1.new B();
		System.out.println(b1.i);
		System.out.println(b1.k);
		//System.out.println(b1.j);// ERROR as can't access members of outer class by using innner class object
	}
}
