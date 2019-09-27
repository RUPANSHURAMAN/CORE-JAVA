package classcasting;
/* *class cast
 * 1. Upcaasting: Here child object memory addr is stored in parent class ref var //in upcasting only parent class members are accessable and not child class members e.g. given below
 * 2. Downcasting: 
 */
public class B extends A{
	int j =20;
	public static void main(String[] args) {
		A a1 = new B(); //Upcasting
		System.out.println(a1.i);
		//System.out.println(a1.j); //child class member are not accessin=ble with using upcasting as made A class
	}
}
