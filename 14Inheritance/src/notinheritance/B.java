package notinheritance;

public class B {
	public static void main(String[] args) {
		A d = new A(); // NOTE: this is not inheritance
		System.out.println(d.i);

		d.test1();
		d.test2();
	}
}
