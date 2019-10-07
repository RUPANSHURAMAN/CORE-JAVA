package polymorphism;
//Polymorphism: = developing a feature s.t. it can take more than one form is called polymorphism

// OverRiding: inheritance mandatory for overriding (like in super keyword) after inheriting a method from parent class if 
						// you want to modify that inherited method, then we use the concept of overriding 
/* 1. overriding is applicable only on non-static methods, N/A on vars
 * 2. while overriding if you are increasing the scope of access specifier then it will not give any error
 * 3. overriding static methods it's not possible as not inherited
 */

public class A {

	int i = 10;

	public void test() {
		System.out.println("A");
	}
}
