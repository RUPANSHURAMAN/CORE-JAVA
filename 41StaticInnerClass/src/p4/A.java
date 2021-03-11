package p4;

// We can access members of outer class by inheritance (SAME AS LOCAL INNNER CLASS)
public class A {
	int i  = 10;
	static int j =20;
	
	void test(){
		
	}
	
	static void test1(){
		
	}
	
	static class B extends A{//ERROR w/o static at loc:21
		
	}
	
	public static void main(String[] args) {
		B b1 = new B(); //ERROR if B inner class is not static 
		System.out.println(b1.i);
		System.out.println(b1.j);
		b1.test();
		b1.test1();
	}
}
