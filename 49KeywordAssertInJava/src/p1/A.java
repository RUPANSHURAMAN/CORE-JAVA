package p1;

/*
 * Assert(here we're talking about keyword, there is a seperate class): Assert helps us to check the business
 * conditions. Only if the business condition is true assert will continue the pgm execution bur if the 
 * condition is false then assert is not going to continue with its execution.
 * 
 * Assert was introduced in JDK v1.4
 * 
 * Steps to configure or enable assert:-
 * 1) Go to Run dropdown > Run config.... > Arguments > VM arguments type '-ea'(to enable assert)
 * 		To disable assert change '-ea' to '-da'
 */
public class A {
	A a1;
	int test(){
		//static int j = 10; ERROR as static can't be local
		a1 = new A();
		System.out.println(a1.test());
		final int j  =10;
		return j;
	}
	{
		a1 = new A();
		System.out.println(a1.test());
	}
	
	static{
		//a1 = new A();
		//System.out.println(a1.test());
	}
	
	A(){
		assert true;
		a1 = new A();
		System.out.println(a1.test());
	}
	public static void main(String[] args) {
		int age = 20;
		//a1 = new A();//Cannot make a static reference to the non-static field a1
		//System.out.println(a1.test());
		//assert age>20; //RUNTIME EXCEPTION as false condition during compile or ERROR when jdk not 1.7 set
		assert age>=20;
		//assert age; //ERROR as boolean value expected
		System.out.println("Register your self");
		
		//O/P
		//Register yourself
	}
}
