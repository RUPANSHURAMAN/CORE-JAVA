package throws1;

public class I {

	public static void main(String[] args) {
		H h1 = new H();
		try {
			h1.test();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
