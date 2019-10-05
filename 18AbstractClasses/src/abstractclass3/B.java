package abstractclass3;

public class B extends A{

	B(){//NECESSARY to add constructor as parent class doesn't have a no-args constructor
		super(100);
	}
	
	public static void main(String[] args) {
		B b1 = new B();
	}
}
