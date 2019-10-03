package constructors;

/*
 * CONSTRUCTOR Rule :
 * 1) The name of constructor should be same as <class-name> 
 * 2) constructor will be executed only when object is created 
 * 3) sf is not allowed
 * 4) multiple constructors in the same class provided they are differentiated based on number of args and/or type
 */
class A {
	A() {
		System.out.println("A");// not printed as object not created in main()
	}
}

public class Eight {

	public static void main(String[] args) {
		// not created object
	}
}
