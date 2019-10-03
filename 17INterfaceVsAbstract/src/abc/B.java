package abc;

public class B implements A{
	
	public static void main(String[] args) {
		System.out.println(A.i);
		
		//A a = new A(); //ERROR as A is interface
		
		//reference var of an interface can be created but then object cannot be created
		A a1 = new B();
		a1.test1();
	}

	@Override
	public void test1() {
		System.out.println("Test");
	}

}
