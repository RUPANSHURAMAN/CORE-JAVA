package abstractclasss;

public abstract class B1 {

	// a var in an abstract class is not final, immmediate changing of value of a
	// non-static var w/o creating an object is not possible
	// * for a non-static var value to change object creation mandat and so
	int i = 10;
	// i =20; ERROR can't change in abstarct class

}
