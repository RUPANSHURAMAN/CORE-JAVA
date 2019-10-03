//overloading here we create multiple methods with same but then they are differentiated based on number and/or type of args 
//polymorphism is run time and compile time, as overrrdiing happens when .class file runs whereas compile time happens [during] .class file is being created
public class A4 {
	private void test(float f) {
		System.out.println("test");
	}

	public void test(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		A4 a1 = new A4();
		a1.test(3);

	}
}
