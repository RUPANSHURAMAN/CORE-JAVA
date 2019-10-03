package finalkeyword;

//* non static var if made final then it'sinitialization is mandatory or else we will get blank field ERROR
public class B {
	// final int i; //ERROR: BLANK FINAL FIELD
	// final static int k; //ERROR: BLANK FINAL FIELD again as it not matter if
								// static coz if its final not initialized error
	final int j = 10;

	public static void main(String[] args) {
		final int j; // NO ERROR as local final var can be non-initialized and later initialized
		// System.out.println(j); //ERROR as local final var not initialized
	}
}
