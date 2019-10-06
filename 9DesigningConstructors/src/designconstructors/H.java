package designconstructors;

public class H {
	
	// methods can have same name as that of class 
	// a constructor can never have return type
	int H() { // it's a method but it look like constructor but syntax is not wrong here
		System.out.println("H");
		return 30;
	}

	public static void main(String[] args) {
		// start
		H h1 = new H();
		System.out.println("main");
	}
}
