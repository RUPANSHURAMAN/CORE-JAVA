package methods2;

public class Seven4 {
	public static void main(String[] args) {
		Seven4 s4 = new Seven4();

		int i = s4.test();
		System.out.println(i);

		// OR

		System.out.println(s4.test()); // method calling stat can be inside SOP only when method is RETURNING value

	}

	public int test() {
		// whenever a method is returning value, the return type of method can never be void
		return 30;
	}
}
