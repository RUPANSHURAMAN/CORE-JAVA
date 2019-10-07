package thiskeyword;

//call constructor using this keyword
public class B {
	B() {
		System.out.println("B");
	}

	B(int i) {
		this(); // ALWAYS be this first stat in constructor //ERROR if made second
		System.out.println(i);
	}

	public static void main(String[] args) {
		new B(100);
		//this(); // only in constructor()
	}
}
