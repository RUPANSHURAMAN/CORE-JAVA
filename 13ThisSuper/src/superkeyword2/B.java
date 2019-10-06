package superkeyword2;

public class B extends A {
	B() {
		// using super kwyoerd call constructor of super class only by child contructor but then we
		// should use super eyowrd in child class constructor and it should be the very first stat
		// super should be the first stat and also can't be called through method 
		// but if accessing method or field you can write super anywhere within
		// constructor or method similar like this should be first stat
		super();
	}

	public void method() {
		//super(); //ERROR must be first stat only in constructor() not method()
	}
	public static void main(String[] args) {
		new B();
	}
}
