package sibiib;

public class A9 {
	static // SIB RUNS BEFORE MAIN() and runs as sequence if multiple!!!
	{
		System.out.println("From SIB"); // SIB runs before main() //and it doesn't require any invoking stat and runs
										// w/o creating object
	}

	public static void main(String[] args) {
		//NO object created
	}
}
