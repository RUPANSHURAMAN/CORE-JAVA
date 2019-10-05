package throws1;

public class D {

	public static void main(String[] args) {
		A a1 = new A();
		
		// a1.test(); //ERROR UNHANDLED EXCEPTION //* Whether a exception happens in a method or not, surrounding calling stat in try{}catch() becomes mandat if throws keyword is used
		
		try {
			a1.test(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
