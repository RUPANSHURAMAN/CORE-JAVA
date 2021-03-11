package p1;

public class B extends A{ //Inheritance A->B, Import not required if the class is in same package
	public static void main(String[] args) {
		B b1 = new B();
		B b2 = (B) new A();
		System.out.println(b1.i);
	}
}
