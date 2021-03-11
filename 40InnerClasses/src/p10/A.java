package p10;

// IIB can be created inside local inner class.
// Note: var created inside IIB is local not instance
public class A {
	class B{
		int i;
		
		{
			int k;
			i = 20;
			System.out.println(i);
		}
		
		{
			//k=20; as loca var decared in 1st IIB
			i = 10;
			System.out.println(i);
		}
		
		B(){
			System.out.println("Constructor");
		}
	// main method can't be in inner class as static main()	
	}

	public static void main(String[] args) {
		A a1 = new A();
		B b1 = a1.new B();
		System.out.println(b1.i);
		
		//O/P==> 
		//20
		//10
		//constructor 
		//10
	}
}
