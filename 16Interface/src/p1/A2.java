package p1;

public interface A2 {
// every method by default in an interface is not only abstract but also public and hence in the above program when you 
// remove the access specifier by default it becomes public and hence we do not get any error 

	abstract void test(); // NO ERROR as public appended by compiler

	// protected void test1();//ERROR as protected can't be access specifier of
	// private void test1();//ERROR as private can't be access specifier of test1()

	public void test1();// NO ERROR as public can be access specifier of test1() and abstract added

}
