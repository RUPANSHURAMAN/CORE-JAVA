package methods;

//DESIGNING GOOD METHODS
public class Six1 {
	public static void main(String[] args) {
		Six1 s6 = new Six1();
		//test(); // ERROR as MEthod not called, to call use object
		s6.test(); 
		System.out.println("From main");
	}

	public void test() {
		System.out.println("From test");
	}
}
