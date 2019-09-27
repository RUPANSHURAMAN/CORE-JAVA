
public class G {
//if you create an object inside IIB you wil not get any error but program will halt abruptly
	{
		new G();
	}
	
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println("From main");
	}
}
