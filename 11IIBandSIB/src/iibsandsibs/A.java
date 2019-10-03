package iibsandsibs;

public class A {
	{
		new A(); //RTE ERROR of stack overflow, not CTE
		System.out.println("IIB"); // 3
	}

	static {// START from SIB now not main(), object can be created in SIB but not in iib
		System.out.println("SIB"); // 1
	}

	public static void main(String[] args) {
		A a1 = new A(); // 2
	}
}
