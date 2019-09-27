package classcasting3;

public class C extends B{

	public void aaa() {
		System.out.println("From aaa");
	}
	
	public static void main(String[] args) {
		B b1 = new C(); //inherited member are accessible or ref member but object class member can't be accessed
		b1.test();
		b1.xyz();
		// b1.aaa(); ERROR as objcet class member not accessible
	}
}
