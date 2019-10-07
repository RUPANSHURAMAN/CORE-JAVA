package classcasting;

/* 
 * *CLASS CAST: 
 * 1. Upcasting: 
 * 		*Here child object memory addr is stored in parent class ref var 
 * 	   		1. In upcasting only parent class members are accessable i.e. static and non static and not child class members e.g.
 * 			2. In upcasting OVERRIDING method will be called not OVERRIDEN method REFER classcasting5.B
 * 
 * 2. Downcasting: 
 * 		*Instead of making the child object ref to be stored in parent class by mandat using downcasting operator
 * 					(not CTE but RTE)
 * 			1. Storing mem addr of parent class into child class ref var is called as downcasting. e.g. at classcastingdown1
 * 			2. To perform successful downcasting we will firstly 
 * 				1. create object of parent class 
 * 				2. then create object of child class then do upcasting and then downcasting as shown in this package
 * 			3. both members are accessible
 */
public class B extends A {
	int j = 20;

	public static void main(String[] args) {
		A a1 = new B(); // Upcasting
		System.out.println(a1.i);
		// System.out.println(a1.j); //child class member are not accesseinble with using upcasting as made A class
	}
}
