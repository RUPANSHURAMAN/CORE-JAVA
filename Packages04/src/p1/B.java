package p1;

import p2.C;

public class B extends C{ //Inheritance, Import required as C is in diff package
public static void main(String[] args) {
	B b1 = new B();
	System.out.println(b1.j);
}
}
