package p7;

/*
 * Hashcode: Hashcode gives me the interger representation of objects in mem addreses
 */
public class A {

	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1); // p7.A@15db9742
		System.out.println(a1.hashCode()); // 366712642
		
		System.setErr(null);
		System.setOut(null);
		
		
	}
}

/*
 * System.out.println();
 * System: It is a class. (as methods are very much there)
 * out: It is static final PrintStream refernce var
 * println(); It is a non-static method.
 * 
 * Q. System.err?
 * A. For printing on error console in red
 * 
 * Q. System.setErr()?
 * A. It is used to reassign the "standard" error output stream.
 * 
 * Q. setProperties()?
 * A. It sets the properties of the system to the argument of properties.
 * 
 * Q. setOut?
 * used to reassign the "standard" output stream.
 */
