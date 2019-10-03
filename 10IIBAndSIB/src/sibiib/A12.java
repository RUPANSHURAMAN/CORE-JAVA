package sibiib;

public class A12 {
	// SIB's are executed in the seq as written 
	
	static {
		System.out.println("From SIB - 1"); // 1
	}

	static {
		System.out.println("From SIB - 2"); // 2
	}

	public static void main(String[] args) {
		System.out.println("From main"); // 3
	}
}
