package sibiib;

/*
 *  SIB (STATIC INITIALIZATION BLOCK)
 *  1. SIB used to initialize all static vars in one place, can't initialize non-static in static context REFER A11 belongs object
 *  2. SIB's are executed before main() and w/o object creation||called at loader, so no access to instance vars only static vars
 *  3. can be used to create object unlike IIB [NO CTE but HALTING]
 *  4. and that gives us better readability of the code
 */


public class A9 {
	static // SIB RUNS BEFORE MAIN() and runs as sequence if multiple!!!
	{
		System.out.println("From SIB"); // SIB runs before main() and it doesn't require any invoking stat and runs
												// w/o creating object
		test();
	}

	static void test() {
		
	}
	public static void main(String[] args) {
		//NO object created
	}
}
