package p1;
/*
 * DEFAULT: If a constructor is made DEFAULT then its object can be created anywhere in the same package but 
 * then in diff package its object can't be created.
 * 
 * PROTECTED: If a constructor is made protected then its object can be created only in the same package and 
 * cannot create object in diff package PROTECTED== DEFAULT
 * e.g. same as of default
 * 
 * If you make constructor public then its object can be created in any package
 */
public class A {
	A(){
		System.out.println("From A constructor");
	}
	public static void main(String[] args) {
		A b = new A();
	}
}
