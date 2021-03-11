package p1;

/*
 * GENERICS: A generic class helps us to create a variable s.t. any kind of value can be stored in the var
 * as the data type of value of the variable is decided based on the kind of value is stored in it.
 */
public class A<Z> {
	Z i;
	//static Z j;//ERROR as non-static ref Z can't be made static
	
	Z test(Z x){ 
		//Z y = 23; //ERROR as can't convert int to Z type at compile time(type mismatch)
		Z k;
		A a1 = new A();
		a1.i = 10;//FINE as creating object then initializing
		//init(k); //ERROR type mismatch in init() method
		System.out.println(x);
		return i;
	}
	
	private void init(Z k) {
		//i = 20; //ERROR type mismatch
	}

	/*static Z test1(){//ERROR as non-static ref Z can't be made static
		
	}*/
	
	A(){ //Constructor can be made
		Z k; //Can declare but not initialize as local can't be made MAY BE COZ ON RUNTIME WHICH METHOD IS CALLED
				//CAN'T BE DETERMINED as ON COMPILE TIME ALL REPLACEMENTS ARE DONE
		A a1 = new A(10); //same constructor can't be used as stack overflow
		a1.i = 10;//FINE as creating object then initializing
	}
	
	A(Z k){
		System.out.println(k);
	}
	
	{
		//A a1 = new A();//RUNTIME as creating object in IIB
		//a1.i = 10;//FINE as creating object then initializing
		Z k; //Can declare but not initialize as local can't be made
		System.out.println(i);//NO ERROR as non-static var and block also //PRINTS NULL not ERROR
	}
	
	static{
		//Z k; //Can't declare as static context
		//System.out.println(i); //cannot make a static reference to non-static var
	}
	public static void main(String[] args) {
		A a1 = new A(45);//45
		a1.i = 10.3;
		a1.i = 10;
		a1.i = 10.7f;
		a1.test(34);//34
		System.out.println(a1.i);//10.7
		
		/* O/P
		 * null
		 * 45
		 * null
		 * null
		 * 10
		 * 34
		 * 10.7
		 */
	}
}

/*
 * type erasure not allowed static as at run time not known what execution and local as depends if called, 
 * multiple types of same X can be created results in conflict and non-static is predicted and methods for them same thing
 * and type erasure keeps all data tures at compile time and all generics will have object method like getclass, wait etc
*/