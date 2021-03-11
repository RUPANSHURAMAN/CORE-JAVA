package p2;

public class B{
	public static void main(String[] args) {
		B b1 = new B();
		//System.out.println(b1.i);// ERROR: private [member] can't be accessed as not visible to other class
		//System.out.println(b1.j);// ERROR: private [member] can't be accessed as not visible to other class
	}
}
