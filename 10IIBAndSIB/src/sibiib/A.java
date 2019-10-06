package sibiib;

public class A {
/*
 *  IIB (INSTANCE INITIALIZATION BLOCK)
 *  1. IIB are used to initialize all the non-static and static vars in one place
 *  2. IIB's are executed when objects are created 
 *  3. number of times create object same number of times IIB called, 
 *  4. can't be used to create object unlike SIB [NO CTE, HALTING StackOverflow]
 *  5. and that gives us better readability of the code
 */
	//SIB ReFER A9 class

	{
		System.out.println("A"); // NOT PRINTED as object not created and so IIB will not be called
	}

	public static void main(String[] args) {

	}
}

//NEXT class is A2