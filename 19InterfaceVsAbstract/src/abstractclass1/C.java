package abstractclass1;

public class C extends B{

	int j = 10;
	//j =20; ERROR as can't initialize
	
	public static void main(String[] args) {
		C c = new C();
		
		// Accessibility of non-static member comes into picture after object creation but the first initialization happens but 
											//second needs object creation
		c.i = 20;
		c.j = 30;
		System.out.println(c.j);
	}
}

/* SUMMARY
 * interfaces can store only incomplete methods
 * by default every method is public, abstract in an interface
 * every var by default in an interface is public static and final
 * multiple inheritance is supported in interfaces
 * 
 * abstract class can consists of both complete and incomplete methods
 * every method by default is not abstract, we should use abstract keyword to specify incomplete method
 * var by default is not final 
 * multiple inheritance in abstract classes is not possible
 * inheritance b/w an interface and abstract class is possible
 */