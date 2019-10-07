package classcasting4;

public class B extends A{
	
	static void test1() { //ERROR if test1() method is made test() as it will decrease the scope of test() in class A
		
	}
	
	public static void test() { //CORRECT but not static not inherited from class A, DOUBT? OK it's seperate copy of B class
		
	}

	public static void main(String[] args) {
		A a1 = new B();
		a1.test(); // warning as static member accessed by ref
	}

}
