package p2;

// inside static class we can create SIB, IIB, constructor.
public class A {
	static class B {
		static {
			System.out.println("SIB2");
		}
		
		static {
			System.out.println("SIB1");
		}

		B() {
			System.out.println("Constructor");
		}

		{
			System.out.println("IIB");
		}
	}
	
	public static void main(String[] args) {
		B b1 = new B(); //SIB2, SIB1, IIB, Constructor
	}
}
