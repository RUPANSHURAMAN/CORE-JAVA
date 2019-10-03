package superkeyword;

class doc {
	doc(int i) {
		System.out.println(i);
	}

	doc(int i, int j) {
		System.out.println("From test");
	}

	doc() {
		System.out.println("called default");
		// ERROR must be there if this removed
	}

}

public class J extends doc {
	J() {// super() is added by compiler as no-arg constructor there in parent//works as
			// there is a constructor in parent class present
		//super(20); // add if default constructor of doc() is removed 
		System.out.println("B");
	}

	J(int i) {
		this();// super not added auto
		// super(); //ERROR as becomes second stat so super and this can't be used together inside the same constructor to 
						// call another constructor as either of the stat becomes second stat then we will get an error 
		// this RULE is applicable only to constructor call but can be used anytime for method and var access
		// if your child class constructor consists of this keyword then in that constructor super() will not be auto placed
		System.out.println(i);
	}

	public static void main(String[] args) {
		new J();
		new J(100);
	}
}
