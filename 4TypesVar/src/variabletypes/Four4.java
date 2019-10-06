package variabletypes;

public class Four4 {
	int i; // DEfault 0
	static int j; // Default 0

	public static void main(String[] args) {
		Four4 f4 = new Four4();
		System.out.println(f4.j);
		f4.test();
	}

	public static void test() {
		Four4 f4 = new Four4();
		int k = 0;
		System.out.println(k);
		System.out.println(f4.i);
	}
}
