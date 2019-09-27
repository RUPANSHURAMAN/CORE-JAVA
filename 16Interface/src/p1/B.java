package p1;
//interfaces are  just like contract what a class gets into and the class should follow the contract i.e. incomplete method inherited from a interface should be completed in a class. //if you don't complete a method in a class then you will get an error// a class only keeps complete method// we inherit the member of interface which is incomplete and then we override it with a complete method in subclass from test


/*public class B implements A{

}*/ //ERROR as B doesn't implement 

public class B implements A{
	public void test() {
		System.out.println("From test");
		
	}
	
	public void xyz() {
		System.out.println("From xyz");
	}
	
	public static void main(String[] args) {
		B b =new B();
		b.test();
		b.xyz();
	}
}