package superkeyword4;

import superkeyword3.A;
public class B extends A {

	// if you don't create child class constructor w/o arg compiler will
	// automatically place no-args constructor along with super keyword

	/*
	 * //added by compiler E(){ super(); }
	 */

	public static void main(String[] args) {
		new B();
	}
}
