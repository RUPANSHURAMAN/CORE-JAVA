package inheritance2;

public class B extends A {
	public void test2() {
		System.out.println("test2");
	}

	public static void main(String[] args) {
		B j = new B();
		j.test(); // inherited from A , so during inheritance we can access inherited and also same class members which is of B
		j.test2(); 
	}
}
