package finalkeyword;

/*
 * final keyword: 
 * 1. If you make a VARIABLE as final then we can never reinitialize is not possible
 * 2. * Non static and static var if made final then it's initialization is mandatory or else we will get BLANK FIELD ERROR 
      * NO ERROR as local final var can be non-initialized and later initialized
   4. A static or non-static method can be made final
 * 3. If you make an array as final then it's size can't be altered e.g. final int a[]= newint[4]; a = new int[3] //ERROR
 * 4. If you make a class as final then it's value can never be inherited
  	  final class (say M) can inherit members of non-final class (say L)
 * 5. public class N {
		// final int i; //ERROR as final var 
		}
 * 6. once you make a method as final we can never override that method
 * 		for method overriding we need to have same return type and args both should be same also for the same value it's true
 * 7. constructor() cannot be made final, only public, private and protected allowed	
 */

/*
 * STRING ARGS[]: 
 * 1. We can initialize size of args and give values to it by yourself REFER H class
 * 2. String args[] can;t be made static array //args = new String[3]; //ERROR
 * 		//String[] a = {"10", "we"}; args = a; //but can assign static array
 */

public class A {

	final static int j = 20;
	final int i = 50;
	
	A(){
		
	}
	
	final static void finalStaticMethod() { //final static method can be there
		
	}
	
	final static void finalMethod() { //final static method can be there
		
	}
	
	public static void main(String[] args) {
		final int i = 10;
		// i = 20; //ERROR as final variable can't be reinitialized
		// i = 10; //ERROR as even same value can't be also reinitialized

		// i++; //ERROR as once a var is made final it's value is IMPOSSIBLE to change
		System.out.println(i);
	}
}
