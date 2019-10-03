package superkeyword;

//using super how to call constructor
class A3 {
	A3() { // constructor A3 never gets inherited to class C
		System.out.println("A3");
	}
}

public class C extends A3 {
	C() {
		// using super kwyoerd call constructor of super class only by child contructor but then we
		// should use super eyowrd in child class constructor and it should be the very first stat
		// super should be the first stat and also can't be called through method 
		// but if accessing method or field you can write super anywhere within
		// constructor or method similar like this should be first stat
		super();
	}

	public static void main(String[] args) {
		new C();
	}
}
