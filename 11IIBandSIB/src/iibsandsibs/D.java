package iibsandsibs;

public class D {
	{
		System.out.println("IIB"); // 2
	}

	// START OF PGM
	static { 
		new D();// 1 //object can be created in SIB but not in IIB as run time error not CTE
		System.out.println("SIB"); // 4
	}

	D() {
		System.out.println("D"); // 3
	}

	public static void main(String[] args) {
		System.out.println("main");// 5
	}
}
