package abstractclass;
/* imvocsmm
 * in abstract class its mandat to write abstract on method but not for interface
 * abstract can have complete and incomplete
 * object of abstract class can't be created, ref var can be created 
 * multiple inheritance not possible for abstract class  
 */

public interface A {
	public void test();

	// public static void test7(); //ERROR as // * we cannot create static method in an interface as they cannot be inherited and 
										// if they are not inherited then we cannot override it but need to complete body

	
	// public static final int k; //ERROR as // * static and non-static var if not initialized will give us blank field error
	
	public static final int i = 10; // NO ERROR as initialized
}
