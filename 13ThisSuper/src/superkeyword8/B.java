package superkeyword8;

public class B extends A {
	B() {
		// super() is added by compiler as no-arg constructor there in parent
					//works as there is a constructor in parent class present
		//super(20); // add if default constructor of A() is removed 
		System.out.println("B");
	}

	B(int i) {
		this();// super not added auto
		// super(); //ERROR as becomes second stat so super and this can't be used together inside the same constructor to 
						// call another constructor as either of the stat becomes second stat then we will get an error 
		// this RULE is applicable only to constructor call but can be used anytime for method and var access
		// if your child class constructor consists of this keyword then in that constructor super() will not be auto placed
		System.out.println(i);
	}

	public static void main(String[] args) {
		new B();
		new B(100);
	}
}
