package sibiib;

public class A8 {
	static int i;
	{
		i = 20; // it works with static also //we can initialize both static and non-static var both inside IIB's
		System.out.println(i); // A8.i not needed as instance var can be directly accessed inside IIB
	}

	public static void main(String[] args) {
		A8 a1 = new A8();
	}
}
