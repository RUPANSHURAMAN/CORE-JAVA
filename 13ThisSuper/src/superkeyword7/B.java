package superkeyword7;

/*
 * constructor with arg 
 * *) if in a parent class there is only constructors with args then as a programmer we should explicitly write 
 * 			super keyword in child class constructor else ERROR
 * *) super keyword is NOT auto kept when there are only args constructor in parent class where as super 
 * 			keyword will be placed auto when in the parent class there is a constructor with no args    
 */

public class B extends A{
	B() {
		super(500); // ERROR without it as compiler not add arg super()
		// super(100); //ERROR as super second stat, need to be added if parent class constructor need to be called
		//super(); not added by compiler as there is a arg constructor in a parent class
		System.out.println("B");
	}

	public static void main(String[] args) {
		new B();
	}
}
