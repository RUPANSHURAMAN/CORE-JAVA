package abstractclass2;

public class B extends A{
	
	public void test() {
		System.out.println("From test");
	}
	
	public static void main(String[] args) {
		A a1 = new B(); //CONTRUCTOR is called as super() addded by compiler as no-arg constructor added also
		a1.test(); //WORKS as child reference can access test()
	}

}
