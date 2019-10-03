package abstractclasss;

public abstract class B implements A { // NO ERROR even if body of class left empty as abstract class can have
										// incompletet method inherited and stored as well

	// abstract mandat as abstract class
	public abstract void test1();

	// * we cannot make static method abstract in an abstract class as static not inherited e.g.
	// public abstract static void test3(); //ERROR as above given
}
