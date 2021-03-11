package p11;

// SIB (static initialization Block) can't be kept inside local inner class as static
public class A {

	class B{
		int i;
		/*static{ //ERROR as static block
			
		}
		*/
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = a1.new B();
		System.out.println(b1.i);
	}
}
