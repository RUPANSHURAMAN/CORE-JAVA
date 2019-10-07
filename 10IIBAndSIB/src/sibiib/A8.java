package sibiib;

public class A8 {
	int i;
	static int j;
	{
		i = 20; // it works with static also //we can initialize both static and non-static var both inside IIB's
		System.out.println(i); // object not needed as instance var can be directly accessed inside IIB
		System.out.println(A8.j); // or directly syso(j); 
	}

	public static void main(String[] args) {
		A8 a1 = new A8();
	}
}
