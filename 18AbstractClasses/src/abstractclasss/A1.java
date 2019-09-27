package abstractclasss;
//static member can be accessed by abstract class name

public abstract class A1 { //ERROR if not abstract added

	public abstract void test(); //ERROR if abstract not used
	
	public void xyz() {
		System.out.println("xyz");
	}
}
