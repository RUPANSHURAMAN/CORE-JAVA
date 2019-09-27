package methods;

public class Six2 {
	public static void main(String[] args) {
		Six2 s2 = new Six2();// 1
		System.out.println("Main");// 2
		s2.test1();// 3
	}

	public void test1() {
		Six2 s2 = new Six2();// 4
		s2.test2();// 5
		System.out.println("test1");// 7
	}

	public void test2() {
		System.out.println("test2");// 6
	}
}
