package thiskeyword;

/* 
 * call constructor using this keyword 
 * using this keyword we can call constructor of the same class but then 
 * do this [this] keyword should be very first stat inside another constructor
 */
public class B1 {
	B1() {
		//this(); //ERROR as recursive
		System.out.println("B");
	}

	B1(int i) {
		this();
		System.out.println(i);
		// this(); //ERROR as this() should be made first stat
	}

	public static void main(String[] args) {
		new B1(100);
	}
}
