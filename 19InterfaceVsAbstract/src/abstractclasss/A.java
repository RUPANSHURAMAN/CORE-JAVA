package abstractclasss;
 // * object of abstract class can be created // ref var can be created // abstract can have complete and incomplete //multiple inheritance not possible for abstract class //in abstract class its mandat to write abstract on method but not for interface
public interface A {
	public void test();
	
	//* we cannot create static method in an interface as they cannot be inherited and if they are not inherited then we cannot override it
	//public static void test7(); //ERROR as given above but need to complete body
	
	//* static and non-static var if not initialized will give us blank field error
	//public static final i; //ERROR as above
	public static final i = 10; //NO ERROR as initialized 
}
