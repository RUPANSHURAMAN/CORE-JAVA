package p5;

/* We can create multiple static classes inside outer class (SAME AS LOCAL INNNER CLASS)
																	|
																	 ---->A$B.class
																	|
																	 ---->A$C.class
																	|
																	 ---->A.class
*/
public class A {
	static class B{
		int j = 20;
	}
	
	static class C{
		int i = 10;
	}
	
	public static void main(String[] args) {
		B b1 = new B();
		C c1 = new C();
		System.out.println(b1.j);
		System.out.println(c1.i);
	}
}
