package sibiib;

public class A {
/*
 *  IIB (INSTANCE INITIALIZATION BLOCK)
 *  1. IIB's are executed when objects are created 
 *  2. number of times create the object same number of times IIB will be called, [can't be used to create object unlike SIB no cte, halt]
 *  3. IIB are used to initialize all the [instance] vars i.e. non-static vars in one place
 *  4. and that gives us better readability of the code
 */

	{
		System.out.println("A"); // NOT PRINTED as object not created and so IIB will not be called
	}

	public static void main(String[] args) {

	}
}

//NEXT class is A2