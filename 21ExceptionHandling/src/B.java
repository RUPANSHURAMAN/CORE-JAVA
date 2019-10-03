//NullpointerException: If you are accessing members of the class with a null reference then we get NULLpointer exception
public class B {
	static B b1;
	int i = 10;

	public static void main(String[] args) {
		System.out.println(b1.i); // EXception as accessing null object member
		System.out.println("Completed");
	}
}
