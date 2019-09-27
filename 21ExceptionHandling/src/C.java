
public class C {
	int i = 10;
	static C c1;
	public static void main(String[] args) {
		c1 = new C();
		System.out.println(c1.i);
	}
}
