package superkeyword3;

public class B extends A {

	B() {// if we don't keep super keyword inside child class constructor then compiler
			// will automatically place the super keyword such that it can call only no-args
			// constructor of parent class

	}

	public static void main(String[] args) {
		new B();
	}
}
