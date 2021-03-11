package p1;

import p2.C;

public class B {
public static void main(String[] args) {
	A a1 = new A();
	System.out.println(a1.i);
	C c1 = new C(); //ERROR if C not imported as using object of diff package import is mandat 
					// NO INHERITANCE
}
}
