package p1;
// If you make a class default then it can be accessed only in same package.

/*
 * main()
 * 1.PUBLIC: is made PUBLIC as JVM is calling it which is outside of class.
 * 		If private then JVM can't be call
 * 2.STATIC: main() is static as only called once and so multiple copies of main() are not required
 * 		NOTE: AnyTHING to be maintained as a single copy and multiple copies is not wanted then make it static
 * 3.VOID: as main() will not return value to JVM.
 *  
 */
class A {

}
