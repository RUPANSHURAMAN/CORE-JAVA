package classcasting4;

public class B extends A{
	
	public static void main(String[] args) {
		A a1 = new B();
		a1.test(); // warning as static member accessed by ref
	}

}
