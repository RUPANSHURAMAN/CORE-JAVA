package p8;

// We can create more than one local inner class inside the same outer class
public class A {
	class B{
		int i = 10;
	}
	
	class C{
		int j = 20;
	}
	
	static class D{
		
	}
	
	final static class E{
		
	}
	
	/*abstract static final class G{ //ERROR either abstract or final
		
	}*/
	
	abstract class G{
		
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = a1.new B();
		System.out.println(b1.i);
		
		C c1 = a1.new C();
		System.out.println(c1.j);
	}
	
	/*
	 * When we complete above program we will get following 3 classes
	 * 	in /bin/	|
	 * 				 ---> A$B.class
	 * 				|
	 *  			 ---> A$C.class
	 *  			|
	 *  			 ---> A.class
	 *  
	 *  EDIT: A$B.class, A$C.class, A$D.class, A$E.class, A$G.class, A.class
	 *  but the above pgm will be saved as a single A.java file
	 *  			|
	 *  			 ---> A.java
	 *  
	 *  EDIT: A.java
	 */
}
