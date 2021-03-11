package p1;

// protected: same package, non-subclass
// Rule: can be accessed in same package, if to access in diff package use inheritance
public class A {
	protected int i =10;
	protected static int j = 20;
	
	protected void test(){
		System.out.println("Test");
	}
	
	protected static void test1(){
		System.out.println("Test1");
	}
}

/*
 * SUMMARY:
 * 1. If a member is made private, it can be accessed only in the same class
 * 2. If a member is made default, then it can be accessed only in the same class and anywhere 
 * 		in the same package but a diff package default will not work
 * 3. protected members can be accesed in same class, same package and diff package only through inheritance
 * 4. public can be accessed anywhere
 * 
 * Exercise: 
 * package p1;
class A{
	protected int i;
	void test(){
		syso("test");
	}
}

package p2;
import p1.A;
class B extends A{
	public static void main(String[] args) {
		B b1 = new B();
		syso(b1.i); //TRUE
		b1.test(); //ERROR
	}
}
 */
