package abstractclass;

public abstract class B implements A { // NO ERROR even if body of class left empty as abstract class can have
										// incomplete method inherited and stored as well

	// abstract mandat as abstract class
	public abstract void test1();


	//public abstract static void test3(); //ERROR as//* we cannot make static method abstract in abstract class static not 
												//inherited
}
