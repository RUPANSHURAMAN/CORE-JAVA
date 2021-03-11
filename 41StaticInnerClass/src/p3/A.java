package p3;

// We cannot create object of inner class and access members of outer class w/o inheritance
public class A {
	int i = 10;
	static int j = 20;
	static class B{
		
	}
	
	public static void main(String[] args) {
		B b1 = new B();
		//b1. //nothing accessible
		//System.out.println(b1.i); // ERROR as can't access outer members by creating object of inner class
	}
}
