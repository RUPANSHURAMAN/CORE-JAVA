package throws1;

public class D {

	public static void main(String[] args) {
		C c1 = new C();
		
		// c1.test(); //ERROR UNHANDLED EXCEPTION //* Whether a exception happens in a method or not, surrounfing calling stat in try{}catch() becomes mandat if throws keyword is used
		
		try {
			c1.test(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
