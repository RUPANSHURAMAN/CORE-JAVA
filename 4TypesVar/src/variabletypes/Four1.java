package variabletypes;

public class Four1 {
	static int i;
	static int j;

	public static void main(String[] args) {
		int k = 10;
		System.out.println(k);

		Four1 f1 = new Four1();
		f1.test();
	}

	public void test() {
		System.out.println(i);
		// System.out.println(f1.j); //ERROR as f1 ref var was local declared in main()
	}
}
