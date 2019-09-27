package abstractclasss;

public class B4 extends A4{

	B4(){//NECESSARY to add constructor as parent class doesn't have a no-args constructor
		super(100);
	}
	
	public static void main(String[] args) {
		B4 b1 = new B4();
	}
}
