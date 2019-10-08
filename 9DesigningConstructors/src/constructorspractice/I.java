package constructorspractice;

public class I {
	//METHOD
	void I() {
		System.out.println("I");
		return;
	}

	public static void main(String[] args) {
		// start
		I i = new I();
		System.out.println("main");
	}
}
