package finalkeyword;
//final keyword: if you make a VARIABLE as final then we can never reinitialize is not possible 
public class A {

	public static void main(String[] args) {
		final int i = 10;
		//i = 20; //ERROR as final variable can't be reinitialized
		//i = 10; //ERROR as even same value can't be also reinitialized
		
		//i++; //ERROR as once a var is made final it's value is IMPOSSIBLE to change
		System.out.println(i);
	}
}
