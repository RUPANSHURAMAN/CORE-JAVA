package p9;

// Inheriting local class members into static class is not possible
public class A {
	class C{
		int i = 10;
		static final int j = 10;
	}
	
	//			 $at $ ERROR No enclosing instance of type A is available due to some intermediate constructor invocation
	/*static class B extends C{ //ERROR
		
	}*/
	
	public static void main(String[] args) {
		System.out.println(C.j);//direct access by classname else need to create object of outer class
	}
}
