package methods;

public class Six3 {
	public static void main(String[] args) {
		Six3.test1();// 1 //static method
		System.out.println("HEllo");// 4
		Six3 s3 = new Six3();// 5
		s3.test2();// 6
		System.out.println("Hello");// 8
	}

	public static void test1() {
		System.out.println("test1");// 2
	}// 3

	public void test2() {
		System.out.println("test2");// 7
	}
}
