package p2;

import p1.A; //IMport as in diff package

public class B extends A{
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.i); //NO ERROR as protected can be accessed in diff package by inheritance
		System.out.println(b1.j); //NO ERROR as protected can be accessed in diff package by inheritance
		b1.test(); ////ERROR as protected can be accessed in diff package by inheritance and main() also
		b1.test1(); ////ERROR as protected can be accessed in diff package by inheritance and main() also
	}
}
