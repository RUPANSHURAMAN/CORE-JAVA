package classcasting5;

public class B extends A{

	public void test() {
		System.out.println("From test - B");
	}
	
	public static void main(String[] args) {
		A a1 = new B();
		a1.test(); //overriding method called i.e. this class test() not of class A
	}
}
