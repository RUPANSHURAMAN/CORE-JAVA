package abstractclass2;

public class B3 extends A3{
	
	public void test() {
		System.out.println("From test");
	}
	
	public static void main(String[] args) {
		A3 a1 = new B3(); //CONTRUCTOR is called as super() addded by compiler as no-arg constructor added also
		a1.test(); //WORKS as child reference can access test()
	}

}
