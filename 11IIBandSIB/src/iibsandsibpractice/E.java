package iibsandsibpractice;

public class E {
	static {
		System.out.println("SIB"); // 1
	}

	static {
		System.out.println("Hello"); // 2
		new E(); // 3
	}

	{
		System.out.println("IIB"); // 4 //6
	}

	public static void main(String[] args) {
		new E(); // 5
	}
}
