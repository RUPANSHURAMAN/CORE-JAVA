package constructors;

/* CONSTRUCTOR Rule :
 * 1) The name of constructor should be same as <class-name> 
 * 2) multiple constructors in the same class, differentiated based on number of args and/or type ||(like overloading)
 * 3) constructor will be executed only when object is created || same constructor can't be used to create object, use different
 * 4) constructor auto placed if NO constructor declared, if arg constructor there then NOT auto place
 * 4) sf is not allowed, only public, private, protected is allowed
 * 5) return type of constructor is always void hence we can use only return keyword in it 
 */

/*  Constructor vs. method: 
 *  1. a method can be void or it can have return type but constructor always void by default
 *  2. method is executed when we call it but a constructor executed on object creation
 */

// overloading: we create multiple methods with same name but then are differentiated on number and/or type of args
// overrrdiing same return type, name and args (no and type)
// polymorphism is run time and compile time, as overrrdiing happens when .class file runs whereas compile time happens [during] 
			//.class file is being created

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
