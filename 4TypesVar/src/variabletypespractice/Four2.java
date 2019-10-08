package variabletypespractice;
//MEDIOCRE
public class Four2 {
	static int i;
	int j = 10;

	public static void main(String[] args) {
		Four2 f1 = new Four2();
		System.out.println(f1.j);
		f1.test();
	}

	public void test() {
		Four2 f1 = new Four2();
		System.out.println(f1.i);
	}
}
