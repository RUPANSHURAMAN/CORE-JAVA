package superkeyword;

/*
 * constructor with arg 
 * *) if in a parent class there is only constructors with args then as a programmer we should explicitly write 
 * 			super keyword in child class constructor
 * *) super keyword is NOT auto kept when there are only args constructor in parent class where as super 
 * 			keyword will be placed auto when in the parent class there is a constructor with no args    
 */

class tion {
	tion(int i) { // if in a parent class there is only contructors with args then as a programmer
					// we should explicitly write super keyword in child class constructor
		System.out.println(i);
	}
}

public class I extends tion {
	I() {
		super(500); // ERROR without it as compiler not add arg super()
		// super(100); //ERROR as super second stat, need to be added if parent class constructor need to be called
		//super(); not added by compiler as there is a arg constructor in a parent class
		System.out.println("B");
	}

	public static void main(String[] args) {
		new I();
	}
}
