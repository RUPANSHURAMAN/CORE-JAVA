package constructors;
//MEDIOCRE
public class Eight6 {
	Eight6() {
		System.out.println("F");
	}

	Eight6(int i) {
		System.out.println(i);
	}

	Eight6(String x, int k) {
		System.out.println(x);
		System.out.println(k);
	}

	public static void main(String[] args) {
		Eight6 e = new Eight6();
		Eight6 e1 = new Eight6(100);
		Eight6 e2 = new Eight6("test", 10);
	}
}
