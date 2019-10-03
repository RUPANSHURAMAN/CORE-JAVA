package thiskeyword;

public class A2 {
	public static void main(String[] args) {
		A2 a1 = new A2();
		a1.test();
	}

	public void test() {
		int k = 30;
		// System.out.println(this.k); //ERROR as [this] keyword can' be used to access local var
	}
}
