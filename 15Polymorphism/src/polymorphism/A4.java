package polymorphism;
//overloading: we create multiple methods with same name but then are differentiated on number and/or type of args, return type, applicable on static and non-static methods
//polymorphism is run time and compile time, as overrrdiing happens when .class file runs whereas compile time happens [during] .class file is being created
public class A4 {
	private static float test(float f) {
		System.out.println("test");
		return f;
	}

	public static void test(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		A4 a1 = new A4();
		a1.test(3);
		a1.test(3.5f);
	}
}
