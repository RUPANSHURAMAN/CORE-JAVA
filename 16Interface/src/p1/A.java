package p1;

/*
 * 1. Interface: abstract (incomplete) interfaces are 100% abstract or 100% incomplete 
 * 2. Interfaces are just like contract what a class gets into and the class should follow the contract i.e.
 * 				incomplete method inherited from a interface should be completed in a class
 * 3. If you don't complete a method in a class then you will get an error, a class only keeps complete method
 * 4. We inherit the member of interface which is incomplete and then we override it with a complete
 * 5. Every method() ap by default in an interface is not only abstract but also public and hence in the above program when you
 * 				remove the access specifier by default it becomes public and hence we do not get any error
 * 6. Every var is psf in interface
 * 7. Static method can't be created
 * 8. 	// 1) we can never create object of interface, ref can be created
		// 2) we can never keep main() in an interface
 */

public interface A {
	
	public void test();
	
	
	/*
	 * public void xyz() {
	 * 
	 * }
	 */ // ERROR as it's a complete method in interface
}
