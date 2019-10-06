package p1;

/* mvocsm (method-var, object-constructor, static, main)
 * 1. Interface: abstract (incomplete) interfaces .java are 100% abstract or 100% incomplete 
 * 2. Interfaces are just like contract what a class gets into and the class should follow the contract i.e.
 * 				incomplete method inherited from a interface should be completed in a class
 * 3. If you don't complete a method in a class then you will get an error, a class only keeps complete method
 * 4. We inherit the member of interface which is incomplete and then we override it with a complete
 * 
 * 5. Every method() ap by default in an interface , if you remove the access specifier by default it becomes 
 * 				public and hence we do not get any error, if not private, protected	
 * 6. Every var is PSF in interface
 * 7. Static method can't be created as they cannot be inherited and if they are not inherited then we cannot override refer 19.A
 * 8. Static var if not initialized will give us blank field error
 * 8. 	// 1) we can never create object of interface, ref can be created but child class members CAN'T be accessed refer 17.abc.B
		// 2) we cannot keep main(), cannot constructor in an interface as interface can't keep [anything complete]
 */

public interface A {
	
	// static int a; // BLANK FIELD ERROR as not initialized due to final default
	static int b = 10; // public static final by compiler
	int c=5; // made psf by compiler
	
	/* ERROR as constructor can't be created
	 * A(){
	 * 
	 * }
	 */
	
	public void test();
	
	// public static void test1(); //ERROR as they cannot be inherited and if they are not inherited then we cannot 
											// override it but need to complete body
	
	/*
	 * static void staticMethod() { //OWN NO ERROR in JAVA 8 but ERROR in JAVA 7
	 * 
	 * }
	 */
	
	/*
	 * public static void main(String[] args) {// ERROR in JAVA 7 but fine in JAVA 8
	 * 
	 * }
	 */
	
	/*
	 * public void xyz() {// ERROR as it's a complete method in interface for JAVA 7
	 * 
	 * }
	 */ 
}
