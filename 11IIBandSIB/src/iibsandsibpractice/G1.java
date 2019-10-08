package iibsandsibpractice;

public class G1 {
	{
		System.out.println("IIB");
	}
	
	static {
		new G1();
		System.out.println("SIB");
		new G1();
	}
	
	public static void main(String[] args) {
		System.out.println("From main");
	}
}
