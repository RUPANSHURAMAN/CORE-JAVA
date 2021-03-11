package p5;

// We can create a constructor inside a local inner class
public class A {
	class B{
		B(){
			System.out.println("From B");
		}
	}
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = a1.new B();
		
	}
}
