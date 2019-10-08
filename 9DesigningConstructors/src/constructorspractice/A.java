package constructorspractice;

public class A {

	// return type of constructor is always void hence we can use only return keyword in it 
		// e.g. next class but then we cannot return value
	
	A() { // void can't be there in front of constructor to method
		System.out.println("A");
		// return 30; //ERROR as return type of constructor is void
	}

	public static void main(String[] args) {
		A a1 = new A();
	}
}
