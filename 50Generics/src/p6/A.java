package p6;

// Generics are only for non-static var not static var & same for static method not applicable
public class A<X> {
	//static X i; // ERROR as static
	X i; // CORRECT when static removed
	X j;
	A a1;		//$  $  at $ there are error as static at loc 5
	//public void X test() { //ERROR as static at line at loc 5
		//a1 = new A();
		//a1.i = 30.4f; // ERROR as stati cat loc 5
		//return i;// ERROR as static at loc 5
	//}
	
	/*public static X name() {
		//X i; //as at compile time can't use non-static X
	}*/
	
	public X name() { //Fine as non-static
		return i;
	}
}
