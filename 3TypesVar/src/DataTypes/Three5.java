package DataTypes;

public class Three5 {
	int i = 10; 
	
	/*
	 * static V/S non-static var
	 * non-static var are declared outside all methods but inside the class w/o
	 * non-static var can be accessed only after object creation
	 * it's not mandat to initialize non-static var, as if we don't initialized it auto gets some default value by compiler
	 * so static and non-static get default value but local var doesn't get default value
	 * object creation mandat for non-static var
	 * object creation not mandat for static var but can be accessed 
	 * IMP = but static doesn't go to object non-static to object, static to class, local to method belong particular area
	 */ 
	
	//  
	public static void main(String[] args) {
		Three5 t5 = new Three5();
		System.out.println(t5.i);
	}
}

class B2 {
	int k = 10;

	public static void main(String[] args) {
		// System.out.println(B2.k); //ERROR as object need to be created for non=static var as it's must be created
	}
}