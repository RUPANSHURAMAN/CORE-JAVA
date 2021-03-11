package p3;

public class A {
	public static void main(String[] args) {

		int age = 100;
		try {
			assert age > 20;
			System.out.println("Register your self");
		} catch (AssertionError e) {
			System.out.println("You are to young to register");
		}
	}
}
