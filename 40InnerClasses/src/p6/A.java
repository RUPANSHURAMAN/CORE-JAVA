package p6;

/*
 * We can inherit the members of outer class into inner class and then we can access these members of outer 
 * class by creating object of inner class
 */
public class A {
	int i = 10;
	A(){
		
	}
	static int j=20;
	void test(){
		
	}
	
	static void test1(){
		
	}
	
	class B extends A{
		int j = 20;
	}
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = a1.new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
		b1.test();
		b1.test1();
	}
}
