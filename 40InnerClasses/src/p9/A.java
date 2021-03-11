package p9;

// Inheritance b/w two local innner classes is possible
public class A {
	class B{
		int i = 10;
		void test(){
			
		}
	}
	
	class C extends B{
		int j = 20;
	}
	public static void main(String[] args) {
		A a1 = new A();
		C c1 = a1.new C();
		System.out.println(c1.i);
		System.out.println(c1.j);
		c1.test();
	}
}
