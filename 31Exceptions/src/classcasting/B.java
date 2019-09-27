package classcasting;
/* *class cast
 * 1. Upcaasting: Here child object memory addr is stored in parent class ref var //in upcasting only parent class members are accessable bith static and non static and not child class members e.g. given below
 * 2. Downcasting: Instead of making the child object ref to be stored in parent class by mandat using downcasting operator (not compile-time error)
 * 					1. storing mem addr of parent class into child class ref var is called as downcasting. e.g. at classcastingdown1
 */
public class B extends A{
	int j =20;
	public static void main(String[] args) {
		A a1 = new B(); //Upcasting
		System.out.println(a1.i);
		//System.out.println(a1.j); //child class member are not accessin=ble with using upcasting as made A class
	}
}
