package sibiib;

public class A7 {
	static int j;
	int i;
	{
		i = 20;
		j = 30;
		System.out.println(i);
		System.out.println(j); // A7.i not needed as instance block, var can be directly accessed inside IIB
		System.out.println(A7.j); // ALSO CORRECT
	}

	public static void main(String[] args) {
		A7 a1 = new A7();
	}
}
