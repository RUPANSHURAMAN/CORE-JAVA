package p13;

import p12.B;

// Inner class can implement an interface
public class A {

	public class C implements B {
		public void test() {
			System.out.println("From test");
		}

		public void test1() {
			// TODO Auto-generated method stub
			
		}

		/*void test1() {// ERROR as reducing visibility of method inherited
			// TODO Auto-generated method stub
			
		}*/
	}

	public static void main(String[] args) {
		A a1 = new A();
		C c1 = a1.new C();
		c1.test(); // O/P: From test
	}
}
