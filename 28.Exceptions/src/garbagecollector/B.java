package garbagecollector;
// What is the difference b/w final, finally and finalized??

public class B {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("From finalize");
	}

	public static void main(String[] args) {
		A a1 = new A();
		// a1 = null;
		System.gc(); // garbage collector is called but no O/p as a1 is not null so nothing to clear
	}
}
