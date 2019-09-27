package classcasting2;

public class B extends A{

	public void xyz() {
		System.out.println("From xyz");
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		a1.test();
		//a1.xyz(); //ERROR same as upcasting not make access of child members
	}

}
