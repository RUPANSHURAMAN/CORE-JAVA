package classcastingdown1;

//NO COMPILE TIME ERROR but WILL GIVE RUN TIME ERROR
public class B extends A {

	int j = 20;

	public static void main(String[] args) {
		B b1 = (B) new A(); // ERROR at run-time ClassCastException //type of casting by which compile time
							// error is avoided but not run-time
		
		System.out.println(b1.i); // as above downcasting of user defined class, accessing a member becomes ruled out
		System.out.println(b1.j);
	}
}
