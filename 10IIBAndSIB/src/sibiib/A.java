package sibiib;

public class A {
/*
 *  IIB (INSTANCE INITIALIZATION BLOCK)
 *  1. IIB are used to initialize all the non-static and static vars and to call METHODS() in one place w/o creating object to access vars
 *  2. IIB's are executed when objects are created 
 *  3. number of times create object same number of times IIB called, 
 *  4. can't be used to create object unlike SIB [NO CTE, HALTING StackOverflow]
 *  5. and that gives us better readability of the code
 */
	//SIB ReFER A9 class

	{
		System.out.println("A"); // NOT PRINTED as object not created and so IIB will not be called
		test(); //static and non-static methods can also be accessed
		test1();
	}

	public static void main(String[] args) {

	}

	private void test() {
		
	}
	
	private static void test1() {
		
	}
}

//NEXT class is A2