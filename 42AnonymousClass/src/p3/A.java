package p3;

import p2.C;
// NOT OVERRIDING as C is simple class not interface 
public class A {
	public static void main(String[] args) {
		C c1 = new C(){
			
		};
		c1.test(); // From test
	}
}
