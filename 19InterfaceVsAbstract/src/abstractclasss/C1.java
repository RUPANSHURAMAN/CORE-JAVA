package abstractclasss;

public class C1 extends B1{

	int j = 10;
	//j =20; ERROR as can't initialize
	
	public static void main(String[] args) {
		C1 c = new C1();
		// accesiblty of non-static member comes into piture after object creation but the first initialization happends but second needs object creation
		c.i = 20;
		c.j = 30;
	}
}


//* SUMMARY
//interfaces can store only incomplete methods
//by dffault every method is abstract in an interface
//every var by default in an interface is public static and final
//multiple inheritance is supported in interfaces

//abstract class can consists of both complete and incomplete methods 
//every method by default is not abstract, we should use abstract keyword to specify incomplete method
// var by default is not final 
//multiple inheritance in abstract classes is not possible
//inheritance b/w an interface and abstract class is possible
