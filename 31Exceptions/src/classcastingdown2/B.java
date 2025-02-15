package classcastingdown2;

import classcastingdown1.A;
/*
 * To perform successful downcasting we will firstly 
 * 1. create object of parent class 
 * 2. then create object of child class then *do upcasting and *then downcasting as shown in this package
 */

public class B extends A {

	static int j = 20;

	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B();
		a1 = b1;
		b1 = (B) a1;
		System.out.println(b1.i); //non-static
		System.out.println(b1.j); //static
	}
}
