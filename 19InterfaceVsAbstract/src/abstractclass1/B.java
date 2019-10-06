package abstractclass1;

public abstract class B {

	final int m = 3;// a var in an abstract class is not final, we have to make final
	
	// * for a non-static var value to change, object creation mandat and so	
	int i = 10;
	// i =20; ERROR can't change in abstarct class

}
